package com.topgear.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer 
{
	@Autowired
	private Person person;
	
	public Customer(){
	}
	
	/*public Customer(Person person) {
		this.person = person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	*/
}