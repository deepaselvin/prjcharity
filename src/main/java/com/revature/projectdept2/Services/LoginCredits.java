package com.revature.projectdept2.services;

import java.sql.Connection;
import java.util.Scanner;


import com.revature.projectdept2.dao.UserDAODetails;
import com.revature.projectdept2.util.ConncetionUtil;

public class LoginCredits {
	static Scanner scanner = new Scanner(System.in);
	static Connection con = ConncetionUtil.getconnection();

	static void login() throws Exception {
		System.out.println("LOGIN");

		System.out.println("ENTER USER NAME:");
		
		String enter_name = scanner.next();
		System.out.println("ENTER PHONE NO:");
		int enter_phn_no = scanner.nextInt();
		
		System.out.println("Enter the role");
	 	String role = scanner.next();
	 	

		UserDAODetails.login(enter_name, enter_phn_no,role);
		MainMenuList sh = new MainMenuList();
		sh.show();

	}
}
