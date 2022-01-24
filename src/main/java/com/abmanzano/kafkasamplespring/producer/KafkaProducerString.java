package com.abmanzano.kafkasamplespring.producer;

import com.abmanzano.kafkasamplespring.util.Constants;
import com.abmanzano.kafkasamplespring.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.SerializationUtils;

@Service
public class KafkaProducerString {

    @Autowired
    private KafkaTemplate<String, String> strSerKafkaTemplate;

    public void sendMessage() {
        for (int i = 0; i < 1; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String id = "device-" + Utils.getRandomNumberInRange(1, 5);

            // TODO: Uncomment this code if you want to print the size of the object serialized
            //  with Spring before publishing it to Kafka
            /*System.out.println("SERIALIZING WITH SPRING UTILS");
            byte[] data = SerializationUtils.serialize(Utils.getDummyOrder());
            System.out.println("Spring serializer. Message size in bytes is: " + data.length);*/

            strSerKafkaTemplate.send(Constants.TOPIC_STRING_EVENTS, id, Utils.getDummyOrder().toString());
        }
    }
}
