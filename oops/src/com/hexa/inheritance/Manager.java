package com.hexa.inheritance;

public class Manager extends Employee {
	String city;
	
	public Manager(String employeeName,double salary,String city)
	{
		super(employeeName,salary);
		this.city=city;
	
	}
    public void showCity() {
		System.out.println("City:"+city);
	}
}