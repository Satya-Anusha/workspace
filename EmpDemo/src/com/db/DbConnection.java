package com.db;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;



public class DbConnection {
  public static Connection getConnection(){
	  Connection con=null;
	  try {
		Class.forName("com.mysql.jdbc.Driver");
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdemo","root","1234");
		  if(con!=null)
			  System.out.println("Connection Established");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return null;
	}
	  
  }
  
