package com.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBC_TestCase {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// 1.registering
		//  2.connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Management_Application","root","PritamDas@2002");
//			3.create statement
			Statement stmt = con.createStatement();
//			execute query fetch data from database
			ResultSet rs = stmt.executeQuery("select * from Student_details");
//			 iterating through columns
			 while(rs.next()) {
				 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			 }
//			 closing connection
			 con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
