package com.hexa.overriding;

public class overridingDemo {
	
	public static void main(String[] args) {
		TwoWheeler wheeler= new Bike("Rx","Bajaj",90000);
		wheeler.printDetails();
		wheeler.getMileage();
		String [] accessories = wheeler.showAcessories();
		for(String accessory:accessories)
			System.out.println(accessory);
		 wheeler =new Scooty("Activa","Mahindra",800000);
		wheeler.printDetails();
		wheeler.getMileage();
		 accessories = wheeler.showAcessories();
		for(String accessory:accessories);
		System.out.println();
	}

}