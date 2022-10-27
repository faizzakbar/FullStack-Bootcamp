package com.lawencon.merchant.constant;

public enum CategoryConst {
	BUAH("Buah"), SAYURAN("Sayuran")
	, MIE("Mie"), AIRMINERAL("Air Mineral");

	private String typeItem; 

	CategoryConst(String typeItem) {
		this.typeItem = typeItem;
	}
	
	public String getTypeItem () {
		return typeItem;
	}
}
