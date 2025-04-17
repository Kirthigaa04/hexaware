package com.hexa.overriding;


public class Scooty extends TwoWheeler {


    public Scooty(String model, String brand, double price) {
        super(model, brand, price);
    }

    @Override
	void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Very Good");
	}
	@Override
	String[] showAcessories() {
		// TODO Auto-generated method stub
		String[] Accessories= {"Seat","GLoves","Music"};
		return Accessories;
	}
	
}
