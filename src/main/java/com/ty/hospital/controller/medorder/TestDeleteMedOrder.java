package com.ty.hospital.controller.medorder;

import com.ty.hospital.dto.MedOrder;
import com.ty.hospital.service.imp.MedOrderServiceImp;

public class TestDeleteMedOrder {
	public static void main(String[] args) {
		MedOrderServiceImp medOrderServiceImp = new MedOrderServiceImp();
		MedOrder medOrder = medOrderServiceImp.deleteMedOrderById(5);
		if (medOrder != null) {
			System.out.println("Data is Deleted");
		} else {
			System.out.println("No data is found");
		}
	}
}
