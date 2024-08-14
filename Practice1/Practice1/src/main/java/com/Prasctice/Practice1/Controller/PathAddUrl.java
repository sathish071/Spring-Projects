package com.Prasctice.Practice1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Prasctice.Practice1.Service.AddUrl;

@RestController
@RequestMapping("/PathAddUrl")
public class PathAddUrl {
	
	@Autowired
	AddUrl addUrl;
	
	@GetMapping("/addition")
	public int addition(@RequestParam(value="a") int x, @RequestParam(value="b") int y) {
		return addUrl.add(x, y);
	}
	
	@GetMapping("/pathVarb/{stdname}")
	public String pathVarb(@PathVariable String stdname) {
		return addUrl.name1(stdname);
	}

}
@RestController
@RequestMapping("/student")
class Path{
	@Autowired
	AddUrl addUrl;
	
	@GetMapping("/pathVarb1/{stdname}")
	public String pathVarb1(@PathVariable String stdname) {
		return addUrl.name1(stdname);
	}
	
}



