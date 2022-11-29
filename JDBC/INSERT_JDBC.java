package com.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class INSERT_JDBC {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// 1.registering
//			2.connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Management_Application","root","PritamDas@2002");
//			3.create statement
			Statement stmt = con.createStatement();
//			4.inserting data into database table
			 stmt.executeUpdate("insert into Student_details values(17,'Rohit',836453,'kolkata')");
			 stmt.executeUpdate("insert into Student_details values(19,'Rohan',97346,'kolkata')");
			 stmt.executeUpdate("insert into Student_details values(18,'Rajes',8634526,'kolkata')");
			 stmt.executeUpdate("insert into Student_details values(20,'Preet',7833626,'kolkata')");
			 stmt.executeUpdate("insert into Student_details values(21,'sourav',9734525,'kolkata')");
			
			System.out.println("inserted successfully");
//			5.closing connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
