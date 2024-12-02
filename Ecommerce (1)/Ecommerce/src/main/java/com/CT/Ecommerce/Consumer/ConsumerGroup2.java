/*package com.CT.Ecommerce.Consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerGroup2 {

    @KafkaListener(topics = {"payments", "notifications"}, groupId = "group2")
    public void consumeGroup2(ConsumerRecord<String, String> record) {
        System.out.println("Group2 - Received: " + record.value() + " from partition: " + record.partition());
    }
}*/
