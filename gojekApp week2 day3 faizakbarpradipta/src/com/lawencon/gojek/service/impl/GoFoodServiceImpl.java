package com.lawencon.gojek.service.impl;

import java.util.Random;

import com.lawencon.gojek.model.Driver;
import com.lawencon.gojek.service.GoFoodService;



public class GoFoodServiceImpl implements GoFoodService{

	@Override
	public Driver findDriver() {
		Random random = new Random();
		
		int choose = random.nextInt(4);
		
		DriverServiceImpl driversImpl = new DriverServiceImpl();
		
		Driver driver = new Driver();
		driver.setName(driversImpl.drivers()
				.get(choose).getName());
		driver.setPhoneNo(driversImpl.drivers()
				.get(choose).getPhoneNo());
		driver.setPlatNo(driversImpl.drivers()
				.get(choose).getPlatNo());
		
		return driver;
	}
	


	}

