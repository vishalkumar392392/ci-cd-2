package com.deveops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {

	@GetMapping("/message")
	public String getMessage() {
		return "Hello World..";
	}
}
