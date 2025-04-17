package com.hexa.inheritance;

public class EmpMain {
	
	public static void main(String [] args) {
		Employee employee=new Employee("Kirthi",8000);
		employee.printDetails();
		System.out.println("in manager");
		Manager manager=new Manager("B",1000,"Bangalore");
		manager.printDetails();
		manager.showCity();
		
		
		
	}

}
