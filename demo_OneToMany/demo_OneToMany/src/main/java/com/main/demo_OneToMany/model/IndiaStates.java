package com.main.demo_OneToMany.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class IndiaStates {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int indStateId;
	private String stateName;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "referenceID")
	@JsonIgnore
	private IndianCountry indianCountry;
	
	//public IndiaStates() {}

	public int getIndiaStateId() {
		return indStateId;
	}

	public void setIndiaStateId(int indiaStateId) {
		this.indStateId = indiaStateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public IndianCountry getIndianCountry() {
		return indianCountry;
	}

	public void setIndianCountry(IndianCountry indianCountry) {
		this.indianCountry = indianCountry;
	}

	@Override
	public String toString() {
		return "IndiaStates [indiaStateId=" + indStateId + ", stateName=" + stateName + ", indianCountry="
				+indianCountry + "]";
	}

	
	
}







