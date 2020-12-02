package com.org;

import java.util.ArrayList;
import java.util.List;

public class TestUser {

	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		list.add(new User(555, "Alex", "alex1234"));
		list.add(new User(666, "Bravo", "bravo1234"));
		list.add(new User(777, "Charles", "charles124"));
		list.add(new User(888, "David", "david123"));
		list.add(new User(999, "Edward", "edward123"));
		
		for(User user : list) {
			if(user.getName().length() > 5) {
				System.out.println(user);
			}
		}
	}

}
