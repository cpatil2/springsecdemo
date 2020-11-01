package com.demo.springsecdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/somereadapi")
	public String getString() {
		
		
		return "Hello world";
	}
}
