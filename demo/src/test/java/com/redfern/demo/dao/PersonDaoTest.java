package com.redfern.demo.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.redfern.demo.model.Person;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PersonDaoTest {
	
	private static FakePersonAccessDataService fPADS;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		fPADS = new FakePersonAccessDataService();
	}

	@Test
	@Order(1)
	void insertPerson_GivenTwoParameters_ShouldAddPersonToList() {
		UUID id = UUID.randomUUID();
		assertAll (
			() -> assertTrue(fPADS.insertPerson(id, new Person(null, "Bob"))),
			() -> assertEquals(id, fPADS.getdB().get(0).getId()),
			() -> assertEquals("Bob", fPADS.getdB().get(0).getName())
		);
	}
	
	@Test
	@Order(2)
	void insertPerson_GivenPerson_ShouldAddPersonToList() {
		Person p = new Person(null, "Alice");
		assertAll(
			() -> assertTrue(fPADS.insertPerson(p)),
			() -> assertEquals("Alice", fPADS.getdB().get(1).getName())
		);
	}
}
