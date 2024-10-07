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
import com.demo.practice2.Bean.Tamilnadu;
import com.demo.practice2.repository.TamilnaduRepository;
import com.demo.practice2.service.TamilnaduService;

//@RestController
//@RequestMapping("/tnController")
public class TamilnaduController {
	
	@Autowired
	TamilnaduService tamilnaduService;;
	
	@PostMapping("/addUser")
	public Tamilnadu addEmpUser(@RequestBody Tamilnadu tamilnadu) {
		return tamilnaduService.addUser(tamilnadu);
	}
	@PutMapping("/updateUser")
	public Tamilnadu updateEmpUser(@RequestBody Tamilnadu beanClass) {
		return tamilnaduService.updateUser(beanClass);
	}
	@GetMapping("/viewUser")
	public List<Tamilnadu> viewEmpUser() {
		return tamilnaduService.viewAllUser();
	}
	@DeleteMapping("/deleteUser/{id}")
	public String deleteEmpUser(@PathVariable int id) {
		return tamilnaduService.deleteEmpUser(id);
	}
	
	

}






