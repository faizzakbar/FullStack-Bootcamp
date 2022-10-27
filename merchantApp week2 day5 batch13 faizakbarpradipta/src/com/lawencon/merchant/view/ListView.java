package com.lawencon.merchant.view;

import java.util.List;

import com.lawencon.merchant.constant.CategoryConst;
import com.lawencon.merchant.model.CartDetail;
import com.lawencon.merchant.model.Items;
import com.lawencon.merchant.service.ListService;
import com.lawencon.merchant.service.impl.ListServiceImpl;
import com.lawencon.merchant.utill.ScannerUtill;

public class ListView {

	private final CartDetail cartDetail;
	private final ListService listService = new ListServiceImpl();
	private final CategoryConst[] type = CategoryConst.values();
	private final List<Items> listItem;

	private final MainView mainView;

	public ListView(CartDetail cartDetail, MainView mainView, List<Items> listItems) {
		this.cartDetail = cartDetail;
		this.mainView = mainView;
		this.listItem = listItems;

	}

	void show() {
		System.out.println("");
		System.out.println("====Jenis Barang====");
		for (int i = 0; i < type.length; i++) {
			System.out.println((i + 1) + "." + type[i].getTypeItem());
		}

		for (int i = 0; i < listItem.size(); i++) {
			System.out.println((i + 1) + " " + listItem.get(i).getName() + " " + listItem.get(i).getPrice());
		}

		System.out.print("Masukkan pilihan:");
		final byte chooseType = ScannerUtill.inputByte(4, 1, "Input Pilihan:");

		switch (chooseType) {
		case 1:
			showFruits(chooseType);
			break;
		case 2:
			showVegetables(chooseType);
			break;
		case 3:
			showMie(chooseType);
			break;
		case 4:
			showWater(chooseType);
			break;
		default:
			System.out.print("Pilihan tidak ada dalam menu");
		}
	}

	void showFruits(final byte chooseType) {

		System.out.println("");
		System.out.println("====Daftar Buah====");
		System.out.println("");
		final String categoryNameInput = type[chooseType - 1].getTypeItem();

		System.out.println("No|Nama barang|Kode Barang|Harga");
		for (int i = 0; i < listService.getMenu().size(); i++) {
			if (categoryNameInput.equalsIgnoreCase(listService.getMenu().get(i).getCategory())) {
				System.out.println((i + 1) + "." + listService.getMenu().get(i).getName() + " | "
						+ listService.getMenu().get(i).getItemCode() + " | " + listService.getMenu().get(i).getPrice()
						+ " Rupiah");

			}
		}

		System.out.println("");
		System.out.println("Masukkan kode barang:");
		final String inputCode = ScannerUtill.inputString();

		for (int i = 0; i < listService.getMenu().size(); i++) {
			if (inputCode.equalsIgnoreCase(listService.getMenu().get(i).getItemCode())) {
				System.out.print("Masukkan jumlah barang:");
				final int inputQuantity = ScannerUtill.inputInteger();
				final int priceItem = listService.getMenu().get(i).getPrice();
				final int total = inputQuantity * priceItem;
				final String nameItem = listService.getMenu().get(i).getName();
				final Items item = new Items();
				item.setName(nameItem);
				item.setPrice(priceItem);

				listItem.add(item);

				cartDetail.setListDetail(listItem);
				cartDetail.setQuantity(inputQuantity);
				cartDetail.setTotal(total);
				System.out.println("");
				System.out.println("Menu Berhasil dimasukkan keranjang");
				System.out.println("");
				System.out.println(listService.getMenu().get(i).getName() + " "
						+ listService.getMenu().get(i).getPrice() + " " + inputQuantity);

				buyBackOption();
			}
		}

	}

	void showVegetables(int chooseType) {
		System.out.println("");
		System.out.println("====Daftar Sayuran====");
		System.out.println("");
		final String categoryNameInput = type[chooseType - 1].getTypeItem();

		System.out.println("No|Nama barang|Kode Barang|Harga");
		for (int i = 0; i < listService.getMenu().size(); i++) {
			if (categoryNameInput.equalsIgnoreCase(listService.getMenu().get(i).getCategory())) {
				System.out.println((i + 1) + "." + listService.getMenu().get(i).getName() + " | "
						+ listService.getMenu().get(i).getItemCode() + " | " + listService.getMenu().get(i).getPrice()
						+ " Rupiah");

			}
		}

		System.out.println("");
		System.out.println("Masukkan kode barang:");
		final String inputCode = ScannerUtill.inputString();

		for (int i = 0; i < listService.getMenu().size(); i++) {
			if (inputCode.equalsIgnoreCase(listService.getMenu().get(i).getItemCode())) {
				System.out.print("Masukkan jumlah barang:");
				final int inputQuantity = ScannerUtill.inputInteger();
				final int priceItem = listService.getMenu().get(i).getPrice();
				final int total = inputQuantity * priceItem;
				final String nameItem = listService.getMenu().get(i).getName();
				final Items item = new Items();
				item.setName(nameItem);
				item.setPrice(priceItem);

				listItem.add(item);

				cartDetail.setListDetail(listItem);
				cartDetail.setQuantity(inputQuantity);
				cartDetail.setTotal(total);
				System.out.println("");
				System.out.println("Menu Berhasil dimasukkan keranjang");
				System.out.println("");
				System.out.println(listService.getMenu().get(i).getName() + " "
						+ listService.getMenu().get(i).getPrice() + " " + inputQuantity);
				buyBackOption();
			}
		}
	}

