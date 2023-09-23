package com.example.backend01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Backend01Application {

	@GetMapping("/health")
	String getHealth() {
		return "Working!";
	}

	@GetMapping("/api/auth/test")
	String getTest() { return "Test!"; }

	public static void main(String[] args) {
		SpringApplication.run(Backend01Application.class, args);
	}

}
