package com.lawencon.merchant.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lawencon.merchant.constant.CategoryConst;
import com.lawencon.merchant.model.Items;
import com.lawencon.merchant.service.ListService;

public class ListServiceImpl implements ListService {

	@Override
	public final List<Items> getMenu() {

		final List<Items> menu = new ArrayList<>();

		final Items durian = new Items();
		durian.setCategory(CategoryConst.BUAH.getTypeItem());
		durian.setItemCode("BDU");
		durian.setName("Durian");
		durian.setPrice(20000);

		final Items mangga = new Items();
		mangga.setCategory(CategoryConst.BUAH.getTypeItem());
		mangga.setItemCode("BMA");
		mangga.setName("Mangga");
		mangga.setPrice(15000);

		final Items apel = new Items();
		apel.setCategory(CategoryConst.BUAH.getTypeItem());
		apel.setItemCode("BAP");
		apel.setName("Apel");
		apel.setPrice(10000);

		final Items nanas = new Items();
		nanas.setCategory(CategoryConst.BUAH.getTypeItem());
		nanas.setItemCode("BNA");
		nanas.setName("Nanas");
		nanas.setPrice(18000);
		
		menu.add(durian);
		menu.add(mangga);
		menu.add(apel);
		menu.add(nanas);
//		
		final Items bayam = new Items();
		bayam.setCategory(CategoryConst.SAYURAN.getTypeItem());
		bayam.setItemCode("SBA");
		bayam.setName("Bayam");
		bayam.setPrice(16000);

		final Items brokoli = new Items();
		brokoli.setCategory(CategoryConst.SAYURAN.getTypeItem());
		brokoli.setItemCode("SBR");
		brokoli.setName("Brokoli");
		brokoli.setPrice(14000);

		final Items kol = new Items();
		kol.setCategory(CategoryConst.SAYURAN.getTypeItem());
		kol.setItemCode("SKO");
		kol.setName("Kol");
		kol.setPrice(19000);
		
		menu.add(bayam);
		menu.add(brokoli);
		menu.add(kol);
//		
		final Items indomie = new Items();
		indomie.setCategory(CategoryConst.MIE.getTypeItem());
		indomie.setItemCode("MIN");
		indomie.setName("Indomie");
		indomie.setPrice(5000);

		final Items sarimi = new Items();
		sarimi.setCategory(CategoryConst.MIE.getTypeItem());
		sarimi.setItemCode("MSA");
		sarimi.setName("Sarimi");
		sarimi.setPrice(4000);

		final Items sedap = new Items();
		sedap.setCategory(CategoryConst.MIE.getTypeItem());
		sedap.setItemCode("MSE");
		sedap.setName("Sedap");
		sedap.setPrice(6000);
		
		menu.add(indomie);
		menu.add(sarimi);
		menu.add(sedap);
		
//
		final Items aqua = new Items();
		aqua.setCategory(CategoryConst.AIRMINERAL.getTypeItem());
		aqua.setItemCode("AAQ");
		aqua.setName("Aqua");
		aqua.setPrice(6000);

		final Items danone = new Items();
		danone.setCategory(CategoryConst.AIRMINERAL.getTypeItem());
		danone.setItemCode("ADA");
		danone.setName("Danone");
		danone.setPrice(8000);

		final Items leminerale = new Items();
		leminerale.setCategory(CategoryConst.AIRMINERAL.getTypeItem());
		leminerale.setItemCode("ALE");
		leminerale.setName("Le Minerale");
		leminerale.setPrice(7000);
		
		menu.add(aqua);
		menu.add(danone);
		menu.add(leminerale);
		
		return menu;
	}
}
