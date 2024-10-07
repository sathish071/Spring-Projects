package com.demo.practice2.controller;

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

import com.demo.practice2.Bean.BeanClass;
import com.demo.practice2.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/addUser")
	public BeanClass addEmpUser(@RequestBody BeanClass bean) {
		return userService.addUser(bean);
	}
	@PutMapping("/updateUser")
	public String updateEmpUser(@RequestBody BeanClass beanClass) {
		return userService.updateUser(beanClass);
	}
	@GetMapping("/viewUser")
	public List<BeanClass> viewEmpUser() {
		return userService.viewUser();
	}
	@DeleteMapping("/deleteUser/{id}")
	public String deleteEmpUser(@PathVariable int id) {
		return userService.deleteEmpUser(id);
	}
	
}
