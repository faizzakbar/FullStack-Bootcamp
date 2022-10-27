package com.lawencon.minimarket.constant;

public enum UserConst {
	SELLER("penjual","penjual"), BUYER("pembeli", "pembeli");

	private String userName;
	private String passWord;

	UserConst(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}
	
	
	public String getUsername () {
		return userName;
	}
	public String getPassword () {
		return passWord;
	}
}
