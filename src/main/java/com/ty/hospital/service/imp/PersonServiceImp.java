package com.ty.hospital.service.imp;

import java.util.List;

import com.ty.hospital.dao.imp.PersonDaoImp;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Person;
import com.ty.hospital.service.PersonService;

public class PersonServiceImp implements PersonService {
	PersonDaoImp personDaoImp = new PersonDaoImp();

	public Person savePerson(Person person) {
		return personDaoImp.savePerson(person);
	}

	public Person getPersonById(int id) {
		return personDaoImp.getPersonById(id);
	}

	public List<Encounter> getPersonEncounterByPersonId(int pid) {
		return personDaoImp.getPersonEncounterByPersonId(pid);
	}

	public List<Person> getPerson() {
		return personDaoImp.getPerson();
	}

	public Person updatePerson(Person person, int id) {
		return personDaoImp.updatePerson(person, id);
	}

	public boolean deletePersonById(int id) {
		return personDaoImp.deletePersonById(id);
	}

}
