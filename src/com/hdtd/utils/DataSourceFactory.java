package com.hdtd.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class DataSourceFactory {
	
	public static org.apache.commons.dbcp.BasicDataSource getDataSource(){
		BasicDataSource source = new BasicDataSource();
//		<property name="driverClassName" value="${jdbc.driver}" />
//		<property name="url" value="${jdbc.url}" />
//		<property name="username" value="${jdbc.username}" />
//		<property name="password" value="${jdbc.password}" />
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(new File("config/db.properties")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String driver = properties.getProperty("jdbc.driver");
		String url = properties.getProperty("jdbc.url");
		String username = properties.getProperty("jdbc.username");
		String password = properties.getProperty("jdbc.password");
		
		source.setDriverClassName(driver);
		source.setUrl(url);
		source.setUsername(username);
		source.setPassword(password);
		return source;
	}
	
}
