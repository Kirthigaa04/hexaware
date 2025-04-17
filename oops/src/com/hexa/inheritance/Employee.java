package com.hexa.inheritance;

public class Employee {
	String employeeName;
	double salary;
	
	public Employee(String employeeName,double salary) {
		super();
		this.employeeName=employeeName;
		this.salary=salary;
		
	}
   public	void printDetails(){
		System.out.println("EmployeeName:"+employeeName);
		System.out.println("Salary:"+salary);

}
}
