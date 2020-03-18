package com.contact.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Name implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 3180667785324570014L;
		@Id
		@GeneratedValue
		private Long id;
		private String first;
		private String middle;
		private String last;
		
		@OneToOne(mappedBy = "name")
	    private Contacts contacts;
		
		
		public Name(){
			
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getFirst() {
			return first;
		}


		public void setFirst(String first) {
			this.first = first;
		}


		public String getMiddle() {
			return middle;
		}


		public void setMiddle(String middle) {
			this.middle = middle;
		}


		public String getLast() {
			return last;
		}


		public void setLast(String last) {
			this.last = last;
		}


		public void setContacts(Contacts contacts) {
			this.contacts = contacts;
		}
		
}

