package com.deveops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {

	@GetMapping("/message")
	public String getMessage() {
		return "Hello World.....";
	}

	@GetMapping("/course")
	public String course() {
		return "Deveops course 2";
	}

	@GetMapping("/api")
	public String api() {
		return "New API";
	}
}
