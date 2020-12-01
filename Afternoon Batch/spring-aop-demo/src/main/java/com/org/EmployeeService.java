package com.org;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public void store() {
		System.out.println("**** store() inside EmployeeService ****");
	}
	
	public void delete() {
		System.out.println("*** delete() inside EmployeeService ****");
	}
}
