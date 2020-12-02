package com.examples;

import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet<Account> set = new TreeSet<Account>((a1, a2) -> Integer.compare(a1.getAccountNo(), a2.getAccountNo()));
		
		for(int i = 10; i > 0; i--) {
			set.add(new Account(i, "Test "+i));
		}
		
		set.stream().forEach(account -> System.out.println(account));
		
	}
}
