package com.hexa.sis;

public class Payment {
    int paymentId;
    int studentId;
    double amount;
    int paymentDate;
	public Payment(int paymentId, Student student, double amount, int paymentDate) {
		super();
		this.paymentId = paymentId;
		this.studentId = studentId;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public Student getStudentId() {
		return studentId;
	}
	public void setStudent(Student student) {
		this.studentId = studentId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(int paymentDate) {
		this.paymentDate = paymentDate;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", student=" + student + ", amount=" + amount + ", paymentDate="
				+ paymentDate + "]";
	}
	int getStudentId() {
	    return studentId;
	}

	double getPaymentAmount() {
	    return amount;
	}

	int getPaymentDate() {
	    return paymentDate;
	}

}