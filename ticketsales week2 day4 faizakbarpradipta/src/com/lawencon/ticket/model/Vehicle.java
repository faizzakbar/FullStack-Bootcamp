package com.lawencon.ticket.model;

import java.util.List;

public class Vehicle {
	
	private String type;
	private List <Seat> listSeat;
	private int price;
	
	public void setType (String type) {
		this.type = type;
	}
	
	public void setList (List<Seat> listSeat) {
		this.listSeat = listSeat;
	}
	
	public void setPrice (int price) {
		this.price = price;
	}
	
	public String getType () {
		return type;
	}
	public List<Seat> getList () {
		return listSeat;
	}
	public int getPrice () {
		return price;
	}
}
