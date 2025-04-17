package com.studentInfo.model;

public class Enrollment {
       int enrollmentId;
	    int studentId;
	    int courseId;
	    int enrollmentDate;
		public Enrollment(int enrollmentId, int studentId, int courseId, int enrollmentDate) {
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
		public int getStudentId() {
			return studentId;
		}
		public int setStudentId(int studentId) {
			return studentId;
		}
		public int getCourseId() {
			return courseId;
		}
		public void setCourseId(int courseId) {
			this.courseId=courseId;
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
		
		
}


