package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMain {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}