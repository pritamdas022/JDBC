package com.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UPDATE_JDBC {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Drive");// 1.registering
//			2.connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Management_Application","root","PritamDas@2002");
//			create statement
			Statement stmt = con.createStatement();
//			updating an existing the record 
			stmt.executeUpdate("update Student_details set sadd='newyork' where Sid=7");
//			delete record
			stmt.executeUpdate("delete from Student_details where Sid=20");
//			execute query fetch data from database
			ResultSet rs = stmt.executeQuery("select * from Student_details");
			 //iterating through column
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
