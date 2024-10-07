package com.example.swagger.demoSwagr1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.swagger.demoSwagr1.Model.Model;
import com.example.swagger.demoSwagr1.service.SwaggerService;

@RestController
@RequestMapping("/end")
public class SwaggerController {
	
	@Autowired
	SwaggerService swaggerService;
	
	@PostMapping("/addUser")
	public Model add(@RequestBody Model model) {
		return swaggerService.addemp(model);
	}
	
	@GetMapping("/getDetails/{}")
	public Optional<Model> getDetails(@PathVariable int id){
		return swaggerService.getDet(id);
	}


}
