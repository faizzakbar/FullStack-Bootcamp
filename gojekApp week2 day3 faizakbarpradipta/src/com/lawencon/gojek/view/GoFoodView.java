package com.lawencon.gojek.view;

import java.util.ArrayList;
import java.util.List;

import com.lawencon.gojek.model.Cart;
import com.lawencon.gojek.model.CartDetail;
import com.lawencon.gojek.model.Driver;
//import com.lawencon.gojek.model.Restaurant;
import com.lawencon.gojek.service.RestaurantService;
import com.lawencon.gojek.service.impl.GoFoodServiceImpl;
import com.lawencon.gojek.service.impl.RestaurantServiceImpl;
import com.lawencon.gojek.utill.MenuInput;

public class GoFoodView {

	private final RestaurantService restorantService = new RestaurantServiceImpl();
	private final GoFoodServiceImpl goFoodService = new GoFoodServiceImpl();

	private final Cart cart = new Cart();
	private final List<CartDetail> listCart = new ArrayList<>();

	private byte chooseResto;
	private byte chooseMenu;
	private int inputQuantity;
	private String menu;
	private int price;
	private int total;

	void show() {
		System.out.println("");
		System.out.println("+++ Go Food +++");

		showResto();
		System.out.println("Pilih Restoran");
		chooseResto = MenuInput.inputByte(5,1, "pilih resto:");

		cart.setResto(restorantService.getResto().get(chooseResto - 1));
		if (chooseResto < 6 && chooseResto > 0) {
			showFood();
			backMenu();
		} else {
			System.out.println("Pilihan tidak ada dalam menu");
		}

	}

	public void buybackChoose() {
		System.out.println("===============");
		System.out.println("1. Beli Lagi");
		System.out.println("2. Check Out");
		System.out.println("3. Menu Kembali");
		chooseMenu = MenuInput.inputByte(3,1, "masukkan pilihan:");

		if (chooseMenu >3 && chooseMenu<1) {
			System.out.println("Pilihan tidak ada di menu");
		}else {
		switch (chooseMenu) {
		case 1:
			showFood();
			break;
		case 2:
			//Driver driver = goFoodService.findDriver();
			printInvoice();
			cart.setList(listCart);
			
			break;
		case 3:
			show();
		default:
			System.out.println("Pilihan tidak ada di menu");
			break;
		}
		}
	}

	public void printInvoice() {
		System.out.println("Input pickup address");
		String inputSource = MenuInput.inputString();
		
		System.out.println("Input destination");
		String inputDest = MenuInput.inputString();
		
		Driver driver = goFoodService.findDriver();
		//CartDetail cartDetail = new CartDetail();
		System.out.println("====Invoice====");
		
		int total=0;
		for(int i=0;i<listCart.size();i++) {
			System.out.println(listCart.get(i).getMenu()+" "+listCart.get(i).getQuantity()
					);
			
			total+=listCart.get(i).getTotal();
			System.out.println("Grand Total:"+total);
		}
		System.out.println("");
		System.out.println("Tujuan : "+inputDest);
		System.out.println("Alamat Pengirim : "+inputSource);
		
		System.out.println("====Driver====");
		System.out.println("Nama : "+driver.getName());
		System.out.println("Plat Nomor : "+driver.getPlatNo());
		System.out.println("Nomor HP : "+driver.getPhoneNo());
		
	}

	public void showResto() {
		System.out.println("====Daftar Resto====");
		for (int i = 0; i < restorantService.getResto().size(); i++) {

			System.out.println((i + 1) + "." + restorantService.
					getResto().get(i).getName());
		}

		
	}

	public void showFood() {
		System.out.println("====Menu====");
		
		final int restoSize = restorantService.getResto().size();
		for (int i = 0; i < restoSize ; i++) {

			System.out.println((i + 1) + "." 
			+ restorantService.getResto().get(chooseResto - 1).getMenu().get(i).getName()
							+ " " + restorantService.getResto().get(chooseResto - 1).getMenu().get(i).getPrice());
		}
		
		
		System.out.print("Pilih Menu");
		chooseMenu = MenuInput.inputByte(restoSize, 1, "masukkan menu:");

		menu = restorantService.getResto().get(chooseMenu - 1).getMenu().get(chooseMenu - 1).getName();
		price = restorantService.getResto().get(chooseResto - 1).getMenu().get(chooseMenu - 1).getPrice();

		System.out.print("Masukkan Jumlah");
		inputQuantity = MenuInput.inputInteger(10000, 1, "Masukkan Jumlah:");
		total = price * inputQuantity;

		if (chooseMenu < 6 && chooseMenu > 0) {

			CartDetail cartDetail = new CartDetail();

			cartDetail.setMenu(menu);
			cartDetail.setQuantity(inputQuantity);
			cartDetail.setTotal(total);

			listCart.add(cartDetail);

			buybackChoose();

		} else {
			System.out.println("Pilihan tidak ada dalam menu");
			show();
		}
	}
	
	public void backMenu() {
		System.out.println("Apakah kembali?");
		System.out.println("1.kembali");
		System.out.println("2.Menu Utama");
		final byte input = MenuInput.inputByte(2,1, "masukkan Pilihan:");
		if (input==1) {
			show();
		}else {
			MainView mainView = new MainView();
			mainView.show();
		}
	}

}
