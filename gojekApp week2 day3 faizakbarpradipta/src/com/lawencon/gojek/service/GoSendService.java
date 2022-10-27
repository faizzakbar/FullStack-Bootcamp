package com.lawencon.gojek.service;

import com.lawencon.gojek.model.Driver;

public interface GoSendService {
	
	Driver getDriver();
	
	int calculatePrice(String from, String to,int weight);
}
