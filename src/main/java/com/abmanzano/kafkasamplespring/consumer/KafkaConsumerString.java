package com.abmanzano.kafkasamplespring.consumer;

import com.abmanzano.kafkasamplespring.util.Constants;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerString {

    @KafkaListener(
            topics = Constants.TOPIC_STRING_EVENTS,
            groupId = Constants.STRING_CONSUMER_GROUP_ID,
            containerFactory = "kafkaStrListenerContainerFactory"
    )
    public void listenMessageStr(String message) {
        System.out.println("Received Message: " + message.substring(0, 100) + " in group: " + Constants.STRING_CONSUMER_GROUP_ID);
    }
}
