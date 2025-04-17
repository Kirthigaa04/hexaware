package com.projectApp.model;

public class Employee {
	private int employeeId;
    private String name;
    private String designation;
    private String gender;
    private double salary;
    private int projectId;
	public Employee(int employeeId, String name, String designation, String gender, double salary, int projectId) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.designation = designation;
		this.gender = gender;
		this.salary = salary;
		this.projectId = projectId;
		
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int EmployeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + employeeId + ", name=" + name + ", designation=" + designation + ", gender=" + gender
				+ ", salary=" + salary + ", projectId=" + projectId + "]";
	}
    
    

}