	void showMie(int chooseType) {
		System.out.println("");
		System.out.println("====Daftar Mie====");
		System.out.println("");
		final String categoryNameInput = type[chooseType - 1].getTypeItem();

		System.out.println("No|Nama barang|Kode Barang|Harga");
		for (int i = 0; i < listService.getMenu().size(); i++) {
			if (categoryNameInput.equalsIgnoreCase(listService.getMenu().get(i).getCategory())) {
				System.out.println((i + 1) + "." + listService.getMenu().get(i).getName() + " | "
						+ listService.getMenu().get(i).getItemCode() + " | " + listService.getMenu().get(i).getPrice()
						+ " Rupiah");

			}
		}

		System.out.println("");
		System.out.println("Masukkan kode barang:");
		final String inputCode = ScannerUtill.inputString();

		for (int i = 0; i < listService.getMenu().size(); i++) {
			if (inputCode.equalsIgnoreCase(listService.getMenu().get(i).getItemCode())) {
				System.out.print("Masukkan jumlah barang:");
				final int inputQuantity = ScannerUtill.inputInteger();
				final int priceItem = listService.getMenu().get(i).getPrice();
				final int total = inputQuantity * priceItem;

				final String nameItem = listService.getMenu().get(i).getName();
				final Items item = new Items();
				item.setName(nameItem);
				item.setPrice(priceItem);

				listItem.add(item);

				cartDetail.setListDetail(listItem);
				cartDetail.setQuantity(inputQuantity);
				cartDetail.setTotal(total);
				System.out.println("");
				System.out.println("Menu Berhasil dimasukkan keranjang");
				System.out.println("");
				System.out.println(listService.getMenu().get(i).getName() + " "
						+ listService.getMenu().get(i).getPrice() + " " + inputQuantity);
				buyBackOption();
			}
		}
	}

	void showWater(int chooseType) {
		System.out.println("");
		System.out.println("====Daftar Air Mineral====");
		System.out.println("");
		final String categoryNameInput = type[chooseType - 1].getTypeItem();

		System.out.println("No|Nama barang|Kode Barang|Harga");
		for (int i = 0; i < listService.getMenu().size(); i++) {
			if (categoryNameInput.equalsIgnoreCase(listService.getMenu().get(i).getCategory())) {
				System.out.println((i + 1) + "." + listService.getMenu().get(i).getName() + " | "
						+ listService.getMenu().get(i).getItemCode() + " | " + listService.getMenu().get(i).getPrice()
						+ " Rupiah");

			}
		}

		System.out.println("");
		System.out.println("Masukkan kode barang:");
		final String inputCode = ScannerUtill.inputString();

		for (int i = 0; i < listService.getMenu().size(); i++) {
			if (inputCode.equalsIgnoreCase(listService.getMenu().get(i).getItemCode())) {
				System.out.print("Masukkan jumlah barang:");
				final int inputQuantity = ScannerUtill.inputInteger();
				final int priceItem = listService.getMenu().get(i).getPrice();
				final int total = inputQuantity * priceItem;
				final String nameItem = listService.getMenu().get(i).getName();
				final Items item = new Items();
				item.setName(nameItem);
				item.setPrice(priceItem);

				listItem.add(item);

				cartDetail.setListDetail(listItem);
				cartDetail.setQuantity(inputQuantity);
				cartDetail.setTotal(total);
				System.out.println("");
				System.out.println("Menu Berhasil dimasukkan keranjang");
				System.out.println("");
				System.out.println(listService.getMenu().get(i).getName() + " "
						+ listService.getMenu().get(i).getPrice() + " " + inputQuantity);
				buyBackOption();

			}
		}
	}

	void buyBackOption() {
		System.out.println("");
		System.out.println("Apakah ingin membeli lagi?");
		System.out.println("1.YA");
		System.out.println("2.TIDAK");
		final byte chooseType = ScannerUtill.inputByte(2, 1, "Input Pilihan:");
		if (chooseType == 1) {
			show();
		} else {
			mainView.show();
		}
	}
}
