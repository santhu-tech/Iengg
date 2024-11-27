package com.kafka.transcation.CT_Transcation.Controller;

import com.kafka.transcation.CT_Transcation.Producer.TransactionProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    private final TransactionProducer producer;

    public TransactionController(TransactionProducer producer) {
        this.producer = producer;
    }

    @PostMapping("/publish")
    public String publishTransaction(@RequestParam String transactionId, @RequestBody String transactionDetails) {
        producer.sendTransaction(transactionId, transactionDetails);
        return "Transaction published successfully.";
    }
}