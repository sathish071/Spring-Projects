package com.Prasctice.Practice1.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Service
public class AddDemo {
	
	@GetMapping("/add")
	public int add() {
		int a = 20;
		int b= 20;
		
		return a+b;
	}
	
	@GetMapping("/mul")
	public int mul() {
		int a = 10;
		int b= 20;
		
		return a*b;
	}

}
