package com.kafka.transcation.CT_Transcation.Producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class TransactionProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public TransactionProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendTransaction(String transactionId, String transactionDetails) {
        kafkaTemplate.send("transaction-topic", transactionId, transactionDetails);
        System.out.println("Transaction sent: " + transactionId + " - " + transactionDetails);
    }
}
