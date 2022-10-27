package com.lawencon.merchant.view;

import java.util.List;

import com.lawencon.merchant.model.CartDetail;
import com.lawencon.merchant.model.Items;
import com.lawencon.merchant.utill.ScannerUtill;

public class CartView {
	private final CartDetail cartDetail;
	private final List<Items> listItems ;
	private final MainView mainView;

	public CartView(CartDetail cartDetail,MainView mainView,List<Items> listItems) {
		this.cartDetail = cartDetail;
		this.mainView = mainView;
		this.listItems = listItems;
	}
		
		
	public void showCart() {
		System.out.println("");
		for (int i =0;i<listItems.size();i++)
		System.out.println(cartDetail.getListDetail().get(i).getName()
				+" "+cartDetail.getListDetail().get(i).getPrice()+" "+cartDetail.getQuantity()
		+" "+cartDetail.getTotal());
		
		System.out.println("1.CheckOut");
		System.out.println("2.Kembali");
		final byte chooseType = ScannerUtill.inputByte(2, 1, "Input Pilihan:");
		if(chooseType==1) {
			showInvoice();
		}else if(chooseType==2) {
		buyBackOption();
		}
	}
	
	
	void buyBackOption() {
		System.out.println("");
		System.out.println("Apakah ingin kembali?");
		System.out.println("1.YA");
		System.out.println("2.TIDAK");
		final byte chooseType = ScannerUtill.inputByte(2, 1, "Input Pilihan:");
		if (chooseType == 1) {
			mainView.show();
			
		} else {
			showCart();
		}
	}
	
	void showInvoice() {
		System.out.println("");
		System.out.println("==INVOICE");
		for (int i =0;i<listItems.size();i++)
			System.out.println(cartDetail.getListDetail().get(i).getName()
					+" "+cartDetail.getListDetail().get(i).getPrice()+" "+cartDetail.getQuantity()
			+" "+cartDetail.getTotal());
		
		mainView.show();
		
		
	}
	
			
}
