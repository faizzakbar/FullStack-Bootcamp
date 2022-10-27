package com.lawencon.washer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
	public final Scanner scanInt = new Scanner (System.in);
	public final Scanner scanString = new Scanner (System.in);
	public final Scanner scanByte = new Scanner (System.in);
	public final List<String> dirtCloths = new ArrayList<String>();
	public final List<String> washCloths = new ArrayList<String>();
	public final List<String> takeCloths = new ArrayList<String>();
	
	public static void main(String[] args) {
		final App app = new App();
		app.menu();
	}
	
	public void menu(){
		System.out.println("--------------------");
		System.out.println("Menu Utama");
		System.out.println("--------------------");
		System.out.println("1. Masukkan Pakaian Kotor");
		System.out.println("2. Cuci Pakaian");
		System.out.println("3. Ambil Pakaian");
		System.out.println("4. Laporan");
		System.out.println("5. Keluar");
		System.out.println("");
		
		System.out.print("Masukkan pilihan:");
		
		final byte menu = scanInt.nextByte();
		System.out.println("Pilihan:"+menu);
		switch (menu) {
		case 1:
			inputCloth();
			break;
			
		case 2:
			washCloth();
			break;
			
		case 3:
			takeCleancloth();
			break;
			
		case 4:	
			information();
			break;
			
		default:
			exit();
			break;
		}
		
	}
		
	public void inputCloth() {
		
		System.out.println("--------------------");
		final int jumlah = scanning("Masukkan jumlah pakaian kotor:");
		for(int i=0;i<(jumlah);i++) {
			System.out.print("Masukkan Tipe Pakaian:");
			final String pakaian = scanString.nextLine();
			System.out.println("Pakaian:"+pakaian);
			dirtCloths.add(pakaian);
			
		}
		
		System.out.println("");
		System.out.println("Jumlah:"+jumlah);
		
		System.out.println("Apakah ingin memasukkan lagi?");
		System.out.println("");
		System.out.println("Jika YA, ketik 1");
		System.out.println("Jika TIDAK, ketik 2");
		System.out.print("Masukkan Pilihan:");
		final byte pilih = scanInt.nextByte();
		
		if (pilih==1) {
			inputCloth();
		}else {
			menu();
		}
		System.out.println("--------------------");
		
	}
	
	public void washCloth() {
		
		System.out.println("--------------------");
	
		for (String name:dirtCloths) {
			System.out.println(name);
		}

		final int jumlah = scanning("Masukkan jumlah yang mau dicuci:");
		
		if(jumlah<dirtCloths.size() || jumlah==dirtCloths.size()) {
		System.out.println("Jumlah pakaian yang mau dicuci:"+jumlah);
	
		for (int i=0;i<(jumlah);i++) {
			washCloths.add(dirtCloths.get(0));
			dirtCloths.remove(0);
		}
		}else {
			System.out.println("Jumlah pakaian kotor tidak sesuai");
			washCloth();
		}
		System.out.println("--------------------");
		
		backChoice();
	}
	
	public void takeCleancloth() {
	
		System.out.println("--------------------");
		for (String name:washCloths) {
			System.out.println(name);
		}

		final int jumlah = scanning("Masukkan jumlah yang mau diambil:");
		
		if(jumlah<washCloths.size() || jumlah==washCloths.size()) {
		System.out.println("Jumlah pakaian yang mau diambil:"+jumlah);
		
		for(int i=0;i<jumlah;i++) {
			takeCloths.add(washCloths.get(0));
			washCloths.remove(0);
		}
		}else {
			System.out.println("Jumlah pakaian yang dicuci tidak sesuai");
			takeCleancloth();
		}
		System.out.println("--------------------");
		backChoice();
	}
	
	public void information() {
		System.out.println("--------------------");
		System.out.println("Jumlah Pakaian Kotor = "+dirtCloths.size());
		System.out.println("Jumlah Pakaian yang dicuci = "+washCloths.size());
		System.out.println("Jumlah Pakaian bersih = "+takeCloths.size());
		System.out.println("--------------------");
		
		backChoice();
		
	}
	
	public void exit() {
		System.out.println("Aplikasi Keluar");
	}
	
	public int scanning(String msg) {
		 
		try {			
			System.out.println(msg);
			int input = scanInt.nextInt();
			
			return input;
		} catch(InputMismatchException e){
			scanInt.nextLine();
			System.err.println("Format harus angka");
			return scanning("silahkan masukkan lagi:");
		} 	
		}
	
	public void backChoice() {
		System.out.println("Kembali? (jika YA, ketik 1)");
		System.out.println("Jika TIDAK, ketik 2)");
		System.out.print("Masukkan Pilihan:");
		final byte pilih = scanByte.nextByte();
		if (pilih==1) {
			menu();
		}else {
			backChoice();
		}
	}
}
