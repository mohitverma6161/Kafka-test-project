package com.example.kafkademoimpl.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "kafka_test_Topic", groupId = "testGroup")
    public void listenToTopic(String receivedMessage){
        System.out.println("The message received is "+receivedMessage);
    }
}
