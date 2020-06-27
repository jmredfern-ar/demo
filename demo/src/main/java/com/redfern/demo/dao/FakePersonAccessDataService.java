package com.redfern.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.redfern.demo.model.Person;
/*
 * CHANGES from video:
 * List<Person> not static
 * insertPerson() returns boolean, not int
 */
@Repository("fPADS")
public class FakePersonAccessDataService implements PersonDao{
	
	private List<Person> dB = new ArrayList<Person>();

	public List<Person> getdB() {
		return this.dB;
	}

	@Override
	public boolean insertPerson(UUID id, Person person) {
		return this.dB.add(new Person(id, person.getName()));
	}

	@Override
	public List<Person> selectAllPeople() {
		return this.dB;
	}

}
