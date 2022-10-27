package com.lawencon.twodimensionalfigure;

import java.util.Scanner;

public class App {
	
	//public static Scanner scanInt = new Scanner(System.in);
	public static Scanner scanFloat = new Scanner(System.in);
	public static Scanner scanByte = new Scanner(System.in);
	
	public static void main(String[] args) {
		final App app = new App(); //final
		app.twoDimensional(); //bahasainggris

	}
	
	public void twoDimensional(){
	showChooseMenu();	
	final byte choose = scanByte.nextByte(); //final
	System.out.println("Menu:" +choose);
	switch (choose) {
	case 1 :
		System.out.print("Masukkan sisi:");
		final float side = scanFloat.nextFloat();
		System.out.println("sisi : " +side);
		

		Rectangle app = new Rectangle(side);
		app.calculateArea();
		app.calculatePerimeter();
		final float area = app.calculateArea();
		final float perimeter = app.calculatePerimeter();
		System.out.println("luas persegi =" +area);
		System.out.println("keliling persegi =" +perimeter);
		break;
	
	case 2 :
		System.out.print("Masukkan panjang:");
		final float length = scanFloat.nextFloat();
		
		System.out.print("Masukkan lebar:");
		final float width = scanFloat.nextFloat();
		
		Rectangular app2 = new Rectangular(length,width);
		app2.calculateArea();
		app2.calculatePerimeter();
		final float areaRectangular = app2.calculateArea();
		final float perimeterRectangular = app2.calculatePerimeter();
		System.out.println("luas persegi panjang =" +areaRectangular);
		System.out.println("keliling persegi panjang ="+ perimeterRectangular );
		
		break;
		
	case 3 :
		System.out.print("Masukkan alas:");
		final float pedestal = scanFloat.nextFloat();
		System.out.println("alas : " +pedestal);
		
		System.out.print("Masukkan Tinggi:");
		final float tall = scanFloat.nextFloat();
		System.out.println("Tinggi : " +tall);

		Triangle app3 = new Triangle(pedestal,tall);
		app3.calculateArea();
		app3.calculatePerimeter();
		final float areaTriangle = app3.calculateArea();
		final float perimeterTriangle = app3.calculatePerimeter();
		System.out.println("luas segitiga =" +areaTriangle);
		System.out.println("keliling segitiga =" +perimeterTriangle);
		break;
		
	case 4 :
		System.out.print("Masukkan jari jari:");
		final float radius = scanFloat.nextFloat();
		System.out.println("jari jari : " +radius);
		
		Rectangle app4 = new Rectangle(radius);
		app4.calculateArea();
		app4.calculatePerimeter();
		final float areaCircle = app4.calculateArea();
		final float perimeterCircle = app4.calculatePerimeter();

		
		System.out.println("luas lingkaran ="+areaCircle );
		System.out.println("keliling lingkaran =" +perimeterCircle);
		break;
		
	default:
			System.out.println("Pilihn tidak ada di menu" ); //tidak ada pilihan default
			twoDimensional();
			}
}

	public void showChooseMenu() {
		System.out.println("1.Persegi");
		System.out.println("2.Persegi Panjang");
		System.out.println("3.Segitiga");
		System.out.println("4.lingkaran");
		

		System.out.print("Pilih Menu (1/2/3/4):");
		
	}
	
	}
