package com.busTicket.pojo;

public class Bus {

	private String busNumber;
	private String from;
	private String to;
	private double farePerPassenger;

	public Bus() {

	}

	public Bus(String busNumber, String from, String to, double farePerPassenger) {
		super();
		this.busNumber = busNumber;
		this.from = from;
		this.to = to;
		this.farePerPassenger = farePerPassenger;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public double getFarePerPassenger() {
		return farePerPassenger;
	}

	public void setFarePerPassenger(double farePerPassenger) {
		this.farePerPassenger = farePerPassenger;
	}

	
}
