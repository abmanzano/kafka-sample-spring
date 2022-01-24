package com.abmanzano.kafkasamplespring.serdes;

import com.abmanzano.kafkasamplespring.dto.Order;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class OrderSerializer implements Serializer<Order> {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        Serializer.super.configure(configs, isKey);
    }

    @Override
    public byte[] serialize(String s, Order order) {
        try {
            if (order == null){
                System.out.println("Null received at serializing Order");
                return null;
            }
            System.out.println("Serializing...");
            return objectMapper.writeValueAsBytes(order);
        } catch (Exception e) {
            throw new SerializationException("Error when serializing order to byte[]");
        }

    }

    @Override
    public byte[] serialize(String topic, Headers headers, Order data) {
        return Serializer.super.serialize(topic, headers, data);
    }

    @Override
    public void close() {
        Serializer.super.close();
    }
}
