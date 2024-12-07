package com.iEngg.Montoring.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MontoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MontoringApplication.class, args);
	}

}
//@RestController
//class SimpleController{
//	@GetMapping("/hello")
//	public String hello(){
//		return  "Welcome to Prometheus";
//	}
