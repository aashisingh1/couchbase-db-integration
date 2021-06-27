package com.cb.springdata.sample.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cb.springdata.sample.entities.Person;

public interface PersonRepository extends CrudRepository<Person, String>{
	
	 List<Person> findByName(String firstName);
}
