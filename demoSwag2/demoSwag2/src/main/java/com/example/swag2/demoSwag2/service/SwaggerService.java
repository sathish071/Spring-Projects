package com.example.swag2.demoSwag2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.swag2.demoSwag2.model.Model;
import com.example.swag2.demoSwag2.repository.SwaggerRepo;

@Service
public class SwaggerService {
	
	@Autowired
	SwaggerRepo swegRepo;
	
	public Model addemp(Model model) {
		
		return swegRepo.save(model);
		
	}
	
	public Optional<Model> getDet(Long id){
		
		return swegRepo.findById(id);
		
	}
	
}
