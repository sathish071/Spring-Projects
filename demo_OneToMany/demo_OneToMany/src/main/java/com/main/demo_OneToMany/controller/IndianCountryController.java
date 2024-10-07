package com.main.demo_OneToMany.controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.demo_OneToMany.model.IndianCountry;
import com.main.demo_OneToMany.service.IndianCountryService;

@RestController
@RequestMapping("/IndCountryController")
public class IndianCountryController {
	
	@Autowired
	IndianCountryService indianCountryService;
	@PostMapping("/add")
	public IndianCountry add(@RequestBody IndianCountry indianCountry) {

		return indianCountryService.addUser(indianCountry);
	}
	
	@GetMapping("/view")
	public List<IndianCountry> viewAll() {
		return indianCountryService.viewAllUser();
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		indianCountryService.deleteUser(id);
		return "delete sucessfully";
	}
	
	@PostMapping("/update")
	public IndianCountry update(@RequestBody IndianCountry indianCountry) {

		return indianCountryService.updateUser(indianCountry);
	}


}
