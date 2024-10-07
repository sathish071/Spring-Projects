package com.example.microDemoHome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ControllerHome {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/home")
	public String home() {
		//return restTemplate.getForObject("http://localhost:8081/products", String.class) ;
		return restTemplate.getForObject("http://PRODUCTDEMO/products", String.class) ;
	}

}
