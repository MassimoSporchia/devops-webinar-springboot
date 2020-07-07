package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/hello-world")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("%s, Hello %s", counter.incrementAndGet(), name);
	}
	
	@GetMapping("/health")
	public String healthcheck() {
		return "Everything is OK!";
	}
}
