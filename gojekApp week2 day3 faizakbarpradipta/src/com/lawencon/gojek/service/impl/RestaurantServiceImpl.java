package com.lawencon.gojek.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lawencon.gojek.model.Menu;
import com.lawencon.gojek.model.Restaurant;
import com.lawencon.gojek.service.RestaurantService;

public class RestaurantServiceImpl implements RestaurantService {

	@Override
	public List<Restaurant> getResto() {

		List<Restaurant> resto = new ArrayList<>();
		List<Menu> restoRindangAlam = new ArrayList<>();

		final Menu rendang = new Menu();
		rendang.setName("Rendang");
		rendang.setPrice(20000);

		Menu ayamBakar = new Menu();
		ayamBakar.setName("Ayam Bakar");
		ayamBakar.setPrice(15000);

		Menu bawalLaut = new Menu();
		bawalLaut.setName("Bawal Laut");
		bawalLaut.setPrice(25000);

		Menu telorDadar = new Menu();
		telorDadar.setName("Telor Dadar");
		telorDadar.setPrice(10000);

		Menu bawalTawar = new Menu();
		bawalTawar.setName("Bawal Tawar");
		bawalTawar.setPrice(18000);

		restoRindangAlam.add(rendang);
		restoRindangAlam.add(ayamBakar);
		restoRindangAlam.add(bawalLaut);
		restoRindangAlam.add(telorDadar);
		restoRindangAlam.add(bawalTawar);

		Restaurant restorantPadang = new Restaurant();
		restorantPadang.setName("Restorant Rindang Alam");
		restorantPadang.setAddress("jl. damai");
		restorantPadang.setPhone("082222222");
		restorantPadang.setMenu(restoRindangAlam);

		final List<Menu> solaria = new ArrayList<Menu>();

		Menu ayam = new Menu();
		ayam.setName("Ayam");
		ayam.setPrice(20000);

		Menu mieGoreng = new Menu();
		mieGoreng.setName("Mie Goreng");
		mieGoreng.setPrice(15000);

		Menu mieRebus = new Menu();
		mieRebus.setName("Mie Rebus");
		mieRebus.setPrice(21000);

		Menu kwetiawGoreng = new Menu();
		kwetiawGoreng.setName("Kwetiaw Goreng");
		kwetiawGoreng.setPrice(15000);

		Menu kwetiawRebus = new Menu();
		kwetiawRebus.setName("Kwetiaw Rebus");
		kwetiawRebus.setPrice(12000);

		solaria.add(ayam);
		solaria.add(mieGoreng);
		solaria.add(mieRebus);
		solaria.add(kwetiawGoreng);
		solaria.add(kwetiawRebus);

		Restaurant restorantSolaria = new Restaurant();
		restorantSolaria.setName("Restorant Solaria");
		restorantSolaria.setAddress("jl. joki");
		restorantSolaria.setPhone("0811111111");
		restorantSolaria.setMenu(solaria);

		List<Menu> kfc = new ArrayList<Menu>();

		Menu ayamDada = new Menu();
		ayamDada.setName("Ayam Crispy Dada");
		ayamDada.setPrice(10000);

		Menu ayamPaha = new Menu();
		ayamPaha.setName("Ayam Crispy Dada");
		ayamPaha.setPrice(10000);

		Menu sayap = new Menu();
		sayap.setName("Sayap ayam");
		sayap.setPrice(8000);

		Menu burgerCheese = new Menu();
		burgerCheese.setName("Cheese Burger");
		burgerCheese.setPrice(15000);

		Menu burgerBbq = new Menu();
		burgerBbq.setName("BBQ Burger");
		burgerBbq.setPrice(15000);

		kfc.add(ayamDada);
		kfc.add(ayamPaha);
		kfc.add(sayap);
		kfc.add(burgerCheese);
		kfc.add(burgerBbq);

		Restaurant restorantKfc = new Restaurant();
		restorantKfc.setName("KFC");
		restorantKfc.setAddress("Jl. Pahlawan Revolusi No.7, RW.4, Klender, Kec. Duren Sawit");
		restorantKfc.setPhone("0833333");
		restorantKfc.setMenu(kfc);

		List<Menu> warungSunda = new ArrayList<Menu>();
		Menu ayamGoreng = new Menu();
		ayamGoreng.setName("Ayam Goreng");
		ayamGoreng.setPrice(8000);

		Menu ayamSayur = new Menu();
		ayamSayur.setName("Ayam Sayur");
		ayamSayur.setPrice(10000);

		Menu ikanLele = new Menu();
		ikanLele.setName("Ikan Lele");
		ikanLele.setPrice(11000);

		Menu telorBulat = new Menu();
		telorBulat.setName("Telor Bulat");
		telorBulat.setPrice(6000);

		Menu sayurCapcay = new Menu();
		sayurCapcay.setName("Sayur Capcay");
		sayurCapcay.setPrice(7000);

		warungSunda.add(ayamGoreng);
		warungSunda.add(ayamSayur);
		warungSunda.add(ikanLele);
		warungSunda.add(telorBulat);
		warungSunda.add(sayurCapcay);

		Restaurant warungSundaResto = new Restaurant();
		warungSundaResto.setName("Warung Sunda");
		warungSundaResto.setAddress("Jl. Tebet Barat Raya No.5, RT.8/RW.2, Tebet Bar");
		warungSundaResto.setPhone("08444444");
		warungSundaResto.setMenu(warungSunda);

		List<Menu> warungKopi = new ArrayList<Menu>();
		Menu cappucino = new Menu();
		cappucino.setName("Cappucino");
		cappucino.setPrice(20000);

		Menu latte = new Menu();
		latte.setName("Latte");
		latte.setPrice(18000);

		Menu espresso = new Menu();
		espresso.setName("Espresso");
		espresso.setPrice(19000);

		Menu thaiTea = new Menu();
		thaiTea.setName("Thai Tes");
		thaiTea.setPrice(10000);

		Menu cappucinoLatte = new Menu();
		cappucinoLatte.setName("Cappucino Latte");
		cappucinoLatte.setPrice(17000);

		warungKopi.add(cappucino);
		warungKopi.add(latte);
		warungKopi.add(espresso);
		warungKopi.add(thaiTea);
		warungKopi.add(cappucinoLatte);

		Restaurant caffe = new Restaurant();
		caffe.setName("Warung Kopi");
		caffe.setAddress("Jl. Persada Raya No.6, RW.15, Menteng Dalam,");
		caffe.setPhone("085555");
		caffe.setMenu(warungKopi);

		resto.add(restorantPadang);
		resto.add(restorantSolaria);
		resto.add(restorantKfc);
		resto.add(warungSundaResto);
		resto.add(caffe);

		return resto;

	}

}
