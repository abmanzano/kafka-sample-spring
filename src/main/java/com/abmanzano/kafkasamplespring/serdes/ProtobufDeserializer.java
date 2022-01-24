package com.abmanzano.kafkasamplespring.serdes;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Deserializer;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class ProtobufDeserializer<T extends Message> implements Deserializer<T> {

    protected Parser<T> parser;

    public ProtobufDeserializer(Class<T> cls) {
        try {
            this.parser = (Parser<T>) cls.getMethod("parser").invoke(null);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new SerializationException("Error when deserializing byte[] to object of type Protobuf Message.", e);
        }
    }

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        Deserializer.super.configure(configs, isKey);
    }

    @Override
    public T deserialize(String s, byte[] bytes) {
        if (bytes != null) {
            try {
                System.out.println("Deserializing...");
                return parser.parseFrom(bytes);
            } catch (InvalidProtocolBufferException e) {
                System.out.println("Unable to parse bytes[] " + e);
            }
        }
        return null;
    }

    @Override
    public T deserialize(String topic, Headers headers, byte[] data) {
        return Deserializer.super.deserialize(topic, headers, data);
    }

    @Override
    public void close() {
        Deserializer.super.close();
    }
}
