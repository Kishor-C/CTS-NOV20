package com.examples;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestFunctionalLambdaExpression {

	public static void main(String[] args) {
		List<Employee> employeesList = Employee.loadEmployees();
		// one way of sorting is through anonymous class
		Collections.sort(employeesList, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.getId() - e2.getId();
			}
		});
		employeesList.forEach(e -> System.out.println(e));
		System.out.println("------------- Sorting Names ------------");
		// another way of sorting is to use lambda expression, sorts name in ascending order
		Collections.sort(employeesList, (e1, e2) -> e1.getName().compareTo(e2.getName()));
		employeesList.forEach(e -> System.out.println(e));
		System.out.println("------------- Sorting Salary ------------------");
		Collections.sort(employeesList, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
		employeesList.forEach(e -> System.out.println(e));
	}

}
