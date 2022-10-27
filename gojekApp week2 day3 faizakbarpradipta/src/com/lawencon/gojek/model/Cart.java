package com.lawencon.gojek.model;

import java.util.List;

public class Cart {
	private Restaurant resto;
	private List<CartDetail> list;
	
	public void setResto(Restaurant resto) {
		this.resto = resto;
	}
	
	public void setList(List<CartDetail> list) {
		this.list = list;
	}
	
	public Restaurant getResto() {
		return resto;
	}
	public List<CartDetail> getList() {
		return list;
	}
}
