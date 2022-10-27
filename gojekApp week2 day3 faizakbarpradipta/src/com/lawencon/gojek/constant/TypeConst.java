package com.lawencon.gojek.constant;

public enum TypeConst {
	FOOD("Makanan"), DOCOMENT("Dokumen")
	, MEDICINE("Obat-obatan"), OTHER("Lain-lain");

	public String typeItem; //gk boleh public?

	TypeConst(String parcelType) {
		this.typeItem = parcelType;
	}
}
