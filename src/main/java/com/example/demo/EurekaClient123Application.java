package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClient123Application {
	
	@RequestMapping("/")
	public String getMessage() {
		return "Hello how are you";
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient123Application.class, args);
	}

}
