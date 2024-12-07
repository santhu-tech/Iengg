package com.ct.redis.Subscriber;

import org.springframework.stereotype.Service;

@Service
public class RedisSubscriber {
    public void onMessage(String message) {
        System.out.println("Message received: " + message);
    }
}
