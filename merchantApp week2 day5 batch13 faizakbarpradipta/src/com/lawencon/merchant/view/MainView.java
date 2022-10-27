package com.lawencon.merchant.view;

import java.util.ArrayList;
import java.util.List;

import com.lawencon.merchant.model.CartDetail;
import com.lawencon.merchant.model.Items;
import com.lawencon.merchant.service.ListService;
import com.lawencon.merchant.service.impl.ListServiceImpl;
import com.lawencon.merchant.utill.ScannerUtill;

public class MainView {

	private final CartDetail cartDetail = new CartDetail();
	private final List<Items> listItem = new ArrayList<Items>();

	public void show() {
		System.out.println("");
		System.out.println("=== Aplikasi Pedagang Asongan ===");
		System.out.println("1. List Barang");
		System.out.println("2. Keranjang Belanja");
		System.out.println("3. Keluar");

		System.out.print("Pilih Nomor (1 s.d 3) :");

		byte input = ScannerUtill.inputByte(3, 1, "Masukkan Pilihan:");

		switch (input) {
		case 1:
			ListView listView = new ListView(cartDetail, this, listItem);
			listView.show();
			break;
		case 2:
			CartView cartView = new CartView(cartDetail, this, listItem);
			cartView.showCart();
			break;
		case 3:
//			GoFoodView goFoodView = new GoFoodView();
//			goFoodView.show();
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
