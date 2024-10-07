package com.example.sect.sect.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/user")
	public String user() {
		return "Hii User";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Hii Admin";
	}
	
	
}
