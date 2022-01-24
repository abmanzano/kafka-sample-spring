package com.abmanzano.kafkasamplespring.serdes;

import com.abmanzano.kafkasamplespring.dto.Order;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Deserializer;

import java.nio.charset.StandardCharsets;
import java.util.Map;

public class OrderDeserializer implements Deserializer<Order> {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        Deserializer.super.configure(configs, isKey);
    }

    @Override
    public Order deserialize(String s, byte[] bytes) {
        try {
            if (bytes == null){
                System.out.println("Null received at deserializing Order");
                return null;
            }
            System.out.println("Deserializing...");
            return objectMapper.readValue(new String(bytes, StandardCharsets.UTF_8), Order.class);
        } catch (Exception e) {
            throw new SerializationException("Error when deserializing byte[] to Order");
        }

    }

    @Override
    public Order deserialize(String topic, Headers headers, byte[] data) {
        return Deserializer.super.deserialize(topic, headers, data);
    }

    @Override
    public void close() {
        Deserializer.super.close();
    }
}
