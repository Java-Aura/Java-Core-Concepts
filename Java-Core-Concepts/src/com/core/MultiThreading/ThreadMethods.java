package com.core.MultiThreading;

public class ThreadMethods {

	public static void main(String[] args) throws InterruptedException {
		int num = 12;
		Thread t1 = new Thread() {
			@Override
			public void run() {
			for(int k =1; k<=10;k++) {
				System.out.println(num + " * "+ k+ " = "+ (num*k));
			}
			}
		};
		
		t1.setName("user-defined-Thread1");
		t1.start();
		System.out.println("is alive: "+t1.isAlive());
		t1.join();
		System.out.println("is alive: "+t1.isAlive());
		int num1 = 24;
		for (int k = 1; k <= 10; k++) {
			System.out.println(num1 + " * " + k + " = " + (num1 * k));
			Thread.yield();
		}
		System.out.println(t1.isDaemon());
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
		int num2 = 34;
		Thread t2 = new Thread() {
			@Override
			public void run() {
			for(int k =1; k<=10;k++) {
				System.out.println(num2 + " * "+ k+ " = "+ (num2*k));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			}
		};
		t2.start();
		t2.interrupt();
		System.out.println("Interruped: "+t1.isInterrupted());
		System.out.println("is alive: "+t1.isAlive());

	}

}

