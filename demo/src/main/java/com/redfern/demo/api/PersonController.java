package com.redfern.demo.api;

import org.springframework.beans.factory.annotation.Autowired;

import com.redfern.demo.model.Person;
import com.redfern.demo.service.PersonService;

public class PersonController {
	
	private final PersonService personService;

	@Autowired
	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}
	
	public void addPerson(Person person) {
		this.personService.insertPerson(person);
	}

}
