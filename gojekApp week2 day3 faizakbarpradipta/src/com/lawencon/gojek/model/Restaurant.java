package com.lawencon.gojek.model;

import java.util.List;

public class Restaurant {
	private String name;
	private String address;
	private String phone;
	private List<Menu> menu;
	
	public void setName (String name){
		this.name = name;
	}
	
	public void setAddress (String address) {
		this.address = address;
	}
	public void setPhone (String phone) {
		this.phone = phone;
	}
	
	public void setMenu (List<Menu> menu) {
		this.menu = menu;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	public List<Menu> getMenu() {
		return menu;
	}
}
