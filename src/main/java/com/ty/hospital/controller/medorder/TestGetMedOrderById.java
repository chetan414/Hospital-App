package com.ty.hospital.controller.medorder;

import java.util.List;

import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Item;
import com.ty.hospital.dto.MedOrder;
import com.ty.hospital.service.imp.MedOrderServiceImp;

public class TestGetMedOrderById {
	public static void main(String[] args) {
		MedOrderServiceImp medOrderServiceImp = new MedOrderServiceImp();
		MedOrder medOrder = medOrderServiceImp.getMedOrderById(4);
		if(medOrder != null)
		{
			List<Item> list = medOrder.getItem();
			Encounter encounter= medOrder.getEncounter();
			System.out.println("Encountre Id     :"+encounter.getId());
			System.out.println("MedOrder  Id     :"+medOrder.getId());
			System.out.println("MedOrder  total  :"+medOrder.getTotal());
			System.out.println("=======================================");
			for(Item item : list)
			{
				System.out.println("Item   Id     :"+item.getId());
				System.out.println("Item   Name   :"+item.getName());
				System.out.println("Item   Cost   :"+item.getCost());
				System.out.println("Item Quantity :"+item.getQuantity());
				System.out.println("Item Type     :"+item.getType());
				System.out.println("------------------------------------");
			}
			
		}
	}
}

