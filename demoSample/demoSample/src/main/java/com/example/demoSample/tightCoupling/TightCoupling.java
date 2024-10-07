package com.example.demoSample.tightCoupling;


public class TightCoupling  {
	
	Doctor doctor;
	Engineer engineer;
	public TightCoupling(Doctor doctor, Engineer engineer) {
		this.doctor = doctor;
		this.engineer = engineer;
	}
	
	public void disp() {
		doctor.display();
		engineer.display();
		
	}
	
	

}
