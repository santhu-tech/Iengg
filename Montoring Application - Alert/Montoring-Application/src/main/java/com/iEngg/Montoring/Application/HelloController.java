package com.iEngg.Montoring.Application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private int count = 0;

    @GetMapping("/hello")
    public String hello() {
        count++;
        return "Hello, world! Count: " + count;
    }
}

