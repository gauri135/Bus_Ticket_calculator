package com.busTicket.pojo;

public class Passenger {
     
	private int numberOfPassengers;
	private String[] passengerNames = new String[numberOfPassengers];
	private int[] age;
	private String isChild;
	
	public Passenger() {

	}

	public Passenger(int numberOfPassengers, String[] passengerNames, int[] age, String isChild) {
		super();
		this.numberOfPassengers = numberOfPassengers;
		this.passengerNames = passengerNames;
		this.age = age;
		this.isChild = isChild;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public String[] getPassengerNames() {
		return passengerNames;
	}

	public void setPassengerNames(String[] passengerNames) {
		this.passengerNames = passengerNames;
	}

	public int[] getAge() {
		return age;
	}

	public void setAge(int[] age) {
		this.age = age;
	}

	public String getIsChild() {
		return isChild;
	}

	public void setIsChild(String isChild) {
		this.isChild = isChild;
	}

	

	
}
