package com.studentInfo.model;
public class Payment {
    int paymentId;
    int studentId;
    double amount;
    String paymentDate;
	public Payment(int paymentId, int student, double amount, String paymentDate) {
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
	public int getStudentId() {
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
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", student=" + studentId + ", amount=" + amount + ", paymentDate="
				+ paymentDate + "]";
	}

	}

