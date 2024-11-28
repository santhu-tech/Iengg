package com.iEngg.controller;

//import com.javaiEngg.dto.Customer;
import com.iEngg.dto.Customer;
import com.iEngg.service.KafkaMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer-app")
public class EventController {

    @Autowired
    private KafkaMessagePublisher publisher;

    @GetMapping("/publish/{message}/{key}")
    public ResponseEntity<?> publishMessage(@PathVariable String message,
                                            @PathVariable String key) {
        /*try {
            publisher.sendMessageToTopic(key,message);
            return ResponseEntity.ok("message published successfully ..");
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }*/

        try {
            for (int i = 0; i <= 100000; i++) {
                publisher.sendMessageToTopic(key,message + " : " + i);
            publisher.sendMessageToTopic(key,message );
            }
            return ResponseEntity.ok("message published successfully ..");
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }

    @PostMapping("/publish")
    public void sendEvents(@RequestBody Customer customer) {
        publisher.sendEventsToTopic(customer);
    }


}
