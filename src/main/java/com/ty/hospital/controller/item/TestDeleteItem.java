package com.ty.hospital.controller.item;

import com.ty.hospital.service.imp.ItemServiceImp;

public class TestDeleteItem {
	public static void main(String[] args) {
		ItemServiceImp itemServiceImp = new ItemServiceImp();
		boolean item = itemServiceImp.deleteItemById(7);
		if (item != false) {
			System.out.println("Data is deleted");
		} else {
			System.out.println("No data is founds");
		}
	}
}
