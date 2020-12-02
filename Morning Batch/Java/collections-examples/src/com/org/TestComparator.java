package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
	public static void main(String[] args) {
		List<Items> list = new ArrayList<Items>();
		list.add(new Items(200, "TV", 45000));
		list.add(new Items(100, "Mobile", 20000));
		list.add(new Items(300, "Laptop", 30000));
		for(Items item : list) System.out.println(item);
		System.out.println("---- Sorting ----");
		Collections.sort(list); // sort() method uses Comparable implementation
		for(Items item : list) System.out.println(item);
		// implementing comparator inside the method without creating a separate class of implementation
		Comparator<Items> sortById = new Comparator<Items>() {
			public int compare(Items i1, Items i2) {
				return i1.getId() - i2.getId();
			}
		};
		System.out.println("--- Sorting id by comparator in ascending order -----");
		Collections.sort(list, sortById); // sorting with Comparator
		for(Items item : list)  System.out.println(item);
		// another way of implementing is to pass the anonymous implementation in the sort method itself
		System.out.println("---- Sorting name by comparator instance passing directly to sort method ----");
		Collections.sort(list, new Comparator<Items>() { 
			public int compare(Items i1, Items i2) { 
				return i1.getName().compareTo(i2.getName());
			}
		});
		for(Items item : list)  System.out.println(item);   
	}
}
