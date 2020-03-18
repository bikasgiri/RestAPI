package com.contact.api;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.contact.api.ContactApiApplication;
import com.contact.api.model.Address;
import com.contact.api.model.Contacts;
import com.contact.api.model.Name;
import com.contact.api.service.ContactApiService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ContactApiApplication.class)
public class ContactApiServiceImplTest {

	@Autowired
	private ContactApiService service;
	
	@Before
	public void before(){
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
		
		service.createContact(c);
	}
	@Test
	public void getAllContacts(){
		List<Contacts> all= (List<Contacts>) service.getAllContacts();
		assertTrue(all.size()>0);
	}
	
	@Test
	public void getContactBasedOnId(){
		Contacts c= service.getContact(1l);
		assertTrue(c.getId()!=null);
	}
}
