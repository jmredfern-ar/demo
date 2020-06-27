package com.redfern.demo.dao;

import java.util.List;
import java.util.UUID;
import com.redfern.demo.model.Person;

public interface PersonDao {
	
	List<Person> dB = null;

	boolean insertPerson(UUID id, Person person);
	List<Person> selectAllPeople();
	
	// insertPerson() now  boolean, not int
	default boolean insertPerson(Person person) {
		UUID id = UUID.randomUUID();
		return insertPerson(id, person);
	}
}
