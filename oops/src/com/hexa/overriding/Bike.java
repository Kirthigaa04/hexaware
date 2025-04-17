package com.hexa.overriding;

public class Bike extends TwoWheeler {

	public Bike(String model, String brand, double price) {
		super(model, brand, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getMileage() {
		System.out.println("Okayish");
	}

	@Override
	String[] showAcessories() {
		// TODO Auto-generated method stub
		String[] Accessories= {"Seat","GLoves","Helmet","DashCam"};
		return Accessories;
	}
	
}

	
	


