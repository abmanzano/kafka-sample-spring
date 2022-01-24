package com.abmanzano.kafkasamplespring.config;

import com.abmanzano.kafkasamplespring.util.Constants;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class KafkaSampleConfig {

    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, Constants.KAFKA_IP_PORT);
        return new KafkaAdmin(configs);
    }

    @Bean
    public NewTopic topicStrEvents() {
        return new NewTopic(Constants.TOPIC_STRING_EVENTS, 1, (short) 1);
    }

    @Bean
    public NewTopic topicJsonEvents() {
        return new NewTopic(Constants.TOPIC_JSON_EVENTS, 1, (short) 1);
    }

}
