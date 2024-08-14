package com.example.Practice.basicsPractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Practice.basicsPractice.Bean.Bean;
import com.example.Practice.basicsPractice.repository.EmpList;

@Service
public class EmployeeService {
	@Autowired
	EmpList empList;

	public List<Bean> empList() {

		return empList.getEmp();
	}

	public Bean postEmp(Bean emp) {
		System.out.println("id :  " + emp.getId());
		System.out.println("id :  " + emp.getName());
		
		return emp;
	}
}







