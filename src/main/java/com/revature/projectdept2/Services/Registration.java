package com.revature.projectdept2.services;

import java.sql.Connection;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.projectdept2.dao.UserDAODetails;
import com.revature.projectdept2.exception.DBException;
import com.revature.projectdept2.exception.ValidatorException;
import com.revature.projectdept2.model.RegUserDetails;
import com.revature.projectdept2.util.ConncetionUtil;
import com.revature.projectdept2.validator.ValidatorReg;

public class Registration {
	static Scanner scanner = new Scanner(System.in);
	Connection con = ConncetionUtil.getconnection();
	static ValidatorReg valid = new ValidatorReg();

	static void register() throws SQLException, DBException, ValidatorException {

		System.out.println(" User Name:");
		String name = scanner.next();
		System.out.println(" enter Phnone No:");
		int phone_no = scanner.nextInt();
		System.out.println("Enter the role");
		String role = scanner.next();

		RegUserDetails user = new RegUserDetails();
		user.setName(name);
		user.setPhone_no(phone_no);
		user.setRole(role);
		valid.validateBeforeRegistration(user);
		System.out.println("Registered sucessfully");

		UserDAODetails.register(user);

	}

}
