package com.examples;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestLocalDateTime {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println("Time: "+time);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println("TIme: "+time.format(formatter));
		// date & time
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("DateTime: "+datetime);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy 'Time' hh:mm");
		System.out.println("Date & Time: "+datetime.format(formatter2));
	}

}
