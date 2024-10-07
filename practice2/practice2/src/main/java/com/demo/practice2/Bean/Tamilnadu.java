package com.demo.practice2.Bean;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

//@Entity
public class Tamilnadu {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cmIdCardNumber;
	private String tamilnaduStateCode;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="chiefMinister_Id", referencedColumnName = "cmId")
	private ChiefMinister cm;
	
	
	public Tamilnadu(){}
	
	public Tamilnadu(String tamilnaduStateCode, ChiefMinister cm, int cmCardNumber) {
		this.tamilnaduStateCode = tamilnaduStateCode;
		this.cm = cm;
		this.cmIdCardNumber = cmCardNumber;
	}
	
	public String getTamilnaduStateCode() {
		return tamilnaduStateCode;
	}
	public void setTamilnaduStateCode(String tamilnaduStateCode) {
		this.tamilnaduStateCode = tamilnaduStateCode;
	}
	public ChiefMinister getCm() {
		return cm;
	}
	public void setCm(ChiefMinister cm) {
		this.cm = cm;
	}
	public int getCmCardNumber() {
		return cmIdCardNumber;
	}
	public void setCmCardNumber(int cmCardNumber) {
		this.cmIdCardNumber = cmCardNumber;
	}
	@Override
	public String toString() {
		return "Tamilnadu [tamilnaduStateCode=" + tamilnaduStateCode + ", cm=" + cm + ", cmCardNumber=" + cmIdCardNumber
				+ "]";
	}
	
}
