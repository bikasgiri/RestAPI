package com.contact.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Phone implements Serializable	{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7299092886813010587L;
	@Id
	@GeneratedValue
	private Long id;
	private String number;
	private String type;
	@ManyToOne
    @JoinColumn(name = "contact_id", nullable = false)
    private Contacts contact;
	
	public Phone(){
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setContact(Contacts contact) {
		this.contact = contact;
	}

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}