package com.example.Practice.basicsPractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Practice.basicsPractice.Bean.Bean;
import com.example.Practice.basicsPractice.service.EmployeeService;

@RestController
@RequestMapping("/user")
public class EmpController {
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/getEmpList")
	public List<Bean> getListOfEmp() {
		return employeeService.empList();
	}

	@PostMapping("/empPost")
	public Bean postEmp(@RequestBody Bean emp) {

		System.out.println("id :  " + emp.getId());
		System.out.println("id :  " + emp.getName());
		return emp;
	}

}
