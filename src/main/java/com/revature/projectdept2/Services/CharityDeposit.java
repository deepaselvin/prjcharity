package com.revature.projectdept2.services;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.projectdept2.dao.UserDAODetails;
import com.revature.projectdept2.util.ConncetionUtil;

public class CharityDeposit {

	public int depinfo(int accno) throws SQLException, ClassNotFoundException {
		Connection con = ConncetionUtil.getconnection();
		return UserDAODetails.depinfo(accno);

	}
}
