package com.Prasctice.Practice1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Prasctice.Practice1.Service.AddDemo;
@RestController
@RequestMapping("/controller")
public class ControllerDemo {
	@Autowired
	AddDemo addDemo;
	
	@RequestMapping("/add")
	public int add() {
		return addDemo.add();
	}
	@RequestMapping("/prod")
	public int mul() {
		return addDemo.mul();
	}
	
}
