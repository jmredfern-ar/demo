package com.redfern.demo.model;

import java.util.UUID;

public class Person {

	private final UUID id;
	private final String name;
	
	public Person(UUID id, String name) {
		this.id = id;
		this.name = name;
	}


	public Person(String name) {
		this(UUID.randomUUID(), name);
	}


	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
