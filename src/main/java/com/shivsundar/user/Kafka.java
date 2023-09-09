package com.shivsundar.user;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class Kafka {

    @KafkaListener(topics = "location-update-topic", groupId = "group-1")
    public void updateLocation(String value){
        System.out.println(value);
    }
}
