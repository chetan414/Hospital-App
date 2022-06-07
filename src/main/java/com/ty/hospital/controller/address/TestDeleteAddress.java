package com.ty.hospital.controller.address;

import com.ty.hospital.service.imp.AddressServiceImp;

public class TestDeleteAddress {
	public static void main(String[] args) {
		AddressServiceImp addressServiceImp = new AddressServiceImp();

		boolean res = addressServiceImp.deleteAddress(2);
		if (res != false) {
			System.out.println("Data is deleted");
		} else {
			System.out.println("No data is found");
		}
	}
}
