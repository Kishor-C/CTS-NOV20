package com.examples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private LocalDate dob;
	public Employee(int id, String name, double salary, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dob = dob;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static List<Employee> loadEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(55, "Edward", 35000, LocalDate.parse("2000-11-26")));
		employees.add(new Employee(45, "David", 25000, LocalDate.parse("2001-12-26")));
		employees.add(new Employee(35, "Bruce", 75000, LocalDate.parse("1998-11-21")));
		employees.add(new Employee(25, "Charles", 20000, LocalDate.parse("1999-11-23")));
		employees.add(new Employee(75, "Alex", 65000, LocalDate.parse("2003-10-16")));
		return employees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dob=" + dob + "]";
	}
	
}
