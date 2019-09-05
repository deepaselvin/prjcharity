package com.revature.projectdept2.Services;

public class Welcome {

	public static void main(String[] args) throws Exception {

		try {
			Start.welcome();
		} catch (Exception e) {
		
			e.printStackTrace();
			throw new Exception("SERVER BUSY.....");
		}

	}

}
