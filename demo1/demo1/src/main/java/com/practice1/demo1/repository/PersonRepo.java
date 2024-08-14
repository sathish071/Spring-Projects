package com.practice1.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice1.demo1.Model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {

}
