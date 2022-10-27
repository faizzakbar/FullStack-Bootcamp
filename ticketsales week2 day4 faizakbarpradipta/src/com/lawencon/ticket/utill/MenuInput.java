package com.lawencon.ticket.utill;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuInput {
	private static final Scanner scanByte = new Scanner(System.in);
	private static final Scanner scanInteger = new Scanner(System.in);
	private static final Scanner scanFloat = new Scanner(System.in);
	private static final Scanner scanString = new Scanner(System.in);

	public static byte inputByte(int upto, int lowto, String message) {
		try {
			byte userInput = scanByte.nextByte();
			if (userInput <= upto && userInput >= lowto) {
				return userInput;
			} else {
				System.out.println("Pilihan tidak ada dalam menu!");
				return (inputByte(upto, lowto, message));
			}
		} catch (InputMismatchException e) {
			scanByte.nextLine();
			System.err.println("Error, masukkan angka: ");
			return inputByte(upto, lowto, message);
		}
	}

	public static int inputInteger(int upto, int lowto, String message) {
		try {
			int userInput = scanInteger.nextInt();
			if (userInput <= upto && userInput >= lowto) {
				return userInput;
			} else {
				System.out.println("Pilihan tidak ada dalam menu!");
				return (inputByte(upto, lowto, message));
			}
		} catch (InputMismatchException e) {
			scanInteger.nextLine();
			System.err.println("Error, masukkan angka: ");
			return inputInteger(upto, lowto, message);
		}
	}

	public static float inputFloat() {
		try {
			float userInput = scanFloat.nextFloat();
			return userInput;
		} catch (InputMismatchException e) {
			scanFloat.nextLine();
			System.err.println("Error, masukkan angka: ");
			return inputFloat();
		}
	}

	public static String inputString() {
		try {

			String userInput = scanString.nextLine();
			return userInput;
		} catch (InputMismatchException e) {
			scanString.nextLine();
			System.err.println("Error, masukkan huruf:");
			return inputString();
		}
	}
}
