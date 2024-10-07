package com.demo.practice2.Bean;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

//@Entity
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passengerId;
	private String passengerName;
	private String passengerRoute;
	
	@OneToOne(mappedBy = "Passenger", cascade = CascadeType.ALL)
	private Train trainDetails;
	
	Passenger(){}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerRoute() {
		return passengerRoute;
	}

	public void setPassengerRoute(String passengerRoute) {
		this.passengerRoute = passengerRoute;
	}

	public Train getTrainDetails() {
		return trainDetails;
	}

	public void setTrainDetails(Train trainDetails) {
		this.trainDetails = trainDetails;
	}

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerName=" + passengerName + ", passengerRoute="
				+ passengerRoute + ", trainDetails=" + trainDetails + "]";
	}
	
}
