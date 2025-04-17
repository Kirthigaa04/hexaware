package com.training.emp;

import java.util.ArrayList;
import java.util.List;

public class EmpMain {
	public static void main(String [] args) {
	    Employee emp1=new Employee("Kirthi",1,"Chennai",10000000);
		Employee emp2=new Employee("Amar",2,"Theni",700000);
		Employee emp3=new Employee("Ashwin",3,"Hosur",90000000);
		Employee emp4=new Employee("Jeevitha",4,"Ooty",6700000);
		Employee emp5=new Employee("Machu",5,"Bangalore",8300000);
		
		List<String> employeeList=new ArrayList<>();
		employeeList.add(emp1);
	    employeeList.add(emp2);
	    employeeList.add(emp3);
	    employeeList.add(emp4);
	    employeeList.add(emp5);
	   System.out.println(employeeList);
	    	

 }}
 