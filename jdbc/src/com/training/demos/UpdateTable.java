package com.training.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTable{
	
	public static void main(String[] args) {
		
			String url = "jdbc:mysql://localhost:3306/trainingdb";
            String username = "root";
            String password="Kirthiii@004";

			String sql = "update Student set department=? where student_id=?";
            Connection connection = null;
            PreparedStatement statement = null;
            try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.prepareStatement(sql);
            statement.setString(1, "EEE");
            statement.setInt(2, 10);
            int val= statement.executeUpdate();
            System.out.println(val);

			} catch (SQLException e) {
             e.printStackTrace();
	}finally {
		try {
			statement.close();
			connection.close();
		} catch (SQLException e) {
	     	}
		}
 }
	}


