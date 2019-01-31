package com.example.portal;

import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	private HelloWorld hello;
	TestController(HelloWorld hello) {
		this.hello = hello;
	}
	@GetMapping("/get")
	public String get() {
		return hello.getMessage();
	}
}
