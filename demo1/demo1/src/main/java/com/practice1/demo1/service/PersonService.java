package com.practice1.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice1.demo1.Model.Passport;
import com.practice1.demo1.Model.Person;
import com.practice1.demo1.repository.PersonRepo;

@Service
public class PersonService {

	@Autowired
	PersonRepo personRepo;

	public Person addUser(Person person) {

		personRepo.save(person);

		return person;
	}

	public List<Person> viewAllUser() {
		return personRepo.findAll();
	}

	public String deleteUser(int id) {
		personRepo.deleteById(id);

		return "delete sucessfully";

	}
	
	public Person updateUser(Person person) {

		return personRepo.save(person);
	}


}
