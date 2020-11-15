package com.cybage.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbUtil {
	public static String dbURL;
	public static String dbUser ;
	public static String dbPassword ;
	static {
		try {
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();			
			InputStream is = classloader.getResourceAsStream("app.properties");

			Properties props = new Properties();
			props.load(is);
			dbURL = props.getProperty("dbURL");
			dbUser = props.getProperty("dbUser");
			dbPassword = props.getProperty("dbPassword");
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver"); //class will be loaded automatically (thin driver)
		Connection con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
		return con;
		}
}
