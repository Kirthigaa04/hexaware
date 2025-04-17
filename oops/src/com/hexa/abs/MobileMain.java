package com.hexa.abs;

public class MobileMain {

	public static void main(String[] args) {
		Mobile mobile=new SmartPhone("M32","Samsung",15000);
		mobile.printDetails();
		mobile.showFeatures();
		String[] accessories=mobile.showAccessories();
		for(String accessory:accessories)
			System.out.println(accessory);
		 
	
	mobile=new BasicPhone("N32","Nokia",1200);
	mobile.printDetails();
	mobile.showFeatures();
	accessories=mobile.showAccessories();
	for(String accessory:accessories)
		System.out.println(accessory);
	 }

}

