package com.lawencon.merchant.model;

import java.util.List;

public class CartDetail {
	private List<Items> listDetail;
	private int quantity;
	private int total;

	public void setListDetail(List<Items> listDetail) {
		this.listDetail = listDetail;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Items> getListDetail() {
		return listDetail;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getTotal() {
		return total;
	}
}
