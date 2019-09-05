package com.revature.projectdept2.Services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.projectdept2.ConncetionUtil;
import com.revature.projectdept2.DAO.UserDAODetails;


public class RequestUpdate {
	static Scanner scanner = new Scanner(System.in);
	static Connection con = ConncetionUtil.getconnection();
	
	public static void reqinfo() throws Exception {
	
	System.out.println("Enter the Request Number");
	int Request_no = scanner.nextInt();
		
	System.out.println("Enter Request ");
	String Request_need = scanner.next();
	
	System.out.println("Enter Amount to be Deposited:");

	int Deposit = scanner.nextInt();
	
	UserDAODetails.requestInsert(Request_need, Deposit,Request_no);
	
	CharityDeposit depo = new CharityDeposit();
	int bal=depo.depinfo(Deposit);
	
	
	int totalBalance = bal - Deposit;
	System.out.println("DONATED AMOUNT::"+Deposit);
 

	System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
	System.out.println("FUND STILL NEEDED:"+totalBalance);
	if(totalBalance==0)
	{
		System.out.println("**** REQUEST WAS FULLFILLED ****");
	}
	UserDAODetails.adFundinfo(totalBalance, Request_need);
	RequestList.req(); 


}
}