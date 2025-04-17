package com.projectApp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.projectApp.exceptions.EmployeeNotFoundException;
import com.projectApp.exceptions.ProjectNotFoundException;
import com.projectApp.model.Employee;
import com.projectApp.model.Project;
import com.projectApp.model.Task;
import com.projectApp.util.DbConnectionUtil;

public class projectDaoImp implements IprojectDao {
static  Connection connection;

	@Override
	public void createEmployee(Employee emp) {
		String sql="insert into employee(employee_id, employee_name, designation, gender, salary, project_id) values(?,?,?,?,?,?)";
		connection=DbConnectionUtil.getConnection();
	     PreparedStatement statement=null;
	     
	     try {
			statement=connection.prepareStatement(sql);
			statement.setInt(1,emp.getEmployeeId());
			statement.setString(2, emp.getName());
			statement.setString(3, emp.getDesignation());
			statement.setString(4, emp.getGender());
			statement.setDouble(5, emp.getSalary());
			statement.setInt(6, emp.getProjectId());
			
				statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	@Override
	public void createProject(Project project) {
		String sql="insert into Project( project_id int primary key ,project_name varchar(20),description varchar(20),start_date varchar(20),status varchar(20)) values (?,?,?,?,?)" ;
		connection=DbConnectionUtil.getConnection();
	     PreparedStatement statement=null;
	     try {
				statement=connection.prepareStatement(sql);
				statement.setInt(1,project.getProjectId());
				statement.setString(2,project.getProjectName());
				statement.setString(3,project.getDescription());
				statement.setString(4,project.getStartDate());
				statement.setString(5,project.getStatus());
				statement.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					statement.close();
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
		
	@Override
	public void createTask(Task task) {
		String sql="insert into Task values(?,?,?,?,?)";
		connection=DbConnectionUtil.getConnection();
	     PreparedStatement statement=null;
	     try {
				statement=connection.prepareStatement(sql);
				statement.setInt(1,task.getTaskId());
				statement.setString(2, task.getTaskName());
				statement.setInt(3, task.getProjectId());
				statement.setInt(4, task.getEmployeeId());
				statement.setString(5, task.getStatus());
				statement.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					statement.close();
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}

	public void deleteEmployee(int employeeId) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		connection =DbConnectionUtil.getConnection();
		String sql="delete from employee where employee_id = ?";
		String sql1="delete from task where employee_id = ?";
		PreparedStatement statement = null;
		PreparedStatement statement1 = null;
		try {
			statement1 = connection.prepareStatement(sql1);
			statement1.setInt(1, employeeId);
			statement1.execute();
			
			statement = connection.prepareStatement(sql);
			statement.setInt(1, employeeId);
			int result = statement.executeUpdate();
			if (result == 0) {
				throw new EmployeeNotFoundException("Employee with this ID not found");
			}
		}
			catch (SQLException e) {
				e.printStackTrace();
				
			}finally {
				try {
					statement.close();
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
}
	public void deleteProject(int projectId) throws ProjectNotFoundException
	{
		// TODO Auto-generated method stub
		connection =DbConnectionUtil.getConnection();
		String sql="delete from project where project_id = ?";
		String sql2="delete from task where project_id = ?";
		String sql3="delete from employee where project_id = ?";
		PreparedStatement statement = null;
		PreparedStatement statement2 = null;
		PreparedStatement statement3 = null;
		try {
			statement2 = connection.prepareStatement(sql2);
			statement2.setInt(1, projectId);
			statement2.execute();
			
			statement3 = connection.prepareStatement(sql3);
			statement3.setInt(1, projectId);
			statement3.execute();
			
			statement = connection.prepareStatement(sql);
			statement.setInt(1, projectId);
			int result = statement.executeUpdate();
			if (result == 0) {
				throw new ProjectNotFoundException("Project with this ID not found");
			}
		}
			catch (SQLException e) {
				e.printStackTrace();
				
			}finally {
				try {
					statement.close();
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
		
	}
	@Override
	public void assignProjectToEmployee(int projectId, int employeeId) {
		String sql = "update employee set project_id =? where employee_id=?";
		connection=DbConnectionUtil.getConnection();
		PreparedStatement statement = null;
		try {
		
		statement=connection.prepareStatement(sql);
		statement.setInt(1, projectId);
		statement.setInt(2, employeeId);
		statement.execute();
		}catch (SQLException e) {
			e.printStackTrace();
			
		}finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	@Override
	public List<Task> getAllTask() {
		connection =DbConnectionUtil.getConnection();
		String sql="select * from task";
		PreparedStatement statement = null;
		List <Task> tasks = new ArrayList<Task>();
		try {
			
			statement = connection.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				int taskId = rs.getInt("task_id");
				String taskName = rs.getString("task_name");
				int projectId = rs.getInt("project_id");
				int employeeId = rs.getInt("employee_id");
				String status = rs.getString("status");
				
				Task task = new Task(taskId,taskName,projectId,employeeId,status);
				tasks.add(task);	
			}
	
			}catch (SQLException e) {
				e.printStackTrace();
				
			}finally {
				try {
					statement.close();
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		return tasks;	
	}
	}




