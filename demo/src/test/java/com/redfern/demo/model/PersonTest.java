package com.redfern.demo.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
class PersonTest {
	
	private static Person p0;
	private static UUID bobId;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		bobId = UUID.randomUUID();
		p0 = new Person(bobId, "Bob");
	}
	
	@Test
	@Order(1)
	void person_GivenTwoParameters_ShouldConstructPerson() {
		assertTrue(p0 instanceof Person);
		assertEquals(bobId, p0.getId());
		assertEquals("Bob", p0.getName());
	}
}
