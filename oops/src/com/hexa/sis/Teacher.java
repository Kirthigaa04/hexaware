package com.hexa.sis;

public class Teacher {
    int teacherId;
    String firstName;
    String lastName;
    String email;
	public Teacher(int teacherId, String firstName, String lastName, String email) {
		super();
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}
	
	void updateTeacherInfo(String firstName,String lastName, String email, String expertise) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.email = email;
	}

	void displayTeacherInfo() {
	    System.out.println("Teacher ID: " + teacherId);
	    System.out.println("Name: " + firstName+ " " +lastName);
	    System.out.println("Email: " + email);
	}

	void getAssignedCourses() {
	    System.out.println("Assigned Courses:");
	        System.out.println("" + Course.getCourseName());
	}
}