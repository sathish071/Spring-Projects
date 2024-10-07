package com.SecurityPractice.demoSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.SecurityPractice.demoSecurity.beans.SignUpDto;
import com.SecurityPractice.demoSecurity.repository.SignInRepo;

//@Service
public class UserService  extends WebSecurityConfigurerAdapter{
	//@Autowired
	SignInRepo signInRepo;
	
	//@Autowired
	private PasswordEncoder passwordEncoder;

	public SignUpDto saveUser(SignUpDto signUpDto) {

		System.out.println("service");
		signUpDto.setPassword(passwordEncoder.encode(signUpDto.getPassword()));
		return signInRepo.save(signUpDto);

		
		
		
		
	}

}
