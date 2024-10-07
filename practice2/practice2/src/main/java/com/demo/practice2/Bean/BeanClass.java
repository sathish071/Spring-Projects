package com.demo.practice2.Bean;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BeanClass {
	
	private int id;
	private String name;
	//@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
	//private Date dob;
	private String dob1;
	//private List<Post> post;
	
	public BeanClass(){}

	public BeanClass(int id, String name, String dob1) {
		this.id = id;
		this.name = name;
		this.dob1 = dob1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob1;
	}

	public void setDob(String dob1) {
		this.dob1 = dob1;
	}

	@Override
	public String toString() {
		return "BeanClass [id=" + id + ", name=" + name + ", dob1=" + dob1 + "]";
	}

//	public List<Post> getPost() {
//		return post;
//	}
//
//	public void setPost(List<Post> post) {
//		this.post = post;
//	}

	
	
	
	
}