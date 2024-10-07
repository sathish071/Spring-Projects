package com.example.demoSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demoSample.looseCoupling.LooseCoupling;
import com.example.demoSample.tightCoupling.Doctor;
import com.example.demoSample.tightCoupling.Engineer;
import com.example.demoSample.tightCoupling.Pilot;
import com.example.demoSample.tightCoupling.TightCoupling;


@SpringBootApplication
public class DemoSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSampleApplication.class, args);
		System.out.println("hiii");
//		TightCoupling tightCoupling = new TightCoupling(new Doctor(), new Engineer());
//		tightCoupling.disp();
		
		LooseCoupling looseCoupling = new LooseCoupling(new Pilot());
		looseCoupling.getDispl();
		
		LooseCoupling looseCoupling1 = new LooseCoupling(new Engineer());
		looseCoupling1.getDispl();
		
	}

}
