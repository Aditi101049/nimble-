package com.masai.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBIUtil {
	
 public static Connection provideConnection() {
	 
	 Connection conn=null;
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 String url="jdbc:mysql://localhost:3306/crime_information_management_system";
	 
	 try {
		conn= DriverManager.getConnection(url,"root","Aditi@101049");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 return conn;
 }
}
