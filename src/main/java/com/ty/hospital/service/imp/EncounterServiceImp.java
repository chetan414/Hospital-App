package com.ty.hospital.service.imp;

import java.util.List;

import com.ty.hospital.dao.imp.EncounterDaoImp;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.service.EncounterService;

public class EncounterServiceImp implements EncounterService {
	EncounterDaoImp encounterDaoImp = new EncounterDaoImp();

	public Encounter cretaeEncounter(int bid, int pid, Encounter encounter) {
		return encounterDaoImp.cretaeEncounter(bid, pid, encounter);
	}

	public Encounter getEncounterById(int id) {
		return encounterDaoImp.getEncounterById(id);
	}

	public List<Encounter> getEncounterByBranchesId(int bid) {
		return encounterDaoImp.getEncounterByBranchesId(bid);
	}

	public List<Encounter> getEncounterByPersonId(int pid) {
		return encounterDaoImp.getEncounterByPersonId(pid);
	}

	public Encounter updateEncounter(Encounter encounter, int id) {
		return encounterDaoImp.updateEncounter(encounter, id);
	}

	public boolean deleteEncounterById(int id) {
		return encounterDaoImp.deleteEncounterById(id);
	}

}
