package com.revature.projectdept2.Services;

import java.sql.Connection;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.projectdept2.ConncetionUtil;
import com.revature.projectdept2.DAO.UserDAODetails;




public class Registration {
	static Scanner scanner = new Scanner(System.in);
	 Connection con =ConncetionUtil.getconnection();
	
  static void register() throws SQLException
 {
	
 	System.out.println(" User Name:");
 	String name = scanner.next();
 	System.out.println(" enter Phnone No:");
 	int phone_no = scanner.nextInt();
 	System.out.println("Enter the role");
 	String role = scanner.next();
 	
 	
 	System.out.println("Registered sucessfully");
 	
 	UserDAODetails.Register(name,phone_no,role);
 	

	


	
 }
  
	  
  

}
