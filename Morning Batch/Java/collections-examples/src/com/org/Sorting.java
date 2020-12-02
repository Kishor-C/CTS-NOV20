package com.org;

import java.util.Comparator;

public class Sorting implements Comparator<Items>{

	@Override
	public int compare(Items o1, Items o2) {
		
		return o1.getId() - o2.getId();
	}
	

}
