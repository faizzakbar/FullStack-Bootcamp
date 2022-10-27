package com.lawencon.gojek.view;

//import java.util.Scanner;

import com.lawencon.gojek.utill.MenuInput;



public class MainView {
	//private final Scanner scanByte = new Scanner(System.in);
	
	private byte input;
	
	public void show() {
		System.out.println("");
		System.out.println("=== Gojek ===");
		System.out.println("1. Go-Ride");
		System.out.println("2. Go-Send");
		System.out.println("3. Go-Food");
		System.out.println("4. Exit");
		
		System.out.print("Pilih Nomor (1 s.d 4) :");
		
		input = MenuInput.inputByte(4, 1, "Mesukkan Pilihan:");
		
		switch (input) {
		case 1: 
			GoRideView goRideView = new GoRideView();
			goRideView.show();
			break;
		case 2: 
			GoSendView goSendView = new GoSendView();
			goSendView.show();
			break;
		case 3:
			GoFoodView goFoodView = new GoFoodView();
			goFoodView.show();
			break;
		case 4:
			System.out.println("Aplikasi Berhenti");
			break;
		default: 
			System.out.println("Pilihan tidak ada di dalam menu");
			show();
			break;
		
		}
}
	
}