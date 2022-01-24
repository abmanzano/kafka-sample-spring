package com.abmanzano.kafkasamplespring.controller;

import com.abmanzano.kafkasamplespring.producer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka-rest")
public class KafkaSampleController {

    @Autowired
    private KafkaProducerString kafkaProducerStr;

    @Autowired
    private KafkaProducerJson kafkaProducerJson;

    @Autowired
    private KafkaProducerAvro kafkaProducerAvro;

    @Autowired
    private KafkaProducerCustom kafkaProducerCustom;

    @Autowired
    private KafkaProducerProtobuf kafkaProducerProtobuf;


    @PostMapping(value = "/publishStr")
    public void sendStrMessageToKafkaTopic() {
        kafkaProducerStr.sendMessage();
    }

    @PostMapping(value = "/publishJson")
    public void sendJsonMessageToKafkaTopic() {
        kafkaProducerJson.sendMessage();
    }

    @PostMapping(value = "/publishAvro")
    public void sendAvroMessageToKafkaTopic() {
        kafkaProducerAvro.sendMessage();
    }

    @PostMapping(value = "/publishCustom")
    public void sendCustomMessageToKafkaTopic() {
        kafkaProducerCustom.sendMessage();
    }

    @PostMapping(value = "/publishProtobuf")
    public void sendProtobufMessageToKafkaTopic() {
        kafkaProducerProtobuf.sendMessage();
    }
}
