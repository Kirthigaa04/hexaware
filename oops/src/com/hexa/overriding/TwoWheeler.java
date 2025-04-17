package com.hexa.overriding;

public class TwoWheeler {
	String brand;
	String model;
	double price;

	public TwoWheeler(String brand, String model, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	void printDetails() {
		System.out.println("model"+model);
		System.out.println("brand"+brand);
		System.out.println("price"+price);
		
	}
	void getMileage() {
		System.out.println("Good");	
	}
	String[] showAccessories()
	{
		String[] Accessories= {"Seat","GLoves"};
		return Accessories;
		
	}
	String[] showAcessories() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
