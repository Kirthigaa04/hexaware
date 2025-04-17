package com.hexa.inheritance;

public class VehicleMain{
	public static void main(String [] args){
		Vehicle vehicle=new Vehicle("RX100",90000);
		vehicle.printDetails();
		Car car =new Car("Swift",1200000,"Music");
        car.printDetails();
        car.showAccessories();
		
	}

}
