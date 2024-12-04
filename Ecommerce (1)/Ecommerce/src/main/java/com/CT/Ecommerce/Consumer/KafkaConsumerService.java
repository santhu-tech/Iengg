package com.CT.Ecommerce.Consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics ={ "orders","inventory"}, groupId = "group1", concurrency = "3")
    public void consumeOrders(ConsumerRecord<String, String> record) {
        System.out.println("Consumed from orders topic: " +
                "Key=" + record.key() +
                ", Value=" + record.value() +
                ", Partition=" + record.partition() +
                ", Offset=" + record.offset());
    }

    @KafkaListener(topics = {"payments","notifications"}, groupId = "group2", concurrency = "2")
    public void consumeInventory(ConsumerRecord<String, String> record) {
        System.out.println("Consumed from inventory topic: " +
                "Key=" + record.key() +
                ", Value=" + record.value() +
                ", Partition=" + record.partition() +
                ", Offset=" + record.offset());
    }
}
