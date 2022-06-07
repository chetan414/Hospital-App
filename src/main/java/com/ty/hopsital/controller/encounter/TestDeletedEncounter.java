package com.ty.hopsital.controller.encounter;

import com.ty.hospital.service.imp.EncounterServiceImp;

public class TestDeletedEncounter {
	public static void main(String[] args) {
		EncounterServiceImp encounterServiceImp = new EncounterServiceImp();
		boolean res = encounterServiceImp.deleteEncounterById(2);
		if (res != false) {
			System.out.println("Data is deleted");
		} else {
			System.out.println("Data is not found");
		}
	}
}