package com.kafka.transcation.CT_Transcation.Consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TransactionConsumer {

    @KafkaListener(topics = "transaction-topic", groupId = "transaction-group")
    public void consumeTransaction(ConsumerRecord<String, String> record) {
        System.out.println("Consumed from Partition: " + record.partition() +
                ", Offset: " + record.offset() +
                ", Key: " + record.key() +
                ", Value: " + record.value());
    }
}


//@Service
//public class TransactionConsumer {
//
//    @KafkaListener(topics = "transaction-topic", groupId = "transaction-group")
//    public void consumeTransaction(ConsumerRecord<String, String> record) {
//        System.out.println("Consumed transaction: Key = " + record.key() + ", Value = " + record.value());
//    }
//}

