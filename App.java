import java.util.Scanner;

public class App {
	
	//note dari mas Imam
	//float  dijadikan lokal;
	
	public float luas;
	public float keliling;
	
	public static Scanner scanInt = new Scanner(System.in);
	public static Scanner scanFloat = new Scanner(System.in);
	
	public static void main(String[] args) {
		App app = new App();
		app.bangunDatar();
	}
	
	
	public void bangunDatar(){
		System.out.println("1.Persegi");
		System.out.println("2.Persegi Panjang");
		System.out.println("3.Segitiga");
		System.out.println("4.lingkaran");
		
		//Scanner scanInt = new Scanner(System.in);
		System.out.print("Pilih Menu (1/2/3/4):");
		short pilih = scanInt.nextShort();
		System.out.println("Menu:" +pilih);
		
		switch (pilih) {
		case 1 :
			inputPersegi();
			System.out.println("luas persegi =" + luasPersegi(3));
			System.out.println("keliling persegi =" + kelilingPersegi(3));
			break;
		
		case 2 :
			inputPersegipanjang();
			System.out.println("luas persegi panjang =" + luasPersegipanjang(2,3));
			System.out.println("keliling persegi panjang =" + kelilingPersegipanjang(2,3));
			
			break;
			
		case 3 :
			inputSegitiga();
			System.out.println("luas segitiga =" + luasSegitiga(2,3));
			System.out.println("keliling segitiga =" + kelilingSegitiga(2));
			break;
			
		case 4 :
			inputLingkaran() ;
			System.out.println("luas segitiga =" + luasLingkaran(4));
			System.out.println("keliling segitiga =" + kelilingLingkaran(4));
			break;
	
	}
	}
	
	
	public float inputPersegi() {
		//Scanner scanSisi = new Scanner(System.in);
		System.out.print("Masukkan sisi:");
		float sisi = scanFloat.nextFloat();
		System.out.println("sisi : " +sisi);
		return sisi;
		
	}
	
	public float inputPersegipanjang() {
		//Scanner scanPanjang = new Scanner(System.in);
		System.out.print("Masukkan panjang:");
		float panjang = scanFloat.nextFloat();
		
		System.out.print("Masukkan lebar:");
		float lebar = scanFloat.nextFloat();
		return panjang + lebar;
		
	}
	
	public float inputSegitiga() {
		
		System.out.print("Masukkan alas:");
		final float alas = scanFloat.nextFloat();
		System.out.println("alas : " +alas);
		
		System.out.print("Masukkan Tinggi:");
		final float tinggi = scanFloat.nextFloat();
		System.out.println("Tinggi : " +tinggi);
		return alas + tinggi;
	}
	
	public float inputLingkaran() {
		System.out.print("Masukkan jari-jari:");
		final float jari = scanFloat.nextFloat();
		System.out.println("jari-jari : " +jari);
		return jari;
	}
	
	final public float luasPersegi(float sisi) {
		return luas = sisi *sisi;
	}
	
	final public float kelilingPersegi(float sisi) {
		return keliling = sisi*4;
	}
	
	public float luasPersegipanjang(float panjang, float lebar) {
		return luas = panjang*lebar;
	}
	
	public float kelilingPersegipanjang(float panjang, float lebar) {
		return keliling = (panjang*2)+(lebar*2);
	}
	
	public float luasSegitiga(float alas, float tinggi) {
		return luas = alas*tinggi/2;
	}
	
	public float kelilingSegitiga(float alas) {
		return keliling = alas*3;
	}
	
	public float luasLingkaran(float jari) {
		return luas = jari*22/7*jari;
	}
	public float kelilingLingkaran(float jari) {
		return keliling = jari*2*22/7;
	}
	
}
