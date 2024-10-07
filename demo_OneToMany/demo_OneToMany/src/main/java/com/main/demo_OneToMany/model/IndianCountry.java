package com.main.demo_OneToMany.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;

@Entity
public class IndianCountry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int countryId;
	private String countryName;
	
	//(mappedBy = "indianCountry", cascade = CascadeType.ALL)
	//@JoinTable(name = "WorldTable",joinColumns = @JoinColumn(name="ind_Count_ID"),inverseJoinColumns = @JoinColumn(name="indStateID"))
	
	//@JoinColumn(name = "country",referencedColumnName = "indiaStateId")

	@OneToMany(mappedBy ="indianCountry",cascade = CascadeType.ALL)
	
	// this line i can change my own third table name,column name
	//@JoinTable(name = "IndStateTable",joinColumns = @JoinColumn(name ="IndCId"),inverseJoinColumns = @JoinColumn(name="IndSId"))
	private List<IndiaStates> indiaStates;
	
	public IndianCountry(){}

	public IndianCountry(int countryId, String countryName,List<IndiaStates> indiaStates) {
		this.countryId = countryId;
		this.countryName = countryName;
		this.indiaStates = indiaStates;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<IndiaStates> getIndiaStates() {
		return indiaStates;
	}

	public void setIndiaStates(List<IndiaStates> indiaStates) {
		this.indiaStates = indiaStates;
		for(IndiaStates ind : indiaStates) {
			ind.setIndianCountry(this);
		}
		
	}

	@Override
	public String toString() {
		return "IndianCountry [countryId=" + countryId + ", countryName=" + countryName + ", indiaStates=" + indiaStates
				+ "]";
	}
	

}






