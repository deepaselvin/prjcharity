package com.revature.projectdept2.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.revature.projectdept2.ConncetionUtil;
import com.revature.projectdept2.Services.Fundinfo;

public class UserDAODetails {

	

	public static void Register(String name, int phone_no, String role) throws SQLException {
		
		 Connection con = ConncetionUtil.getconnection();
		
		String sql = "insert into Users(name,phone_no,role) values (?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, name);
		pst.setInt(2, phone_no);
		pst.setString(3, role);
		int rows = pst.executeUpdate();

	}

	public static void Login(String enter_name, int enter_phn_no, String role) throws SQLException, ClassNotFoundException {
		
		 Connection con = ConncetionUtil.getconnection();
		String sql = "select * from Users where name=? and phone_no=? and role=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, enter_name);
		pst.setInt(2, enter_phn_no);
		pst.setString(3, role);
		ResultSet rs = pst.executeQuery();
		
		if (rs.next()) {
			System.out.println("Login sucessfully");
				}
}

	public static int depinfo(int accno) throws SQLException {
		
		 Connection con = ConncetionUtil.getconnection();
		
		String sql1 = "select Amount_Donated from employees where Request_no=?";
		PreparedStatement pst11 = con.prepareStatement(sql1);
		pst11.setInt(1, accno);
		ResultSet rs = pst11.executeQuery();

		// int balance=10000;//change this to admin control
		if (rs.next()) {
			Fundinfo.balance = rs.getInt(1);
		}

		return Fundinfo.balance;// change to return balance

	}

	public static int requestInsert(String Request_need, int Deposit, int Request_no) throws SQLException {
		
		 Connection con = ConncetionUtil.getconnection();
		
		String sql = "insert into employees(Request_name,Amount_Donated,Request_no) values (?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, Request_need);
		pst.setInt(2, Deposit);
		pst.setInt(3, Request_no);
		

		int rows = pst.executeUpdate();
		return rows;

	}

	public static void requestUpdate(int totalBalance, String Request_need) throws SQLException {

		 Connection con = ConncetionUtil.getconnection();
		
		String sql1 = "update employees set Amount_Donated=? where Request_need=?";
		PreparedStatement pst1 = con.prepareStatement(sql1);
		pst1.setInt(1, totalBalance);
		pst1.setString(2, Request_need);
		pst1.executeUpdate();

	}

	public static void fundinfo(int Fund_needed) throws SQLException {
		
		 Connection con = ConncetionUtil.getconnection();
		
		String sql = "insert into employees(Fund_needed) values (?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, Fund_needed);

		int rows = pst.executeUpdate();

	}

	public static void adFundinfo(int Fund_needed, String Request_need) throws SQLException {

		 Connection con = ConncetionUtil.getconnection();
		
		String sql1 = "update employees set Fund_needed=? where Request_need=?";
		PreparedStatement pst1 = con.prepareStatement(sql1);
		pst1.setInt(1, Fund_needed);
		pst1.setString(2, Request_need);
		pst1.executeUpdate();

	}
}
