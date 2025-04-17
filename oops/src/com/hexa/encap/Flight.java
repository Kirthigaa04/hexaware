package com.hexa.encap;

public class Flight {
	private int noOfPassengers;
	private String type;
	private String flightName;
	private int availableSeats;
	private String source;
	private String destinstion;
	static String companyName;
	public Flight() {
		super();}
	public void setNoOfPassengers(int passengers) {
		this.noOfPassengers=passengers;
	}
	
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
		return type;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestinstion() {
		return destinstion;
	}
	public void setDestinstion(String destinstion) {
		this.destinstion = destinstion;
	}
	public void setFlightName(String name) {
		this.flightName=name;
	}
	public String getFlightName() {
		 return flightName;
	}
	@Override
	public String toString() {
		return "Flight [noOfPassengers=" + noOfPassengers + ", type=" + type + ", flightName=" + flightName
				+ ", availableSeats=" + availableSeats + ", source=" + source + ", destinstion=" + destinstion + "]";
	}
	
	


}