package com.example.queryPractice.demoDb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.queryPractice.demoDb.bean.Emp;
import com.example.queryPractice.demoDb.repository.EmpRepo;

@Service
public class EmpService {
	@Autowired
	EmpRepo empRepo;
	
	public Emp createTable(Emp emp) {
		return empRepo.save(emp);
	}
	
	public Optional<Emp> getEmp(Long id) {
		return empRepo.findById(id);
	}
}
