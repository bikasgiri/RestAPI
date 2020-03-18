package com.contact.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contact.api.model.Contacts;
import com.contact.api.service.ContactApiService;

@RestController
public class ContactApiController {
	
	@Autowired
	private ContactApiService service;
	
	@GetMapping("/contacts")
	public Iterable<Contacts> getAllContacts(){
		return service.getAllContacts();
	}
	
	@PostMapping("/contacts")
	public String createContact(@RequestBody Contacts contact){
		return service.createContact(contact);
	}
	
	@PutMapping("/contacts/{id}")
	public String updateContact(@PathVariable Long id,@RequestBody Contacts contact){
		return service.updateContact(id,contact);
	}
	
	@GetMapping("/contacts/{id}")
	public Contacts getContact(@PathVariable Long id){
		return service.getContact(id);
	}
	
	@DeleteMapping("/contacts/{id}")
	public String deleteContact(@PathVariable Long id){
		return service.deleteContact(id);
	}

}
