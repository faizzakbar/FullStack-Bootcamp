package com.lawencon.gojek.model;

public class CartDetail {
	private String menu;
	private int quantity;
	private int total;
	 
	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getMenu() {
		return menu;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getTotal() {
		return total;
	}

	
}

