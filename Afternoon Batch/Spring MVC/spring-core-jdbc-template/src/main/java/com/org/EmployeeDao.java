package com.org;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbc;
	
	
	
	public void store(Employee emp) {
		String query = "insert into employee values(?, ?, ?)";
		jdbc.update(query, emp.getId(), emp.getName(), emp.getSalary());
	}
	
	public Employee findEmployeeById(int id) {
		Employee e = null;
		String sqlQuery = "select * from employee where id = ?";
		e = jdbc.queryForObject(sqlQuery, new Object[] {id}, new RowMapperImpl());
		return e;
	}
	public List<Employee> findEmployees() {
		List<Employee> employees = jdbc.query("select * from employee", new RowMapperImpl());
		return employees;
	}
}
