package com.redfern.demo.service;
 import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.redfern.demo.dao.FakePersonAccessDataService;
import com.redfern.demo.model.Person;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PersonServiceTest {
	
	private static PersonService pS;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		pS = new PersonService(new FakePersonAccessDataService());
	}

	@Test
	@Order(1)
	void void_GivenPerson_ShouldInsertPerson() {
		assertTrue(pS.insertPerson(new Person("Bob")));
	}

}
