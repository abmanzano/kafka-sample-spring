package com.abmanzano.kafkasamplespring.consumer;

import com.abmanzano.avro.model.Order;
import com.abmanzano.kafkasamplespring.util.Constants;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerAvro {

    @KafkaListener(
            topics = Constants.TOPIC_AVRO_EVENTS,
            groupId = Constants.AVRO_CONSUMER_GROUP_ID,
            containerFactory = "kafkaAvroListenerContainerFactory"
    )
    public void listenMessageAvro(Order message) {
        String summary = "Order{" +
                "id='" + message.getId() + '\'' +
                ", total=" + message.getTotal() +
                ", paid=" + message.getPaid() +
                ", date=" + message.getDate() +
                '}';

        System.out.println("Received Message: " + summary + " in group: " + Constants.AVRO_CONSUMER_GROUP_ID);
    }
}
