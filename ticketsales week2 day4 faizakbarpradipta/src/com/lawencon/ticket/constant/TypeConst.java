package com.lawencon.ticket.constant;

public enum TypeConst {
	BUS("Bus"), TRAIN("Train"), PLANE("Pesawat");

	public String typeVehicle;

	private TypeConst(String typeVehicle) {
		this.typeVehicle = typeVehicle;
	}
}
