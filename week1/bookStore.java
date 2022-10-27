package faizakbarpradipta;

import java.util.Scanner;

public class bookStore {
	
	public final Scanner scan = new Scanner(System.in);
	
	public static void main (String []args) {
		
		bookStore app = new bookStore();
		app.menu();
		
	}
	
	public void menu() {
		System.out.println("--------------------");
		System.out.println("--- MENU ---");
		System.out.println("1.List Buku");
		System.out.println("2.Keluar");
		System.out.println("--------------------");
		
		
		System.out.print("Masukkan pilihan (1/2):");
		
		final byte menu = scan.nextByte();
		System.out.println("pilihan:"+menu);
		System.out.println("--------------------");
		
		if (menu==1) {
				detailBuku();
				inputBook();
		}	
				
		else if (menu ==2) {
				System.out.println("--------------------");
				System.out.println("Aplikasi Berhenti");
				System.out.println("--------------------");
		}
		else {
			System.out.println("--------------------");
			System.out.println("Pilihan anda tidak ada dalam list");
			pilihanKembali();
		}
			
			
	}
	
	public void inputBook() {
		final String bookName ;
		final int bookPrice;
		
		System.out.print("Pilih buku(1/2/3/4):");
		final byte buku = scan.nextByte();
		
		System.out.print("Masukkan jumlah:");
		final int jumlah = scan.nextInt();
		
		System.out.println("");
		System.out.println("pilihan nomor buku:"+buku);
		
		
		switch(buku) { 
		case 1:
			bookName = daftarBuku.JAVA.name;
			bookPrice = daftarBuku.JAVA.price;

			System.out.println("Judul Buku :"+bookName);
			System.out.println("Harga :"+(jumlah*bookPrice));
			pilihanKembali();
			break;
		
		case 2:
			bookName = daftarBuku.KOTLIN.name;
			bookPrice = daftarBuku.KOTLIN.price;
			System.out.println("Judul Buku :"+bookName);
			System.out.println("Harga :"+(jumlah*bookPrice));		
			pilihanKembali();
			break;
		
		case 3:
			bookName = daftarBuku.SPRING.name;
			bookPrice = daftarBuku.SPRING.price;
			System.out.println("Judul Buku :"+bookName);
			System.out.println("Harga :"+(jumlah*bookPrice));			
			pilihanKembali();
			break;
			
		case 4:
			bookName = daftarBuku.ANGULAR.name;
			bookPrice = daftarBuku.ANGULAR.price;
			System.out.println("Judul Buku :"+bookName);
			System.out.println("Harga Total :"+(jumlah*bookPrice));
			pilihanKembali();
			break;
			
		default: 
			System.out.println("--------------------");
			System.out.println("Pilihan anda tidak ada dalam list");
			pilihanKembali();
			break;
		}
	}
	
	public void detailBuku (){
		System.out.println("--------------------");
		System.out.println("----Daftar Buku----");
		System.out.println("1. Java (10000)");
		System.out.println("2. Kotlin (11000)");
		System.out.println("3. Spring (12000)");
		System.out.println("4. Angular (13000)");	
		System.out.println("");
	}
	
	public void pilihanKembali(){
		System.out.println("");
		System.out.println("--------------------");
		System.out.println("Apakah ingin membeli lagi?");
		System.out.println("");
		System.out.println("Jika YA, ketik 1");
		System.out.println("Jika TIDAK, ketik 2");
		System.out.println("");
		
		System.out.print("Masukkan pilihan:");
		final byte menu = scan.nextByte();
		System.out.println("pilihan:"+menu);
		
		if (menu==1) {
			detailBuku();
			inputBook();
		}
		else if (menu==2) {
			menu();
		}
	}
}
