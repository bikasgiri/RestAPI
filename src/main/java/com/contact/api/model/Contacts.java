package com.contact.api.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Contacts implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5539824904126709878L;

	@Id
	@GeneratedValue
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "name_id", referencedColumnName = "id")
	private Name name;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address address;

	@OneToMany(cascade = CascadeType.ALL,
            mappedBy = "contact")
    private Set<Phone> phone = new HashSet<>();
	
	private String email;
	
	
	public Contacts() {
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Name getName() {
		return name;
	}


	public void setName(Name name) {
		this.name = name;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public void setPhone(Set<Phone> phone) {
		this.phone = phone;
	}


	public Address getAddress() {
		return address;
	}


	public Set<Phone> getPhone() {
		return phone;
	}



	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}

