package com.redfern.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.redfern.demo.dao.PersonDao;
import com.redfern.demo.model.Person;

@Service
public class PersonService {
	private final PersonDao personDao;
	
	@Autowired
	public PersonService(@Qualifier("fPADS") PersonDao personDao) {
		this.personDao = personDao;
	}
	
	public boolean insertPerson(Person person) {
		return personDao.insertPerson(person);
	}
}
