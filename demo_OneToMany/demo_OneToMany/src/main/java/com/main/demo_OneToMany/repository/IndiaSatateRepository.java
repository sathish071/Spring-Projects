package com.main.demo_OneToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.demo_OneToMany.model.IndiaStates;
@Repository
public interface IndiaSatateRepository extends JpaRepository<IndiaStates, Integer>{

}
