package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		System.out.println("---------Hello-World-Application------------Main Method Start");
		SpringApplication.run(MyProjectApplication.class, args);
		System.out.println("---------Hello-World-Application------------Main Method End");
	}
}
