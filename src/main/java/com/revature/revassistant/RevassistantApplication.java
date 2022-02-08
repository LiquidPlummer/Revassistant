package com.revature.revassistant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDateTime;

@SpringBootApplication(scanBasePackages = "com.revature.revassistant.beans")
public class RevassistantApplication {
	public static void main(String[] args) {
		SpringApplication.run(RevassistantApplication.class, args);

	}

}
