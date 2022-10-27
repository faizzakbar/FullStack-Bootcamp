package com.lawencon.minimarket.model;

import java.util.List;


public class CartDetail {
	private List<Item> items;
	private int quantity;
	
	public void setItems (List<Item> items) {
		this.items = items;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public List<Item> getItems() {
		return items;
	}
	public int getQuantity() {
		return quantity;
	}
}
