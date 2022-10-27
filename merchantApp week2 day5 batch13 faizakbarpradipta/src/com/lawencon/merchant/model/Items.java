package com.lawencon.merchant.model;

public class Items {
	private String category;
	private String itemCode;
	private String name;
	private int price;

	public void setCategory(String category) {
		this.category = category;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public String getItemCode() {
		return itemCode;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}
