package com.Prasctice.Practice1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Prasctice.Practice1.Service.Practice1Service;

@RestController
@RequestMapping("/Calculator")
public class Practice1Controller {
	@Autowired
	Practice1Service ps;
	
	@RequestMapping("/addition")
	public String sName(@RequestParam(value = "name",required=true ) String name) {
		 return ps.stName(name);
	}
	
}
