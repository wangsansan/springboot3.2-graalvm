package com.example.springboot32;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Springboot32Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot32Application.class, args);
	}

}
