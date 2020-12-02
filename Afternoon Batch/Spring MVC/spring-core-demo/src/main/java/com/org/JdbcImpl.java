package com.org;

public class JdbcImpl implements EmployeeDao {

	@Override
	public void store() {
		// actual jdbc code is not written
		System.out.println("store() implementation done via jdbc");
	}

}
