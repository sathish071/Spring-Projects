package com.demo.practice2.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//@Entity
public class Train {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trainNum;
	private String trainName;
	private String route;
	private int passengerTicketId;
	
	Train(){};
	
	public int getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(int trainNum) {
		this.trainNum = trainNum;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
//	public int getPassengerTicketNum() {
//		return passengerTicketNum;
//	}
//	public void setPassengerTicketNum(int passengerTicketNum) {
//		this.passengerTicketNum = passengerTicketNum;
//	}
	@Override
	public String toString() {
		return "Train [trainNum=" + trainNum + ", trainName=" + trainName + ", route=" + route + ", passengerTicketNum="
				+ "]";
	}
	
		
}
