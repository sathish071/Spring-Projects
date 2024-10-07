package com.demo.practice2.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
//@Entity
public class ChiefMinister {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cmId;
	private String name;
	private int validity;
	
	@OneToOne(mappedBy = "cm")
	private Tamilnadu tamilnadu;
	
	public ChiefMinister() {}
	
	public ChiefMinister(int cmId, String name, Tamilnadu tamilnadu, int validity) {
		this.cmId = cmId;
		this.name = name;
		this.tamilnadu = tamilnadu;
		this.validity = validity;
	}

	public int getCmId() {
		return cmId;
	}

	public void setCmId(int cmId) {
		this.cmId = cmId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Tamilnadu getState() {
		return tamilnadu;
	}

	public void setState(Tamilnadu state) {
		this.tamilnadu = state;
	}

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	@Override
	public String toString() {
		return "ChiefMinister [cmId=" + cmId + ", name=" + name + ", state=" + tamilnadu + ", validity=" + validity + "]";
	}
	
}
