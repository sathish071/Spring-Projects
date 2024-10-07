package com.example.swagger.demoSwagr1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.swagger.demoSwagr1.Model.Model;


@Repository
public interface SwaggerRepo extends JpaRepository<Model, Long>{

}
