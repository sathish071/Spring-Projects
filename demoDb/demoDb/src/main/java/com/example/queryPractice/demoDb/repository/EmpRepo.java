package com.example.queryPractice.demoDb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.queryPractice.demoDb.bean.Emp;
@Repository
public interface EmpRepo extends JpaRepository<Emp, Long>{

}
