package com.hexa.inheritance;

public class Vehicle {
	String model;
	double price;
	
	 public Vehicle(String model,int price){
		this.model=model;
		this.price=price;
		
	}
	
	void printDetails() {
		System.out.println("model:"+model);
		System.out.println("price:"+price);
	}
}