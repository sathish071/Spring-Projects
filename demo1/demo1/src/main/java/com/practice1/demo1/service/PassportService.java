package com.practice1.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice1.demo1.Model.Passport;
import com.practice1.demo1.Model.Person;
import com.practice1.demo1.repository.PassportRepo;
@Service
public class PassportService {
	
//	@Autowired
//	PassportRepo passportRepo; 
//	
//	public Passport addUser(Passport passport) {
//
//		passportRepo.save(passport);
//
//		return passport;
//	}
//	
//	public List<Passport> viewAllUser() {
//		return passportRepo.findAll();
//	}
//	
//	public String deleteUser(int id) {
//		passportRepo.deleteById(id);
//		
//		return "delete sucessfully";
//		
//	}
//	
//	public Passport updateUser(Passport passport) {
//
//		return passportRepo.save(passport);
//	}

}
