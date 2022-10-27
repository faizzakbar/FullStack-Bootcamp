package com.lawencon.gojek.service;

import java.util.List;

import com.lawencon.gojek.model.Driver;

public interface DriverService {
	
	List<Driver> drivers();
	
	int calculatePrice(String from, String to);
	
}
