package com.revature.projectdept2.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.projectdept2.ConncetionUtil;

public class Fundinfo {
	public static int balance = 0;
	static Connection con =ConncetionUtil.getconnection();
	public static void fund() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Request ");
		String Request_need = sc.next();
		
		System.out.println("FUND NEEDED");
		int Fund_needed = sc.nextInt();
		balance = Fund_needed;
		
		String sql1 = "update employees set Fund_needed=? where Request_name=?";
		PreparedStatement pst1 = con.prepareStatement(sql1);
		pst1.setInt(1, Fund_needed);
		pst1.setString(2, Request_need);
		pst1.executeUpdate();

	}
}
