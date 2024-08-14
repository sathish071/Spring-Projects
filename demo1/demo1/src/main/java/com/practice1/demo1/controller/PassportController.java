package com.practice1.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice1.demo1.Model.Passport;
import com.practice1.demo1.Model.Person;
import com.practice1.demo1.service.PassportService;

@RestController
@RequestMapping("/passportControl")
public class PassportController {
	
	
//	@Autowired
//	PassportService passportService;
//	
//	@PostMapping("/addUser")
//	public Passport addEmpUser(@RequestBody Passport passport) {
//		return passportService.addUser(passport);
//	}
//	
//	@GetMapping("/viewUser")
//	public List<Passport> viewEmpUser() {
//		return passportService.viewAllUser();
//	}
//	@DeleteMapping("/deleteUser")
//	public String deleteEmpUser(@PathVariable int id) {
//		
//		return passportService.deleteUser(id);
//	}
//	
//	@PutMapping("/updateUser")
//	public Passport updateEmpUser(@RequestBody Passport passport) {
//		return passportService.addUser(passport);
//	}
//	
}
