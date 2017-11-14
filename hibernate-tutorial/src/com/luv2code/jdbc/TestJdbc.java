package com.luv2code.jdbc;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;

public class TestJdbc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "hbstudent";
		String pass = "hbstudent";		
				
		try{
			System.out.println("Connecting to database :"+ jdbcUrl);
			
			Connection myConn = (Connection) DriverManager.getConnection(jdbcUrl,user,pass);
		
			System.out.println("COnnection Successful");
		}
		catch(Exception exc){
			
			exc.printStackTrace();
		}
		
	}

}
