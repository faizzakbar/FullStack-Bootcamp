package com.lawencon.minimarket.view;

import java.util.ArrayList;
import java.util.List;

import com.lawencon.minimarket.constant.UserConst;
import com.lawencon.minimarket.model.Item;
import com.lawencon.minimarket.utill.ScannerUtill;

public class MainView {

	private final List<Item> items = new ArrayList<Item>();
	private SellerView sellerView;
	private BuyerView buyerView;

	public void show() {

		System.out.println("");
		System.out.println("=== Aplikasi Minimarket ===");
		System.out.println("1. Login");
		System.out.println("2. Keluar");

		System.out.print("Pilih Nomor (1 s.d 2) :");

		final byte input = ScannerUtill.inputByte(2, 1, "Masukkan pilihan:");

		if (input == 1) {
			showLogin();
		} else if (input == 2) {
			showExit();
		}
	}

	public void showLogin() {
		final UserConst[] userInput = UserConst.values();

		System.out.println("1. Penjual");
		System.out.println("2. Pembeli");

		System.out.print("Pilih Nomor (1 s.d 2) :");

		final byte input = ScannerUtill.inputByte(2, 1, "Masukkan Pilihan:");

		if (input == 1) {

			System.out.print("Masukkan username:");
			final String inputUsername = ScannerUtill.inputString();
			System.out.print("Masukkan password:");
			final String inputPassword = ScannerUtill.inputString();

			boolean found = false;

			for (int i = 0; i < userInput.length; i++) {

				if (inputUsername.equals(userInput[input - 1].getUsername())
						&& inputPassword.equals(userInput[input - 1].getPassword())) {

					sellerView = new SellerView(items, this);

					sellerView.show();

					found = true;
				}
			}

			if (found == false) {
				System.out.println("username atau password salah");
				showLogin();
			}
		} else if (input == 2) {
			System.out.print("Masukkan username:");
			final String inputUsername = ScannerUtill.inputString();
			System.out.print("Masukkan password:");
			final String inputPassword = ScannerUtill.inputString();

			boolean found = false;

			for (int i = 0; i < userInput.length; i++) {

				if (inputUsername.equals(userInput[input - 1].getUsername())
						&& inputPassword.equals(userInput[input - 1].getPassword())) {

					buyerView = new BuyerView(items, this);

					buyerView.show();

					found = true;
				}
			}

			if (found == false) {
				System.out.println("username atau password salah");
				showLogin();
			}
		}

	}

	public void showExit() {
		System.out.print("Aplikasi Berhenti");
	}

}