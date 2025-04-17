package com.studentInfo.dao;

import com.studentInfo.model.Course;
import com.studentInfo.model.Teacher;

public interface IstudentDao {
	public void EnrollInCourse(Course course);
	public void UpdateStudentInfo(String firstName, String lastName ,int dateOfBirth, String email, 
			String phoneNumber);
	public void MakePayment( double amount, String paymentDate);
	public void DisplayStudentInfo();
	public void GetEnrolledCourses();
	public void GetPaymentHistory();
	public void AssignTeacher(Teacher teacher);
	public void UpdateCourseInfo(String courseCode , String courseName, String instructor);
	public void DisplayCourseInfo();
	public void GetEnrollments();
	public void GetTeacher();
	public void EnrollmentGetStudentId();
	public void GetCourse();
	public void UpdateTeacherInfo(String name,String email, String expertise);
	public void DisplayTeacherInfo();
	public void GetAssignedCourses();
	public void paymentGetStudentId();
	public void GetPaymentAmount();
	public void GetPaymentDate();
	
	
	

}
