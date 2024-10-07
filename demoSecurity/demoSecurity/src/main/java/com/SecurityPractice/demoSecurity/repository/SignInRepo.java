package com.SecurityPractice.demoSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.SecurityPractice.demoSecurity.beans.SignUpDto;

//@Repository
public interface SignInRepo extends JpaRepository<SignUpDto, Long>{
	SignUpDto findByUserName(String userName);

}
