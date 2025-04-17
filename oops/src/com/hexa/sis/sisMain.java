package com.hexa.sis;

public class sisMain {
    public static void main(String[] args) {
    	Student student=new Student(101, "Kiruthigaa", "R",2003, "kiru@gmail.com", "9876543210");
    	Course course = new Course(501, "Java Programming", 101, "Mr. Ravi");
    	Enrollment enrollment = new Enrollment(1001, student, course,2025);

    	
    }
        
        


}
