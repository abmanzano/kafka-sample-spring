package com.abmanzano.kafkasamplespring.consumer;

import com.abmanzano.kafkasamplespring.dto.Order;
import com.abmanzano.kafkasamplespring.util.Constants;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerCustom {

    @KafkaListener(
            topics = Constants.TOPIC_CUSTOM_EVENTS,
            groupId = Constants.CUSTOM_CONSUMER_GROUP_ID,
            containerFactory = "kafkaCustomListenerContainerFactory"
    )
    public void listenMessageCustom(Order message) {
        System.out.println("Received Message: " + message.printOrderSummary() + " in group: " + Constants.CUSTOM_CONSUMER_GROUP_ID);
    }
}
