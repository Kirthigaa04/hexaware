package com.projectApp.dao;

import java.util.List;

import com.projectApp.exceptions.EmployeeNotFoundException;
import com.projectApp.exceptions.ProjectNotFoundException;
import com.projectApp.model.Employee;
import com.projectApp.model.Project;
import com.projectApp.model.Task;

public interface IprojectDao {
	
	
	List<Task> getAllTask();
	void assignProjectToEmployee(int projectId,int employeeId);
	
	void deleteEmployee(int employeeId) throws EmployeeNotFoundException;

	void deleteProject(int projectId) throws ProjectNotFoundException;
	
	void createProject(Project project);
	void createEmployee(Employee emp);
	void createTask(Task task);
	
}
