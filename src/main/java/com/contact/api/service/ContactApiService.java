package com.contact.api.service;

import com.contact.api.model.Contacts;

public interface ContactApiService {

	String createContact(Contacts contacts);

	Iterable<Contacts> getAllContacts();

	String updateContact(Long id, Contacts contact);

	Contacts getContact(Long id);

	String deleteContact(Long id);
	
}
