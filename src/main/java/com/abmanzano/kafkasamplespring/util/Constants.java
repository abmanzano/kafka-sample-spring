package com.abmanzano.kafkasamplespring.util;

public class Constants {

    public static final String KAFKA_IP_PORT = "192.168.1.68:9092";

    public static final String TOPIC_STRING_EVENTS = "string-events";
    public static final String STRING_CONSUMER_GROUP_ID = "string-consumer-group";

    public static final String TOPIC_JSON_EVENTS = "json-events";
    public static final String JSON_CONSUMER_GROUP_ID = "json-consumer-group";

    public static final String TOPIC_AVRO_EVENTS = "avro-events";
    public static final String AVRO_CONSUMER_GROUP_ID = "avro-consumer-group";

    public static final String TOPIC_CUSTOM_EVENTS = "custom-events";
    public static final String CUSTOM_CONSUMER_GROUP_ID = "custom-consumer-group";

    public static final String TOPIC_PROTOBUF_EVENTS = "protobuf-events";
    public static final String PROTOBUF_CONSUMER_GROUP_ID = "protobuf-consumer-group";
}
