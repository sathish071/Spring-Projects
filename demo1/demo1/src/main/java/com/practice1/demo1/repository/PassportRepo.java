package com.practice1.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice1.demo1.Model.Passport;
@Repository
public interface PassportRepo extends JpaRepository<Passport, Integer> {

}
