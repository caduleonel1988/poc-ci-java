package com.example.ci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PoCCiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PoCCiApplication.class, args);
		try {
			var mathService = context.getBean(com.example.ci.service.MathService.class);
			int result = mathService.sum(2, 3);
			System.out.println("Sum of 2 and 3 is: " + result);
		} finally {
			SpringApplication.exit(context);
		}
	}

}
