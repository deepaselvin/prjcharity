package com.revature.projectdept2.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.revature.projectdept2.ConncetionUtil;
import com.revature.projectdept2.DAO.UserDAODetails;

public class MainMenuList {
	static Scanner scanner = new Scanner(System.in);

	@SuppressWarnings("unused")
	public static void show() throws Exception {
		Connection con = ConncetionUtil.getconnection();

		System.out.println("MAIN MENU \n 1 : REQUEST LIST \n 2 : DONOR LIST \n 3:Admin User");

		int a = scanner.nextInt();

		while (a != 4) {
			switch (a) {

			case 1: {
				System.out.println("REQUEST LIST");

				RequestList.req();
				Start.welcome();
			}
				break;

			case 2: {
				System.out.println("DONOR LIST");

				LoginCredits.login();
				UserDAODetails.Login(null, a, null);
				System.out.println(
						"MAIN MENU \n " + "01 : CHILDRENS EDUCTAION \n" + "02:HEALTH & NUTRITION \n" + "03:LOG OUT");

				System.out.println("Enter the Request Number:");

				int Reqno = scanner.nextInt();
				String sql = "select id from employees where Request_no=?";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setInt(1, Reqno);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {

					Start.welcome();

					break;

				}
			}

			case 3: {
				System.out.println("WELCOME TO THE CHARITY FUNDS");
				
				System.out.println(
						"MAIN MENU \n " + "01 : CHILDRENS EDUCTAION \n" + "02:HEALTH & NUTRITION \n" + "03:LOG OUT");

				// HOW TO MAKE ALTERATION IN REQUEST AND RAISE FUNDS

				System.out.println("Enter Request Number");
				int Reqno = scanner.nextInt();

				Fundinfo.fund();

				Start.welcome();
			}
				break;
			}

		}
	}
}
