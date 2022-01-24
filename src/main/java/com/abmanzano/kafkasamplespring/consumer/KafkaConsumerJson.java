package com.abmanzano.kafkasamplespring.consumer;

import com.abmanzano.kafkasamplespring.dto.Order;
import com.abmanzano.kafkasamplespring.util.Constants;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerJson {

    @KafkaListener(
            topics = Constants.TOPIC_JSON_EVENTS,
            groupId = Constants.JSON_CONSUMER_GROUP_ID,
            containerFactory = "kafkaJsonListenerContainerFactory"
    )
    public void listenMessageJson(Order message) {
        System.out.println("Received Message: " + message.printOrderSummary() + " in group: " + Constants.JSON_CONSUMER_GROUP_ID);
    }
}
