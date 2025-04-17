package com.projectApp.util;
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

public class DbPropertiesUtil {
	
	public static Properties getProperties() {
		
		Properties properties = new Properties();
		
		InputStream inputStream = DbPropertiesUtil.class.
		getClassLoader().getResourceAsStream("jdbc.properties");
		
		try {
			properties.load(inputStream);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

}


