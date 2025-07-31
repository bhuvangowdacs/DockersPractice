package com.dockersapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dockersApp/v1")
public class MessageController {

	@GetMapping("/message")
	public String getMessage() {
		return "Hello World Bhuvan Gowda";
	}

}
