package com.org;

public class JpaImpl implements EmployeeDao {

	
	private DBConfig dbConfig ;
	
	
	public JpaImpl(DBConfig dbconfig) {
		this.dbConfig = dbconfig;
	}
	
	public JpaImpl() {
		
	}
	
	@Override
	public void store() {
		System.out.println("store() implementation done via JPA ");
		System.out.println("DB Config: Url = "+dbConfig.getDbUrl()+", Name = "+dbConfig.getDbname());
	}

	public void setDbConfig(DBConfig dbConfig) {
		this.dbConfig = dbConfig;
	}

}
