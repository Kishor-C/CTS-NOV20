package com.example.restbasedspringbootapp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository dao;

	public Customer addCustomer(Customer customer) {
		Customer createdCustomer = dao.save(customer);
		return createdCustomer;
	}
	public List<Customer> fetchCustomers(){
		return dao.findAll();
	}
	public Customer fetchCustomer(int id) throws CustomerNotFoundException {
		Optional<Customer> option = dao.findById(id);
		if(option.isPresent()) 
			return option.get();
		else 
			throw new CustomerNotFoundException("Sorry customer with an id "+id+" not found");
	}
	public Customer updateCustomer(int id, LocalDate dob) throws CustomerNotFoundException {
		Customer customer = fetchCustomer(id);
		customer.setDob(dob);
		customer = dao.save(customer); 
		return customer;
	}
}
