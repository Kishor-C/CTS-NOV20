package com.org;

import java.util.List;
import java.util.stream.Collectors;

public class TestProductSelection {

	public static void main(String[] args) {
		// Suppose user wants only Lenova, but ratings should be in sorted order
		List<Laptop> laptops = Laptop.fetchLaptops();
		System.out.println("----- Sequential Stream -----");
		laptops.stream().filter(item -> item.getRatings() > 4.3).forEach(item -> System.out.println(item));
		System.out.println("---- Parallel Stream ----");
		laptops.parallelStream().filter(item -> item.getRatings() > 4.3)
		.collect(Collectors.toList()).stream()
		.sorted((item1, item2) -> Double.compare(item2.getRatings(), item1.getRatings()))
		.forEach(item -> System.out.println(item));
	}

}
