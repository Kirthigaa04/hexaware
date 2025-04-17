package com.bookapp.util;


import java.sql.Connection;
import java.sql.DriverManager;

import java.util.Properties;

public class DbConnectionUtil {
	static  Connection connection;
		
	public static Connection getConnection(){
		//BdPropertiesUtil properties = new BdPropertiesUtil();
		Properties properties = DbPropertiesUtil.getProperties();
		String url = properties.getProperty("db.url");
		String username = properties.getProperty("db.username");
		String password = properties.getProperty("db.password");	
		try {
			connection = DriverManager.getConnection(url,username,password);
		}catch(Exception e) {
		e.printStackTrace();
	      }
		return connection;
}
}