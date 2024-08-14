package com.example.queryPractice.demoDb.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.queryPractice.demoDb.bean.Emp;
import com.example.queryPractice.demoDb.service.EmpService;

@RestController
@RequestMapping("/EmpController")
public class EmpController {
	@Autowired
	EmpService empService;

	@PostMapping("/table")
	public Emp table(@RequestBody Emp emp) {

		return empService.createTable(emp);
	}

	@GetMapping("/getEmpId/{empId}")
	public Optional<Emp> getEmpId(@PathVariable(value = "empId") Long id) {
		return empService.getEmp(id);
	}

	@GetMapping("/getEmpId/{empId}")
	public Long getEmpId1(@PathVariable(value = "empId") Long id) {
		return id;
	}

}
