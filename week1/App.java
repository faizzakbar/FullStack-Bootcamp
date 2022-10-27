package faizakbar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public final Books[] list = Books.values(); // variable global harus public final
	public final List<String> nameArray = new ArrayList<String>();
	public final List<Integer> quantityArray = new ArrayList<Integer>();

	final public Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		final App app = new App();
		app.showMenu();

	}

	public void showMenu() {
		System.out.println("--------------------");
		System.out.println("--- MENU ---");
		System.out.println("1.List Buku");
		System.out.println("2.Keranjang");
		System.out.println("3.Keluar");
		System.out.println("--------------------");

		System.out.print("Masukkan pilihan (1/2/3):");

		final byte menu = scan.nextByte();
		System.out.println("pilihan:" + menu);
		System.out.println("--------------------");

		// diganti switch karena kondisinya tidak kompleks dan isinya lebih dari 2
		switch (menu) {

		case 1:
			detailBook();

		case 2:
			showMenuchart();

		case 3:
			System.out.println("--------------------");
			System.out.println("Aplikasi Berhenti");
			System.out.println("--------------------");

		default:
			System.out.println("--------------------");
			System.out.println("Pilihan anda tidak ada dalam list");
			backChoice();
		}
	}

	public void detailBook() {
		System.out.println("--------------------");
		System.out.println("----Daftar Buku----");

		for (int i = 0; i < list.length; i++) {
			System.out.print((i + 1) + "." + list[i].name + list[i].price);
			System.out.println(list[i].price);
		}

		System.out.println("");

		inputBook();
	}

	public void showMenuchart() {
		int grandTotal = 0;
		System.out.println("--------------------");
		System.out.println("----KERANJANG BELANJA-----");
		// manggil arraylist
		for (int i = 0; i < nameArray.size(); i++) {
			System.out.print((i + 1) + "." + nameArray.get(i));
			System.out.print(" @" + quantityArray.get(i));

			Books book = Books.valueOf(nameArray.get(i)); // arraylist ambi dari enum
			final int total = book.price * quantityArray.get(i);

			System.out.println("" + book.price * quantityArray.get(i));
			// harusnya system.out.prinln(total);

			// total harus static
			grandTotal += total;
		}

		System.out.println("");
		System.out.println("grand total:" + grandTotal);
		System.out.println("--------------------");

		showSubmenuKeranjang();

	}

	public void deleteItems() {
		for (int i = 0; i < nameArray.size(); i++) {
			System.out.println((i + 1) + "." + list[i].name + list[i].price);
		}
		System.out.print("Pilih Buku:");
		final byte items = scan.nextByte();
		nameArray.remove(items - 1);

		showMenuchart();

	}

	public void changeItems() {

	}

	public void deleteAll() {

		nameArray.clear();
		quantityArray.clear();
	}

	public void inputBook() {

		System.out.print("Pilih buku yang ingin dibeli(1/2/3/4):");
		final byte bookNumber = scan.nextByte();

		System.out.print("Masukkan jumlah:");
		final int quantity = scan.nextInt();

		System.out.println("");
		System.out.println("pilihan nomor buku:" + bookNumber);

		nameArray.add(list[bookNumber - 1].toString()); // template masukin array ke arraylist
		quantityArray.add(quantity);

		backChoice();

	}

	public void backChoice() {

		System.out.println("");
		System.out.println("--------------------");
		System.out.println("Apakah ingin membeli lagi?");
		System.out.println("Jika YA, ketik 1");
		System.out.println("Jika TIDAK, ketik 2");

		System.out.print("Masukkan pilihan:");
		final byte menu = scan.nextByte();
		System.out.println("pilihan:" + menu);

		if (menu == 1) {
			detailBook();
			inputBook();
		} else if (menu == 2) {
			showMenu();
		}
	}

	public void showSubmenuKeranjang() {
		System.out.println("1. Kembali ke menu utama (ketik 1)");
		System.out.println("2.Tetap di menu keranjang (ketik 2)");
		System.out.println("3.Tambah Jumlah barang(ketik 3)");
		System.out.println("4.Hapus barang (ketik 4)");
		System.out.println("5. Hapus semua list belanja (ketik 5)");
		System.out.print("Masukkan pilihan:");
		final byte book = scan.nextByte();
		switch (book) {
		case 1:
			showMenu();

		case 2:
			showMenuchart();

		case 3:
			changeItems();

		case 4:
			deleteItems();

		case 5:
			deleteAll();
			showMenuchart();

		default:
			System.out.println("pilihan error");
		}
	}

	public void checkIsi() {

	}
	// edit tanggal TAKE HOME

}
