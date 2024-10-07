package com.SecurityPractice.demoSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SecurityPractice.demoSecurity.beans.SignUpDto;
import com.SecurityPractice.demoSecurity.service.UserService;

@RestController
@RequestMapping("/signpage")
public class WebPageController {
	
//	@Autowired
//	UserService userService;
	
//	@PostMapping("/signin")
//	public SignUpDto signIn(@RequestBody SignUpDto signUpDto) {
//		System.out.println("controller");
//		
//		return userService.saveUser(signUpDto);
//	}
	
	
	@GetMapping
	public String userAccess() {
		return "Hii User";
	}
	@GetMapping
	public String adminAccess() {
		return "Hii Admin";
	}
	
	
	
	
}
