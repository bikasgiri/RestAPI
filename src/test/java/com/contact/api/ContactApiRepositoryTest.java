package com.contact.api;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.contact.api.ContactApiApplication;
import com.contact.api.model.Address;
import com.contact.api.model.Contacts;
import com.contact.api.model.Name;
import com.contact.api.repository.ContactApiRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ContactApiApplication.class)
public class ContactApiRepositoryTest {

	@Autowired
	private ContactApiRepository repository;
	
	@Test
	public void checkCURDOperations(){
		Contacts c = new Contacts();
		Name n = new Name();
		n.setFirst("a");
		n.setMiddle("b");
		n.setLast("c");
		
		c.setName(n);
		
		Address a = new Address();
		a.setState("x");
		a.setStreet("y");
		a.setCity("z");
		c.setAddress(a);
		
		c.setEmail("email");
		
		repository.save(c);
		List<Contacts> all= (List<Contacts>) repository.findAll();
		assertTrue(all.size()>0);
	}
}
