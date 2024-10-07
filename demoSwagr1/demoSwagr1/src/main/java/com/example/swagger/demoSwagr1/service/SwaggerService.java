package com.example.swagger.demoSwagr1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.swagger.demoSwagr1.Model.Model;
import com.example.swagger.demoSwagr1.repository.SwaggerRepo;
@Service
public class SwaggerService {
	
	@Autowired
	SwaggerRepo swegRepo;
	
	public Model addemp(Model model) {
		
		return swegRepo.save(model);
		
	}
	
	public Optional<Model> getDet(long id){
		
		return swegRepo.findById(id);
		
	}
	
}
