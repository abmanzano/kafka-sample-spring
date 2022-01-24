package com.abmanzano.kafkasamplespring.consumer;

import com.abmanzano.kafkasamplespring.dto.protobuf.Order;
import com.abmanzano.kafkasamplespring.util.Constants;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerProtobuf {

    @KafkaListener(
            topics = Constants.TOPIC_PROTOBUF_EVENTS,
            groupId = Constants.PROTOBUF_CONSUMER_GROUP_ID,
            containerFactory = "kafkaProtobufListenerContainerFactory"
    )
    public void listenMessageProtobuf(Order.OrderRequest message) {
        String summary = "Order{" +
                "id='" + message.getId() + '\'' +
                ", total=" + message.getTotal() +
                ", paid=" + message.getPaid() +
                ", date=" + message.getDate() +
                '}';

        System.out.println("Received Message: " + summary + " in group: " + Constants.PROTOBUF_CONSUMER_GROUP_ID);
    }
}
