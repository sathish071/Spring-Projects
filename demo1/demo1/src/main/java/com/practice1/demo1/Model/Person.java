package com.practice1.demo1.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personid;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fid", referencedColumnName="id")
	private Passport passport;
	
	public Person() {}
	public Person(int personid, String name, Passport passport) {
		super();
		this.personid = personid;
		this.name = name;
		this.passport = passport;
	}
	public int getId() {
		return personid;
	}
	public void setId(int id) {
		this.personid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	@Override
	public String toString() {
		return "Person [id=" + personid + ", name=" + name + ", passport=" + passport + "]";
	}
	
	
	
	
}
