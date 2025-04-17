package com.hexa.oops;

public class Employee {
	String empName;
	double salary;
	
	public Employee(String empName,double salary) {
		this.empName=empName;
		this.salary=salary;
	}
	void printDetails() {
		System.out.println("name"+empName);
		System.out.println("salary"+salary);
		
	}
	String greet() {
		return "Great Day"+empName;
	}

}

	
