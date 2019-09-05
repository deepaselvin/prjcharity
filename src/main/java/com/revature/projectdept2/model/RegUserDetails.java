package com.revature.projectdept2.Services;

public class RegUserDetails {
	private String name;
	private int phone_no;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	public String ToString() {
		return "RegUserDetails[name="+name +",phone_no=" +phone_no +"]";
	}

}

