package com.org;


import java.util.List;


public class TestIntermediateAndTerminalOperations {

	public static void main(String[] args) {
		// suppose you want to only add names of the laptops in a separate list
		List<Laptop> list = Laptop.fetchLaptops();
		// map allows you to give a data and get a different data
		// you give complex type and get somer other type, like pass laptop and get names
		list.stream().map(item -> item.getBrandName()).distinct().forEach(item -> System.out.println(item));
		// counting the number of items
		long count = list.stream().filter(item -> item.getBrandName().equals("Acer")).count();
		System.out.println("Count: "+count);
	}

}
