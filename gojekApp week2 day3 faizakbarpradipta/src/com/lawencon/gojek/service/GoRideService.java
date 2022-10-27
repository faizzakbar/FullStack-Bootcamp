package com.lawencon.gojek.service;

import com.lawencon.gojek.model.Driver;

public interface GoRideService {
	
	Driver findDriver();
	
	int calculatePrice(String from, String to);
}
