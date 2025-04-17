package com.hexa.sis;

public class Course {
    int courseId;
    String courseName;
    int courseCode;
    String instructorName;
	public Course(int courseId, String courseName, int courseCode, String instructorName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.instructorName = instructorName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseCode=" + courseCode
				+ ", instructorName=" + instructorName + "]";
	}
	
	void AssignTeacher(Teacher teacher) {
		System.out.println("Teacher assigned"+teacher );
	}
	void displayCourseInfo() {
	    System.out.println("Course ID: " + courseId);
	    System.out.println("Course Code: " + courseCode);
	    System.out.println("Course Name: " + courseName);
	    System.out.println("Instructor: " + instructorName);
	}
	void getEnrollments() {
	    System.out.println("Enrollments:"); 
	    System.out.println("Student: " + Enrollment.getStudent());
	    }
	void getTeacher() {
	        System.out.println("Teacher: " + Teacher.getName());
	}
	}
	

	