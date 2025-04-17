package com.projectApp.client;

import com.projectApp.model.Employee;
import com.projectApp.model.Project;
import com.projectApp.model.Task;

import java.util.List;

import com.projectApp.dao.IprojectDao;
import com.projectApp.dao.projectDaoImp;
import com.projectApp.exceptions.EmployeeNotFoundException;
import com.projectApp.exceptions.ProjectNotFoundException;

public class Client {
	public static void main(String [] args) {
		IprojectDao projectDao=new projectDaoImp();
		Employee emp=new Employee(1,"Kirthi","Developer","Female",800000.0,2);
		Project project=new Project(2,"Robot","Machine Learning","12-09-2025","Test");
		Task task=new Task(1,"Database",108,3,"Completed");
		projectDao.createProject(project);
		projectDao.createEmployee(emp);
		projectDao.createTask(task);
   	    try {
			projectDao.deleteEmployee(4);
		} catch (EmployeeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			projectDao.deleteProject(102);
		} catch (ProjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		projectDao.assignProjectToEmployee(102, 1);
		
		
	}}
