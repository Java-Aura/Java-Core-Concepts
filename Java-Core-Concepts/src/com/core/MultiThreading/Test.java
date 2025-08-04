package com.core.MultiThreading;

class ThreadYield extends Thread {
	public void run() {

		System.out.println(Thread.currentThread().getName() + " started");
		// for (int i = 1; i < 10; i++) {

		System.out.println(Thread.currentThread().getName() + " yielding");
		Thread.yield();// It Causes the currently executing thread to temporarily pause and allow other
						// threads to execute.

// }
		System.out.println(Thread.currentThread().getName() + "--> Finsihed execution");

	}
}

public class Test {
	public static void main(String args[]) {
		ThreadYield t1 = new ThreadYield();
		t1.setName("Thread1");
		ThreadYield t2 = new ThreadYield();
		t2.setName("Thread2");

		ThreadYield t3 = new ThreadYield();
		t3.setName("Thread3");

		t1.start();
		t2.start();
		t3.start();
	}
}