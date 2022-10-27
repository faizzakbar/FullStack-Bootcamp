package com.lawencon.minimarket.view;

import java.util.List;

import com.lawencon.minimarket.model.Item;
import com.lawencon.minimarket.utill.ScannerUtill;

public class SellerView {
	
	private final List<Item> items;
	private final MainView mainView;

	public SellerView(List<Item> items, MainView mainView) {
		this.items = items;
		this.mainView = mainView;
	}

	void show() {
		System.out.println("");
		System.out.println("=== Menu Penjual ===");
		System.out.println("1. Lihat Item");
		System.out.println("2. Lihat Transaksi Pembeli");
		System.out.println("3. Switch User");
		System.out.println("4. Menu Utama");

		System.out.print("Pilih Nomor (1 s.d 4) :");
		final byte input = ScannerUtill.inputByte(4, 1, "Masukkan pilihan:");

		switch (input) {
		case 1:
			showItem();
			break;
		case 2:
			showTransaction();
			break;
		case 3:
			switchUser();
			break;
		case 4:
			showMainMenu();
			break;
		}
	}

	void showItem() {
		System.out.println("");
		System.out.println("=== Daftar Barang ===");
		System.out.println("");

		for (int i = 0; i < items.size(); i++) {
			System.out.println((i + 1) + " " + items.get(i).getName() + " " + items.get(i).getPrice());
		}
		System.out.println("");

		System.out.println("1. Tambah Barang");
		System.out.println("2. Ubah Barang");
		System.out.println("3. Hapus Barang");
		System.out.println("4. Kembali");
		System.out.print("Pilih Nomor (1 s.d 3) :");
		final byte input = ScannerUtill.inputByte(4, 1, "Masukkan Input:");

		switch (input) {

		case 1:
			inputItem();
			break;
		case 2:
			changeItem();
			break;
		case 3:
			deleteItem();
			break;
		case 4:
			showSellerMenu();
			break;
		}

	}

	void showTransaction() {

	}

	void switchUser() {
		mainView.showLogin();
	}

	void showMainMenu() {
		mainView.show();
	}

	void inputItem() {
		System.out.print("Masukkan nama barang:");
		final String inputName = ScannerUtill.inputString();
		System.out.print("Masukkan harga barang:");
		final int inputPrice = ScannerUtill.inputInteger();
		
		final Item item = new Item();

		item.setName(inputName);
		item.setPrice(inputPrice);

		items.add(item);

		showItem();

	}

	void deleteItem() {
		System.out.print("");
		for (int i = 0; i < items.size(); i++) {
			System.out.println((i + 1) + "." + items.get(i).getName() + " " + items.get(i).getPrice());
		}
		System.out.print("Pilih barang yang ingin dihapus:");
		final int deleteItem = ScannerUtill.inputInteger();
		items.remove(deleteItem - 1);

		showItem();
	}

	void changeItem() {
		for (int i = 0; i < items.size(); i++) {
			System.out.println((i + 1) + " " + items.get(i).getName() + " " + items.get(i).getPrice());
		}
		System.out.println("");
		System.out.print("Pilih barang yang ingin diubah:");
		final int changeItem = ScannerUtill.inputInteger();

		System.out.print("Masukkan nama barang:");
		final String inputName = ScannerUtill.inputString();
		System.out.print("Masukkan harga barang:");
		final int inputPrice = ScannerUtill.inputInteger();
		final Item item = new Item();
		item.setName(inputName);
		item.setPrice(inputPrice);

		items.set(changeItem - 1, item);

		showItem();
	}

	void showSellerMenu() {
		show();
	}
}
