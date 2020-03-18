package com.contact.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.api.model.Contacts;
import com.contact.api.model.Phone;
import com.contact.api.repository.ContactApiRepository;
import com.contact.api.service.ContactApiService;

@Service 
public class ContactApiServiceImpl implements ContactApiService {
	@Autowired
	private ContactApiRepository repository;

	@Override
	public String createContact(Contacts contacts) {
		repository.save(map(contacts));
		return "Contact is created";
	}

	private Contacts map(Contacts contacts) {
		for(Phone p : contacts.getPhone()){
			p.setContact(contacts);
			contacts.getPhone().add(p);
		}
		return contacts;
	}

	@Override
	public Iterable<Contacts> getAllContacts() {
		return repository.findAll();
	}

	@Override
	public String updateContact(Long id,Contacts contact) {
		Optional<Contacts> f =  repository.findById(id);
		Contacts c = f.get();
		c.setEmail(contact.getEmail());
		repository.save(contact);
		return "Contact is updated";
	}

	@Override
	public Contacts getContact(Long id) {
		Optional<Contacts> contact =  repository.findById(id);
		return contact.isPresent() ? contact.get() : new Contacts();
	}

	@Override
	public String deleteContact(Long id) {
		repository.deleteById(id);
		return "Contact is deleted";
	}

}
