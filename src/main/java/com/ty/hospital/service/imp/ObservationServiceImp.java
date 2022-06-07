package com.ty.hospital.service.imp;

import java.util.List;

import com.ty.hospital.dao.imp.ObservationDaoImp;
import com.ty.hospital.dto.Observation;
import com.ty.hospital.service.ObservationService;

public class ObservationServiceImp implements ObservationService {
	ObservationDaoImp observationDaoImp = new ObservationDaoImp();

	public Observation createObservation(Observation observation, int eid) {
		return observationDaoImp.createObservation(observation, eid);
	}

	public Observation getObservationById(int id) {
		return observationDaoImp.getObservationById(id);
	}

	public List<Observation> getAllObservationByEncounterId(int eid) {
		return observationDaoImp.getAllObservationByEncounterId(eid);
	}

	public Observation updateObservation(Observation observation, int id) {
		return observationDaoImp.updateObservation(observation, id);
	}

	public boolean deleteObservation(int id) {
		return observationDaoImp.deleteObservation(id);
	}

}
