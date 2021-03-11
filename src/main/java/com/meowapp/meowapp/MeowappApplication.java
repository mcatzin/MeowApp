package com.meowapp.meowapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude=SecurityAutoConfiguration.class)
public class MeowappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeowappApplication.class, args);
	}

}
