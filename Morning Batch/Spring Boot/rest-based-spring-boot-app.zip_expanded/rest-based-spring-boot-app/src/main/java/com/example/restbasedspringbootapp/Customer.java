package com.example.restbasedspringbootapp;

import java.time.LocalDate;

public class Customer {
	private int customerId;
	private String name;
	private LocalDate dob;
	
	public Customer() {
		super();
	}
	public Customer(int customerId, String name, LocalDate dob) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.dob = dob;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
}
