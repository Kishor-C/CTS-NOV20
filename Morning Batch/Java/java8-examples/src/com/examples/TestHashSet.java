package com.examples;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<Account> set = new HashSet<Account>();
		LocalTime before = LocalTime.now();
		for(int i = 1; i <= 25000; i++) {
			Account account = new Account(i, "Test "+i);
			set.add(account);
			System.out.println("item adding to the set: "+i);
		}
		LocalTime after = LocalTime.now();
		System.out.println("Time taken: "+Duration.between(before, after).toMillis());
		
	}

}
