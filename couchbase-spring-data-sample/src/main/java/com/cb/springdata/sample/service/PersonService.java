package com.cb.springdata.sample.service;

import java.util.List;

import com.cb.springdata.sample.entities.Person;

public interface PersonService {

	List<Person> findByName(String name);
}
