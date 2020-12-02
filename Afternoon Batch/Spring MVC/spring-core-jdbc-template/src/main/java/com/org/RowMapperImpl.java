package com.org;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee emp = new Employee(); // select * from employee where id = ?
		emp.setId(rs.getInt("id")); // fetches the id column value and initializes employee id
		emp.setName(rs.getString("name")); // feches the name column value & initializes employee name
		emp.setSalary(rs.getDouble("salary"));
		return emp;
	}

}
