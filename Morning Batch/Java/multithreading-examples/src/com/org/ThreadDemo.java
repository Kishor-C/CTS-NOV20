package com.org;

public class ThreadDemo {

	public static void main(String[] args) {
		Counter counter = new Counter(); // this is the runnable object
		Thread t1 = new Thread(counter, "A");
		Thread t2 = new Thread(counter, "B");
		t1.start(); // now thread is eligible to get the CPU time
		t2.start(); // now thread is eligible to get the CPU time
		System.out.println("--- End of program -----");
	}

}
