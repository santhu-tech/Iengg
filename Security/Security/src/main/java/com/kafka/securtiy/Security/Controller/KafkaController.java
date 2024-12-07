package com.kafka.securtiy.Security.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public KafkaController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        kafkaTemplate.send("my-topic", message);
        return "Message sent to Kafka: " + message;
    }

    @GetMapping("/consume")
    public String consumeMessage() {
        // This could be replaced with logic to consume the message from the topic
        // KafkaListener will handle message consumption automatically
        return "Consume a message from Kafka (this would be implemented as a listener)";
    }
}