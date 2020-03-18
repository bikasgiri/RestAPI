package com.contact.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.contact.api.model.Contacts;

@Repository
public interface ContactApiRepository extends CrudRepository<Contacts, Long>{
	
}
