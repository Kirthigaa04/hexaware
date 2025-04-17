package com.hexa.encap;

public class FlightMain {
	public static void main(String [] args) {
	Flight flight =new Flight();

	flight.setSource("Chennai");

	flight.setAvailableSeats (100);

	flight.setDestinstion("Bangalore");

	flight.setType("Business");

	flight.setNoOfPassengers (100);

	System.out.println(flight);
	
	Flight.companyName="Indigo";
	System.out.println(Flight.companyName);
	
	

	}

}
