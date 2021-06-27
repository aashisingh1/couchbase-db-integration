package com.cb.springdata.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.cb.springdata.sample.entities.Person;
import com.cb.springdata.sample.service.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	PersonService personService; 
	
	
	@GetMapping("/get")
	public void getNameBasisInfo() {
		List<Person> listPer = personService.findByName("Emma");
		listPer.stream().forEach(e -> System.out.println(e));
		
	}
}
