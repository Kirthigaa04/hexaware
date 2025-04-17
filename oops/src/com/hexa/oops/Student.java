package com.hexa.oops;

public class Student {
		String studentName;
		String city;
		
		public static void main(String [] args) {
			Student student1=new Student();
			student1.studentName="Kirthi";
			student1.city="Chennai";
			System.out.println("name: "+student1.studentName);
			System.out.println("city: "+student1.city);
			
			Student student2=new Student();
			student2.studentName="Amarsri";
			student2.city="Bangalore";
			System.out.println("name: "+student2.studentName);
			System.out.println("city: "+student2.city);
		}

	}


