package com.ty.hospital.service.imp;

import java.util.List;

import com.ty.hospital.dao.imp.MedOrderDaoImp;
import com.ty.hospital.dto.Item;
import com.ty.hospital.dto.MedOrder;
import com.ty.hospital.service.MedOrderService;

public class MedOrderServiceImp implements MedOrderService{
	MedOrderDaoImp medOrderDaoImp = new MedOrderDaoImp();

	public MedOrder saveMedOrder(MedOrder medOrder, int eid) {
		List<Item> list = medOrder.getItem();
		double sum=0;
		for(Item item:list)
		{
			int qun= item.getQuantity();
			double price= item.getCost();
			double price2= qun*price;
			sum+=price2;
		}
		medOrder.setTotal(sum);
		return medOrderDaoImp.saveMedOrder(medOrder, eid);
	}

	public MedOrder getMedOrderById(int id) {
		return medOrderDaoImp.getMedOrderById(id);
	}

	public List<MedOrder> getMedOrderByEncounterId(int eid) {
		return medOrderDaoImp.getMedOrderByEncounterId(eid);
	}

	public List<MedOrder> getMedOrderByPersonId(int pid) {
		return medOrderDaoImp.getMedOrderByPersonId(pid);
	}

	public MedOrder updateMedOrder(MedOrder medOrder,int id) {
		List<Item> list = medOrder.getItem();
		double sum=0;
		for(Item item:list)
		{
			int qun= item.getQuantity();
			double price= item.getCost();
			double price2= qun*price;
			sum+=price2;
		}
		medOrder.setTotal(sum);
		return medOrderDaoImp.updateMedOrder(medOrder,id);
	}

	public MedOrder deleteMedOrderById(int id) {
		return medOrderDaoImp.deleteMedOrderById(id);
	}
	
}

