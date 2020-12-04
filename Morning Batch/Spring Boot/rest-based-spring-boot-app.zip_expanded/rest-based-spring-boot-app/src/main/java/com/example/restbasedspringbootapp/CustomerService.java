package com.example.restbasedspringbootapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	// acts like a temporary database
	private static List<Customer> customerDatabase = new ArrayList<Customer>();

	public Customer addCustomer(Customer customer) {
		customer.setCustomerId(new Double(Math.random() * 10000).intValue());
		customerDatabase.add(customer);
		return customer;
	}
	public List<Customer> fetchCustomers( ){
		return customerDatabase;
	}
	public Customer fetchCustomer(int id) {
		return customerDatabase.stream()
				.filter(customer -> customer.getCustomerId() == id)
				.findAny().get();
	}
}
