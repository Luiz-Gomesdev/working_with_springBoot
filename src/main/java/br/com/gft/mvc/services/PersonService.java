package br.com.gft.mvc.services;

import br.com.gft.mvc.entities.Person;

//@Service
public class PersonService {
	
	public Person createPerson() {
		
		Person person = new Person();
		
		person.setName("David");
		person.setAge(30);
		person.setStatus(Boolean.TRUE);
		
		
		return person;
		
	}
	
	
	

}
