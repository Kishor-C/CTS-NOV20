package com.org;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public String fetchDateTimeService() {
		return dao.fetchDateTime();
	}
	
	public Employee save(Employee employee) {
		return dao.store(employee);
	}
	
	public List<Employee> getAllEmployeesNamesInReverseOrder() {
		List<Employee> list = dao.fetchAllEmployees().stream()
		.sorted((e1, e2) -> e2.getName().compareTo(e1.getName()))
		.collect(Collectors.toList());
		return list;
	}
	
	public Employee fetchEmployee(int id) {
		return dao.fetchEmployee(id);
	}
	
	public Employee login(int id, String name) {
		Employee e = dao.fetchEmployee(id);
		if(e.getName().equals(name)) {
			return e;
		} else {
			return null;
		}
	}
}
