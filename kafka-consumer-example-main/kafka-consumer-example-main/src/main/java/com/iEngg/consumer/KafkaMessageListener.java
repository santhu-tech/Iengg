package com.iEngg.consumer;

import com.iEngg.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "iEngg-demo-test",groupId = "iE-group")
    public void consumeEvents(Customer customer) {
        log.info("consumer consume the events {} ", customer.toString());
    }

//    @KafkaListener(topics = "iEngg-demo-test1",groupId = "iE-group")
//    public void consume2(String message) {
//        log.info("consumer2 consume the message {} ", message);
//    }
//
//    @KafkaListener(topics = "iEngg-demo-test2",groupId = "iE-group")
//    public void consume3(String message) {
//        log.info("consumer3 consume the message {} ", message);
//    }
//
//    @KafkaListener(topics = "iEngg-demo-test3",groupId = "iE-group")
//    public void consume4(String message) {
//        log.info("consumer4 consume the message {} ", message);
//    }
}
