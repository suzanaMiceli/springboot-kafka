package br.com.suzana.messagingspringboot.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "topic1", groupId = "group-01")
    public void receiveMessage(String message){
        System.out.println("Consumer Message: " + message);
    }
}
