package com.CT.Ecommerce.Controller;

import com.CT.Ecommerce.Producer.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    private ProducerService producerService;

    @PostMapping("/publish/{topic}")
    public String publishMessage(@PathVariable String topic, @RequestBody String message) {
        producerService.sendMessage(topic, message);
        return "Message sent to topic: " + topic;
    }
}
