package com.demo.hotel.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {

	@Id // To specify this field as Primary key in DB
	private String firstName;
	private String lastName;
	private String subject;
	private String message;
	private String type;

	public Customer() {
	}

	public Customer(String firstName, String lastName, String subject, String message, String type) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.subject = subject;
		this.message = message;
		this.type = type;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}