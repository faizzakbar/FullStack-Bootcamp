package com.lawencon.gojek.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lawencon.gojek.model.Driver;
import com.lawencon.gojek.service.DriverService;


public class DriverServiceImpl implements DriverService {
	

@Override
public List<Driver> drivers() {
	List<Driver> drivers = new ArrayList<Driver>();
	
	Driver nana = new Driver();
	nana.setName("Nana");
	nana.setPhoneNo("08121212");
	nana.setPlatNo("B 1234 AAA");
	
	Driver nini = new Driver();
	nini.setName("Nini");
	nini.setPhoneNo("08131313");
	nini.setPlatNo("B 1322 BBB");
	
	Driver nono = new Driver();
	nono.setName("Nono");
	nono.setPhoneNo("081414");
	nono.setPlatNo("B 1322 CCC");
	
	Driver andi = new Driver();
	andi.setName("Andi");
	andi.setPhoneNo("08121212");
	andi.setPlatNo("B 4233 AAA");
	
	Driver ando = new Driver();
	ando.setName("Ando");
	ando.setPhoneNo("08121212");
	ando.setPlatNo("B 2342 AAA");
	
	drivers.add(nana);
	drivers.add(nini);
	drivers.add(nono);
	drivers.add(andi);
	drivers.add(ando);
	
	
	return drivers;
}

@Override
public int calculatePrice(String from, String to) {
	
	return 0;
}


}
