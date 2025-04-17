package com.studentInfo.model;

public class Student {
	    int studentId;
	    String firstName;
	    String lastName;
	    String dateOfBirth;
	    String email;
	    String phoneNumber;
	    
		public Student(int studentId, String firstName, String lastName, String dateOfBirth, String email,
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

		public String getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(String dateOfBirth) {
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
}

		