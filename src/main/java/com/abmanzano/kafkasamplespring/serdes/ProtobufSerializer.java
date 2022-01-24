package com.abmanzano.kafkasamplespring.serdes;

import com.google.protobuf.Message;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class ProtobufSerializer<T extends Message> implements Serializer<T> {


    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        Serializer.super.configure(configs, isKey);
    }

    @Override
    public byte[] serialize(String s, T data) {
        byte[] bytes = new byte[0];

        if (data != null) {
            System.out.println("Serializing...");
            bytes = data.toByteArray();
        }
        return bytes;
    }

    @Override
    public byte[] serialize(String topic, Headers headers, T data) {
        return Serializer.super.serialize(topic, headers, data);
    }

    @Override
    public void close() {
        Serializer.super.close();
    }
}
