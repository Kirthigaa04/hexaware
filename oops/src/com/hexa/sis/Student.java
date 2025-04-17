package com.hexa.sis;

public class Student {
    int studentId;
    String firstName;
    String lastName;
    int dateOfBirth;
    String email;
    String phoneNumber;
    
	public Student(int studentId, String firstName, String lastName, int dateOfBirth, String email,
			String phoneNumber) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
    void EnrollInCourse(Course course) {
    	System.out.println("Course enrolled:"+course);
    }
	
	void UpdateStudentInfo(String firstName, String lastName, int dateOfBirth, String email, 
			String phoneNumber) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.dateOfBirth=dateOfBirth;
		this.email=email;
		this.phoneNumber=phoneNumber;
		}
	void MakePayment(double amount,int paymentDate) {
		System.out.println("Amount:"+amount);
		System.out.println("Payment Date:"+paymentDate);}
		
		 void DisplayStudentInfo() {
			System.out.println("Student ID: " + studentId);
		    System.out.println("Name: " + firstName + " " + lastName);
		    System.out.println("DOB: " + dateOfBirth);
		    System.out.println("Email: " + email);
		    System.out.println("Phone: " + phoneNumber);
		}
		 
		 void getEnrolledCourses() {
			    System.out.println("Enrolled Courses:");
			        System.out.println(Enrollment.getCourse().getCourseName());
			    }
		 
		 void getPaymentHistory() {
			    System.out.println("Payment History:");
			        System.out.println("Amount: " + Payment.getPaymentAmount() + ", Date: " + Payment.getPaymentDate());
			    }
}

	