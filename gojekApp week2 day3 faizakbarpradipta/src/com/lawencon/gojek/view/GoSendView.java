package com.lawencon.gojek.view;

import com.lawencon.gojek.constant.TypeConst;
import com.lawencon.gojek.model.Driver;

import com.lawencon.gojek.service.GoSendService;

import com.lawencon.gojek.service.impl.GosendServiceImpl;
import com.lawencon.gojek.utill.MenuInput;

public class GoSendView {
	
	private final GoSendService goSendService = new GosendServiceImpl();
	private final TypeConst[] type = TypeConst.values();
	private byte chooseType;
	private int inputWeight;
	private String inputSender;
	private String inputReceiver;
	private String inputItemName;
	
	void show() {
		System.out.println("");
		System.out.println("+++ Go Send +++");
		final int typeLength = type.length;
		for(int i=0;i<typeLength;i++) {
			System.out.println((i+1)+"."+type[i].typeItem);
		}
		
		System.out.println("Masukkan Jenis Barang");
		chooseType = MenuInput.inputByte(typeLength,1 , "");
		
		if (chooseType >5 || chooseType<1) {
			System.out.println("Pilihan tidak ada di dalam menu");
			show();
		}else  {
			System.out.println("Masukkan Nama Barang");
			inputItemName = MenuInput.inputString();
			
			System.out.println("Masukkan Berat Barang");
			inputWeight = MenuInput.inputInteger(1000000, 1, "");
					
			System.out.println("Masukkan alamat pengirim");
			inputSender = MenuInput.inputString();
			
			System.out.println("Masukkan alamat penerima");
			inputReceiver = MenuInput.inputString();
			
			Driver driver = goSendService.getDriver();
			int totalPrice = goSendService
					.calculatePrice(inputSender,inputReceiver,inputWeight);
			
			printInvoice(chooseType,inputItemName,inputWeight,inputSender, inputReceiver,
					driver, totalPrice);
			
			backMenu();
		}
		
		
	}
	
	private void printInvoice(byte chooseType,String inputItemName,int inputWeight, String inputSender, String inputReceiver,
			Driver driver, int totalPrice) {
		
		System.out.println("+++ Details +++");
		System.out.println("+++ Price +++");
		System.out.println("Total = Rp. "+totalPrice);
		System.out.println("+++ Driver +++");
		System.out.println("Name : "+driver.getName());
		System.out.println("Plat Number : "+driver.getPlatNo());
		System.out.println("Phone Number : "+driver.getPhoneNo());

	}
	
	public void backMenu() {
		System.out.println("Apakah kembali?");
		System.out.println("1.kembali");
		System.out.println("2.Menu Utama");
		byte input = MenuInput.inputByte(2,1, "");
		if (input==1) {
			show();
		}else {
			MainView mainView = new MainView();
			mainView.show();
		}
	}
}
