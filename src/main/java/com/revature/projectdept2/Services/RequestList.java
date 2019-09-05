package com.revature.projectdept2.Services;


import java.util.Scanner;

public class RequestList {
	static Scanner scanner = new Scanner(System.in);
	public static void req()throws Exception {
	System.out.println("MAIN MENU \n "
			+ "01 : CHILDRENS EDUCTAION \n"
			+ "02:HEALTH & NUTRITION \n"
			+ "03:LOG OUT");
	
	int letter = scanner.nextInt();
	
	 while(letter!=04) {
			switch (letter) {

			case 01:
			{
				System.out.println(" CHILDRENS EDUCTAION");
				System.out.println("FUND NEEDED:"+Fundinfo.balance);
				RequestUpdate.reqinfo();
				break;


			}
			case 02:
			{
				System.out.println("HEALTH & NUTRITION");
				System.out.println("FUND NEEDED:"+Fundinfo.balance);
				RequestUpdate.reqinfo();
				
				break;
				
			}
			case 03:
			{
				System.out.println("LOG OUT ");
				MainMenuList.show();
				break;
			}


}
	 }
}
}
