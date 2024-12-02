/*package com.CT.Ecommerce.Consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerGroup1 {

    @KafkaListener(topics = {"orders", "inventory"}, groupId = "group1")
    public void consumeGroup1(ConsumerRecord<String, String> record) {
        System.out.println("Group1 - Received: " + record.value() + " from partition: " + record.partition());
    }
}*/

