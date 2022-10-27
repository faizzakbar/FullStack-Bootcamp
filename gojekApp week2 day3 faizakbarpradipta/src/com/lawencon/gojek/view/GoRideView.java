package com.lawencon.gojek.view;

import com.lawencon.gojek.model.Driver;
import com.lawencon.gojek.service.GoRideService;
import com.lawencon.gojek.service.impl.GoRideServiceImpl;
import com.lawencon.gojek.utill.MenuInput;



public class GoRideView  {
	private final GoRideService goRideService = new GoRideServiceImpl();
	private MainView mainView;
	
	private String inputSource;
	private String inputDest;
	
	void show() {
		System.out.println("");
		System.out.println("---Go Ride---");
		
		System.out.println("Input pickup address");
		inputSource = MenuInput.inputString();
		
		System.out.println("Input destination");
		inputDest = MenuInput.inputString();
		
		Driver driver = goRideService.findDriver();
		int totalPrice = goRideService.calculatePrice(inputSource, inputDest);
		
		printInvoice(inputSource, inputDest,driver, totalPrice);
//		backMenu();
	}
	
	private void printInvoice(String inputSource, String inputDest,
			Driver driver, int totalPrice) {
		System.out.println("");
		System.out.println("--- Details ---");
		System.out.println("--- Price ---");
		System.out.println("Total Rp."+totalPrice);
		System.out.println("--- Driver ---");
		System.out.println("Nama : "+driver.getName());
		System.out.println("Plat Nomor : "+driver.getPlatNo());
		System.out.println("Nomor HP : "+driver.getPhoneNo());
	}
	
}


