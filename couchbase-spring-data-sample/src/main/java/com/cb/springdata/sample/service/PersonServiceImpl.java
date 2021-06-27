package com.cb.springdata.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cb.springdata.sample.entities.Person;
import com.cb.springdata.sample.repositories.PersonRepository;

public class PersonServiceImpl implements PersonService {
	
	
	@Autowired
	PersonRepository personRepo;
	
	@Override
	public List<Person> findByName(String name) {
		return personRepo.findByName(name);
	}

}
