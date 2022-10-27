package com.lawencon.merchant.model;

import java.util.List;

public class Cart {
	private List<CartDetail> listCart;
	private int grandTotal;
	
	public void setListCart(List<CartDetail> listCart) {
		this.listCart = listCart;
	}
	
	public void setGrandTotal(int grandTotal) {
		this.grandTotal = grandTotal;
	}
	
	public List<CartDetail> getListCart() {
		return listCart;
	}
	
	public int getGrandTotal() {
		return grandTotal;
	}
	
}
