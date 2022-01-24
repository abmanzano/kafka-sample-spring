package com.abmanzano.kafkasamplespring.serdes;

import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Serializer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

public class AvroSerializer<T extends SpecificRecordBase> implements Serializer<T> {

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        Serializer.super.configure(configs, isKey);
    }

    // Method using Binary Encoder
    // If you prefer to use JSON Encoder
    // JsonEncoder jsonEncoder = EncoderFactory.get().jsonEncoder(data.getSchema(), byteArrayOutputStream);
    @Override
    public byte[] serialize(String topic, T data) {
        byte[] bytes = new byte[0];

        if (data != null) {
            DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<>(data.getSchema());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            BinaryEncoder binaryEncoder = EncoderFactory.get().binaryEncoder(byteArrayOutputStream, null);
            try {
                datumWriter.write(data, binaryEncoder);
                binaryEncoder.flush();
                bytes = byteArrayOutputStream.toByteArray();
                System.out.println("Serializing...");
            } catch (IOException e) {
                System.out.println("Unable to serialize data " + e);
            }
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
