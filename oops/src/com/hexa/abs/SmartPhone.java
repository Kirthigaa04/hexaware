package com.hexa.abs;

public class SmartPhone extends Mobile {

	public SmartPhone(String model, String brand, double price) {
		super(model, brand, price);
		
	}

	@Override
	void showFeatures() {
		System.out.println("Good camera,Sound quality");
	}

	@Override
	String[] showAccessories() {
		String[] accessories= {"Screen Gaurd","Charger"};
		return showAccessories();
	}

}
