package com.example.swag2.demoSwag2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.swag2.demoSwag2.model.Model;
import com.example.swag2.demoSwag2.service.SwaggerService;


@RestController
//@RequestMapping("/end")
public class SwaggerController {
	
	@Autowired
	SwaggerService swaggerService;
	
	@PostMapping("/addUser")
	public Model add(@RequestBody Model model) {
		return swaggerService.addemp(model);
	}
	
	@GetMapping("/getDetails/{id}")
	public Optional<Model> getDetails(@PathVariable Long id){
		return swaggerService.getDet(id);
	}


}
