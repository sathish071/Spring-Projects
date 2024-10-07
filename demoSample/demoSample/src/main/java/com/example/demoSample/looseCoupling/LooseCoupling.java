package com.example.demoSample.looseCoupling;

import com.example.demoSample.tightCoupling.Job;

public class LooseCoupling {
	
	Job job;
	
	public LooseCoupling(Job job) {
		
		this.job = job;
		
	}
	
	public void getDispl() {
		
		job.display();
	}

}
