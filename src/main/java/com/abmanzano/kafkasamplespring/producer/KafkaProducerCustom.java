package com.abmanzano.kafkasamplespring.producer;

import com.abmanzano.kafkasamplespring.dto.Order;
import com.abmanzano.kafkasamplespring.util.Constants;
import com.abmanzano.kafkasamplespring.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerCustom {

    @Autowired
    private KafkaTemplate<String, Order> customKafkaTemplate;

    public void sendMessage() {
        for (int i = 0; i < 1; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String id = "device-" + Utils.getRandomNumberInRange(1, 5);
            customKafkaTemplate.send(Constants.TOPIC_CUSTOM_EVENTS, id, Utils.getDummyOrder());
        }
    }
}
