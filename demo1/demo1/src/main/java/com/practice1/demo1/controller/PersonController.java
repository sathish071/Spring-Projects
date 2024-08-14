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

import com.practice1.demo1.Model.Person;
import com.practice1.demo1.service.PersonService;


@RestController
@RequestMapping("/personController")
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@PostMapping("/addUser")
	public Person addEmpUser(@RequestBody Person person) {
		return personService.addUser(person);
	}
	
	@GetMapping("/viewUser")
	public List<Person> viewEmpUser() {
		return personService.viewAllUser();
	}
	@DeleteMapping("/deleteUser/{id}")
	public String deleteEmpUser(@PathVariable int id) {
		
		return personService.deleteUser(id);
	}
	@PutMapping("/updateUser")
	public Person updateEmpUser(@RequestBody Person person) {
		return personService.addUser(person);
	}
	

}
