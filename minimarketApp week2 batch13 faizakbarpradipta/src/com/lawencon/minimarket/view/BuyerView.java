package com.lawencon.minimarket.view;

import java.util.ArrayList;
import java.util.List;

import com.lawencon.minimarket.model.CartDetail;
import com.lawencon.minimarket.model.Item;
import com.lawencon.minimarket.utill.ScannerUtill;

public class BuyerView {
	private final List<Item> items;
	private final MainView mainView;
	private final List<CartDetail> cart = new ArrayList<>();

	public BuyerView(List<Item> items, MainView mainView) {
		this.items = items;
		this.mainView = mainView;
	}

	void show() {
		System.out.println("");
		System.out.println("=== Menu Pembeli ===");
		System.out.println("1. List Barang");
		System.out.println("2. Switch User");
		System.out.println("3. Menu Utama");

		System.out.print("Pilih Nomor (1 s.d 3) :");
		final byte input = ScannerUtill.inputByte(3, 1, "Masukkan pilihan:");

		switch (input) {
		case 1:
			showItem();
			break;
		case 2:
			switchUser();
			break;
		case 3:
			showMainMenu();
			break;
		}
	}

	public void showItem() {
		System.out.println("");
		for (int i = 0; i < items.size(); i++) {
			System.out.println((i + 1) + " " + items.get(i).getName() + " " + items.get(i).getPrice());
		}
		System.out.println("");
		System.out.print("Pilih Barang :");
		final int inputItem = ScannerUtill.inputInteger();

		System.out.print("Masukkan jumlah Barang :");
		final int inputQty = ScannerUtill.inputInteger();
		final CartDetail cartDetail = new CartDetail();
		cartDetail.setItems(items);
		cartDetail.setQuantity(inputQty);

		cart.add(cartDetail);
		
		System.out.println("");
		System.out.println("====MENU KERANJANG====");
		System.out.println("");
		int total = 0;
		for (int i = 0; i < cart.size(); i++) {
			System.out.println(cart.get(i).getItems().get(inputItem - 1).getName() + " "
					+ cart.get(i).getItems().get(inputItem - 1).getPrice());
			total += cart.get(i).getItems().get(inputItem - 1).getPrice() * cartDetail.getQuantity();
		}
		System.out.println("Total=" + total);

		buyBackOption();

	}

	void switchUser() {
		mainView.showLogin();
	}

	void showMainMenu() {
		mainView.show();
	}

	void buyBackOption() {
		System.out.println("");
		System.out.println("Apakah ingin membeli lagi?");
		System.out.println("1.YA");
		System.out.println("2.TIDAK");
		final byte chooseType = ScannerUtill.inputByte(2, 1, "Input Pilihan:");
		if (chooseType == 1) {
			showItem();
		} else {
			show();
		}
	}

}
