package com.revature.projectdept2.model;

public class RegUserDetails {

	private String name;
	private int phone_no;
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

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

	@Override
	public String toString() {
		return "RegUserDetails [name=" + name + ", phone_no=" + phone_no + ", role=" + role + "]";
	}

}
