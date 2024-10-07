package com.example.microDemoProduct.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerProduct {
	
	
	@GetMapping("/products")
	public String product() {
		return "products";
	}

}
