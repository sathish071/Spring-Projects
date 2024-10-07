package com.example.swag2.demoSwag2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.swag2.demoSwag2.model.Model;

@Repository
public interface SwaggerRepo extends JpaRepository<Model, Long>{

}
