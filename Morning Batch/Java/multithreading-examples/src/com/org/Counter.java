package com.org;

public class Counter implements Runnable {

	@Override
	public synchronized void run() {
		// by default thread names start by Thread-0, Thread-1
		Thread t = Thread.currentThread();
		for(int i = 1; i <= 100; i++) {
			System.out.println("Counter: "+i+", name is: "+t.getName());
		}
	}
	
}
