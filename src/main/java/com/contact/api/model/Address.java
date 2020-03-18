package com.contact.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -507989352124889587L;
	@Id
	@GeneratedValue
	private Long id;
	private String street;
	private String city;
	private String state;
	private String zip;
	@OneToOne(mappedBy = "address")
    private Contacts contacts;
	
	public Address(){
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

	public void setContacts(Contacts contacts) {
		this.contacts = contacts;
	}
	
}
