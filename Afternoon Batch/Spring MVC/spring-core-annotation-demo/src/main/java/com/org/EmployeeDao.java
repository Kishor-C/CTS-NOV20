package com.org;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	public void store() {
		System.out.println("store() method in DAO layer");
	}
}
