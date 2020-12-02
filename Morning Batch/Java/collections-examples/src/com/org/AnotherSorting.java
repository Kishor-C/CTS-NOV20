package com.org;

import java.util.Comparator;

public class AnotherSorting implements Comparator<Items> {

	@Override
	public int compare(Items o1, Items o2) {
		
		return o2.getName().compareTo(o1.getName());
	}

}
