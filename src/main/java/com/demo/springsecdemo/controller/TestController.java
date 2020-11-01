package com.demo.springsecdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Test APIs for authentication and authorization demo
 */
@RestController
public class TestController {

	@GetMapping("/all")
	public String getGreetingForAll() {
		return "Hello world";
	}

	@GetMapping("/user")
	public String getGreetingForUser() {
		return "Hello User";
	}

	@GetMapping("/admin")
	public String getGreeingForAdmin() {
		return "Hello Admin";
	}

}
