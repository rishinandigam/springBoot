package com.firstHelloapp.helloapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloappApplication.class, args);
	}

	HelloController hc  = new HelloController();
}
