package com.ty.hospital.controller.Person;

import java.util.List;

import com.ty.hospital.dao.imp.PersonDaoImp;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Person;

public class TestGetPersonEncounterByPersonId {
	public static void main(String[] args) {
		PersonDaoImp personServiceIcmp = new PersonDaoImp();
		List<Encounter> list = personServiceIcmp.getPersonEncounterByPersonId(1);
		if (list.size() > 0) {
			for (Encounter encounter : list) {
				Person person= encounter.getPerson();
				System.out.println("Person    Id        :"+person.getId());
				System.out.println("Person    Name      :"+person.getName());
				System.out.println("Encounter Id        :" + encounter.getId());
				System.out.println("Encounter Reason    :" + encounter.getReason());
				System.out.println("Encounter status    :" + encounter.getStatus());
				System.out.println("Encounter admit_date:" + encounter.getAdmit_date_time());
				System.out.println("Encounter discharge_date:" + encounter.getDischarge_date_time());
				System.out.println("---------------------------------------------------------------");
			}
		} else {
			System.out.println("No data is found");
		}
	}
}
