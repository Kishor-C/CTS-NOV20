package com.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;

	public void storeEmployee(Employee emp) {
		dao.store(emp);
	}
	
	public Employee fetchEmployeeById(int id) {
		return dao.findEmployeeById(id);
	}
	
	public List<Employee> fetchAllEmployees() {
		return dao.findEmployees();
	}

}
