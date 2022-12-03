package com.sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.sms.fetch.Table_Fetch;
import com.sms.insert.TableInsert;
import com.sms.Delete_Update.TableDeleteUpdate;

public class Helper {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");


		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static Connection con() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/pritamdb","root","PritamDas@2002");

	}
	 public static void main(String...args) throws Exception {
		Table_Fetch it = new Table_Fetch();
		TableInsert ft = new TableInsert();
		TableDeleteUpdate ut = new TableDeleteUpdate();
		Scanner scan =new Scanner(System.in); 
		System.out.println("""
				Press 1 for Insert : 
				Press 2 for Display :
				Press 3 for Update :
				Press 4 for Delete :
				Press 5 for Exit : 
				""");
		int variable = scan.nextInt();
		System.out.println("-------------------------------");
		switch(variable) {
		case 2 : 
		  it.fetchMenyDriven();
		  break;
		case 1 :  
			ft.saveMenyDriven();
	 break;
		case 3 :
			ut.updateMenyDriven();
			break;
		case 4 :
			ut.deleteMenyDriven();
			break;
		case 5 :
			System.exit(0);
			break;
		}
	}
		
	}