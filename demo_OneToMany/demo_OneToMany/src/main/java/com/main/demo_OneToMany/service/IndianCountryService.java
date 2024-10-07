package com.main.demo_OneToMany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.demo_OneToMany.model.IndianCountry;
import com.main.demo_OneToMany.repository.IndianCountryRepository;

@Service
public class IndianCountryService {
	
	@Autowired
	IndianCountryRepository indianCountryRepository;

	public IndianCountry addUser(IndianCountry indianCountry) {

		return indianCountryRepository.save(indianCountry);
	}

	public List<IndianCountry> viewAllUser() {
		return indianCountryRepository.findAll();
	}

	public String deleteUser(int id) {
		indianCountryRepository.deleteById(id);

		return "delete sucessfully";

	}
	
	public IndianCountry updateUser(IndianCountry indianCountry) {

		return indianCountryRepository.save(indianCountry);
	}



}
