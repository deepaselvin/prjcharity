package com.revature.projectdept2.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.projectdept2.ConncetionUtil;
import com.revature.projectdept2.DAO.UserDAODetails;




public class CharityDeposit {

	public int depinfo(int accno)throws SQLException, ClassNotFoundException {
		Connection con =ConncetionUtil.getconnection();
		return UserDAODetails.depinfo(accno);
	
		
}
}

	