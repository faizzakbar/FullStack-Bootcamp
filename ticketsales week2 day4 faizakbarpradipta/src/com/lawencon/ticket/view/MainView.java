package com.lawencon.ticket.view;

import com.lawencon.ticket.utill.MenuInput;

public class MainView {

	public void show() {
		System.out.println("");
		System.out.println("=== Aplikasi Ticket ===");
		System.out.println("1. Jadwal Keberangkatan");
		System.out.println("2. Histori");
		System.out.println("3. Keluar");

		System.out.print("Pilih Nomor (1 s.d 3) :");
		byte input = MenuInput.inputByte(3, 1, "Masukkan Pilihan:");

		switch (input) {
		case 1:
			ScheduleView schedule = new ScheduleView();
			schedule.show();

			break;
		case 2:
			System.out.println("Menu History");
			MainView mainView = new MainView();
			mainView.show();
			break;
		case 3:
			System.out.println("Aplikasi Berhenti");
			break;
		default:
			System.out.println("Pilihan tidak ada di dalam menu");
			show();
			break;

		}

	}
}
