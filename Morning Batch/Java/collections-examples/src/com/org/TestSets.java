package com.org;

import java.util.HashSet;
import java.util.Set;

public class TestSets {

	public static void main(String[] args) {
		Set<User> set = new HashSet<User>();
		set.add(new User(100, "Alex", "alex123"));
		set.add(new User(103, "Alex", "alex123"));
		set.add(new User(100, "Alex", "alex123"));
		set.add(new User(100, "Alex", "alex123"));
		
		System.out.println("Size: "+set.size());
	}

}
