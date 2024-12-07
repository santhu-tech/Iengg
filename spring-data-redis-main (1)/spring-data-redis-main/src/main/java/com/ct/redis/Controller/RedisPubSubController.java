package com.ct.redis.Controller;

import com.ct.redis.Publisher.RedisPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisPubSubController {

    @Autowired
    private RedisPublisher redisPublisher;

    @GetMapping("/publish")
    public String publishMessage(@RequestParam String message) {
        redisPublisher.publishMessage("my-channel", message);
        return "Message published!";
    }
}
