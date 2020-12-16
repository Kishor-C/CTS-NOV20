package com.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "*")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

	// api/1000/Alex (or) api/2000/Bruce (or) api/3000/Charles
	@RequestMapping(value = "/{id}/{name}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee authenticate(@PathVariable("id") int empId, @PathVariable("name") String empName) {
		Employee employee = employeeService.login(empId, empName);
		return employee;
	}
	
	@RequestMapping(value = "/save", 
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee save(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> fetchAllEmployees() {
		return employeeService.getAllEmployeesNamesInReverseOrder();
	}
}
