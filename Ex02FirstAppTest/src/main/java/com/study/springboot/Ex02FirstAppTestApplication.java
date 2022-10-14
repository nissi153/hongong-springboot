package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ex02FirstAppTestApplication {

	public static void main(String[] args) {
		System.out.println("Hello Springboot");
		SpringApplication.run(Ex02FirstAppTestApplication.class, args);
	}

}
