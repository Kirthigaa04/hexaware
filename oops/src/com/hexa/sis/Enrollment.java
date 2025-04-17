package com.hexa.sis;

public class Enrollment {
    int enrollmentId;
    Student studentId;
    Course courseId;
    int enrollmentDate;
	public Enrollment(int enrollmentId, Student studentId, Course courseId, int enrollmentDate) {
		super();
		this.enrollmentId = enrollmentId;
		this.studentId = studentId;
		this.courseId = courseId;
		this.enrollmentDate = enrollmentDate;
	}
	public int getEnrollmentId() {
		return enrollmentId;
	}
	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
	public Student getStudentId() {
		return studentId;
	}
	public void setStudentId(Student studentId) {
		this.studentId = studentId;
	}
	public Course getCourseId() {
		return courseId;
	}
	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}
	public int getEnrollmentDate() {
		return enrollmentDate;
	}
	public void setEnrollmentDate(int enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	@Override
	public String toString() {
		return "Enrollment [enrollmentId=" + enrollmentId + ", studentId=" + studentId + ", courseId=" + courseId
				+ ", enrollmentDate=" + enrollmentDate + "]";
	}
	
	Student getStudent() {
	    return studentId;
	}

	 Course getCourse() {
	    return courseId;
	}

}