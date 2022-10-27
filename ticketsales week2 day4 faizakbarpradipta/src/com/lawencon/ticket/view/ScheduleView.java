package com.lawencon.ticket.view;

import com.lawencon.ticket.constant.TypeConst;
import com.lawencon.ticket.service.ScheduleService;
import com.lawencon.ticket.service.impl.ScheduleServiceImpl;
import com.lawencon.ticket.utill.MenuInput;

public class ScheduleView {

	private final ScheduleService scheduleService = new ScheduleServiceImpl();
	private final TypeConst[] type = TypeConst.values();

	void show() {
		System.out.println("");
		System.out.println("====Jenis Kendaraan====");
		for (int i = 0; i < type.length; i++) {
			System.out.println((i + 1) + "." + type[i].typeVehicle);
		}

		System.out.print("Masukkan pilihan:");
		final int chooseType = MenuInput.inputInteger(3, 1, "Masukkan Pilihan:");

		switch (chooseType) {
		case 1:
			showBus();
		case 2:
			showPlane();
		case 3:
			showTrain();
		}
	}

	public void showBus() {
		System.out.println("");
		System.out.println("====Menu Bus====");
		System.out.println("--Waktu Keberangkatan--");
		for (int i = 0; i < scheduleService.getSchedule().size(); i++) {

			System.out.println((i + 1) + "." + scheduleService.getSchedule().get(i).getDate());
		}

		System.out.print("Masukkan pilihan");
		final byte chooseTime = MenuInput.inputByte(5, 1, "Masukkan Pilihan:");

		System.out.println("");
		System.out.println("--Pilihan Tempat Duduk--");
		for (int i = 0; i < scheduleService.getVehicles().size(); i++) {

			System.out.println((i + 1) + "." + scheduleService.getVehicles().get(i).getList().get(i).getSeat());
		}

		System.out.print("Pilih Tempat Duduk:");
		final byte chooseSeat = MenuInput.inputByte(3, 1, "Masukkan pilihan:");
		System.out.println("Masukkan Nama Penumpang:");
		final String inputNameId = MenuInput.inputString();
		System.out.println("Masukkan Nomor KTP Penumpang:");
		final String inputNoId = MenuInput.inputString();

		final String type = scheduleService.getVehicles().get(0).getType();
		final String date = scheduleService.getSchedule().get(chooseTime - 1).getDate();
		final String seatNo = scheduleService.getVehicles().get(0).getList().get(chooseSeat - 1).getSeat();
		final int price = scheduleService.getVehicles().get(0).getPrice();

		System.out.println("===Invoice===");
		System.out.println("Nama Penumpang:" + inputNameId);
		System.out.println("Nomor KTP Penumpang:" + inputNoId);
		System.out.println("Jenis kendaraan:" + type);
		System.out.println("Waktu Keberangkatan:" + date);
		System.out.println("Nomor Tempat Duduk:" + seatNo);
		System.out.println("Harga:" + price);

		backMenu();
	}

	public void showTrain() {
		System.out.println("");
		System.out.println("====Menu Pesawat====");
		System.out.println("--Waktu Keberangkatan--");
		for (int i = 0; i < scheduleService.getSchedule().size(); i++) {

			System.out.println((i + 1) + "." + scheduleService.getSchedule().get(i).getDate());
		}

		System.out.print("Masukkan pilihan");
		final byte chooseTime = MenuInput.inputByte(5, 1, "Masukkan Pilihan:");

		System.out.println("");
		System.out.println("--Pilihan Tempat Duduk--");
		for (int i = 0; i < scheduleService.getVehicles().size(); i++) {

			System.out.println((i + 1) + "." + scheduleService.getVehicles().get(i).getList().get(i).getSeat());
		}

		System.out.print("Pilih Tempat Duduk:");
		final byte chooseSeat = MenuInput.inputByte(3, 1, "Masukkan pilihan:");
		System.out.println("Masukkan Nama Penumpang:");
		final String inputNameId = MenuInput.inputString();
		System.out.println("Masukkan Nomor KTP Penumpang:");
		final String inputNoId = MenuInput.inputString();

		final String type = scheduleService.getVehicles().get(1).getType();
		final String date = scheduleService.getSchedule().get(chooseTime - 1).getDate();
		final String seatNo = scheduleService.getVehicles().get(1).getList().get(chooseSeat - 1).getSeat();
		final int price = scheduleService.getVehicles().get(1).getPrice();

		System.out.println("===Invoice===");
		System.out.println("Nama Penumpang:" + inputNameId);
		System.out.println("Nomor KTP Penumpang:" + inputNoId);
		System.out.println("Jenis kendaraan:" + type);
		System.out.println("Waktu Keberangkatan:" + date);
		System.out.println("Nomor Tempat Duduk:" + seatNo);
		System.out.println("Harga:" + price);

		backMenu();
	}

	public void showPlane() {
		System.out.println("");
		System.out.println("====Menu Kereta====");
		System.out.println("--Waktu Keberangkatan--");
		for (int i = 0; i < scheduleService.getSchedule().size(); i++) {

			System.out.println((i + 1) + "." + scheduleService.getSchedule().get(i).getDate());
		}

		System.out.print("Masukkan pilihan");
		final byte chooseTime = MenuInput.inputByte(5, 1, "Masukkan Pilihan:");

		System.out.println("");
		System.out.println("--Pilihan Tempat Duduk--");
		for (int i = 0; i < scheduleService.getVehicles().size(); i++) {

			System.out.println((i + 1) + "." + scheduleService.getVehicles().get(i).getList().get(i).getSeat());
		}

		System.out.print("Pilih Tempat Duduk:");
		final byte chooseSeat = MenuInput.inputByte(3, 1, "Masukkan pilihan:");
		System.out.println("Masukkan Nama Penumpang:");
		final String inputNameId = MenuInput.inputString();
		System.out.println("Masukkan Nomor KTP Penumpang:");
		final String inputNoId = MenuInput.inputString();

		final String type = scheduleService.getVehicles().get(2).getType();
		final String date = scheduleService.getSchedule().get(chooseTime - 1).getDate();
		final String seatNo = scheduleService.getVehicles().get(2).getList().get(chooseSeat - 1).getSeat();
		final int price = scheduleService.getVehicles().get(2).getPrice();

		System.out.println("===Invoice===");
		System.out.println("Nama Penumpang:" + inputNameId);
		System.out.println("Nomor KTP Penumpang:" + inputNoId);
		System.out.println("Jenis kendaraan:" + type);
		System.out.println("Waktu Keberangkatan:" + date);
		System.out.println("Nomor Tempat Duduk:" + seatNo);
		System.out.println("Harga:" + price);

		backMenu();
	}

	public void backMenu() {

		System.out.println("Apakah kembali?");
		System.out.println("1.kembali");
		System.out.println("2.Menu Utama");
		final byte input = MenuInput.inputByte(2, 1, "Masukkan Pilihan:");
		if (input == 1) {
			show();
		} else {
			MainView mainView = new MainView();
			mainView.show();
		}

	}
}
