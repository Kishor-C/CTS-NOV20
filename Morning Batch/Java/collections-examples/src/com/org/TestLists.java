package com.org;

import java.util.ArrayList;
import java.util.List;

public class TestLists {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(25);
		list.add(35);
		list.add(20);
		list.add(30);
		list.add(45);
		
		for(int i : list) {
			System.out.println("item: "+i);
		}
		System.out.println("---- filtering only even items ----");
		for(int i : list) {
			if(i %2 == 0) {
				System.out.println("item: "+i);
			}
		}
	}

}
