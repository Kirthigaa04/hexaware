package com.hexa.inheritance;

public class Car extends Vehicle {
	String accessories;
	
	public Car(String model,int price,String accessories) {
	super(model,price);
	this.accessories=accessories;
	
	}
	void showAccessories() {
		System.out.println(accessories);
		}

}
