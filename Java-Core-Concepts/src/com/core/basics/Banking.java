package com.core.basics;


import java.util.Scanner;

abstract class Account{
	int accBal =2000;
}
class Transaction extends Account{
	
	Scanner s = new Scanner(System.in);
	
	synchronized void withDraw() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() +" Started");
		System.out.println("Enter Amount to withdraw");
		int amt = s.nextInt();
		if(amt>accBal) {
			System.out.println(Thread.currentThread().getName() +" Waiting due to less balance");
			wait();
			System.out.println(Thread.currentThread().getName() +" Notified");
			if(amt>accBal) {
				deposit();
			}
		}
		accBal = accBal - amt;
		System.out.println("withdraw completed");
		System.out.println("available balance after withdraw = "+accBal);
	}
	synchronized void deposit() {
		System.out.println(Thread.currentThread().getName() +" Started");
		System.out.println("Enter Amount to deposit");
		int amt = s.nextInt();
		accBal = accBal + amt;
		System.out.println("deposit completed");
		System.out.println("available balance after deposit = "+accBal);
		notifyAll();
	}
	
}

public class Banking {

	public static void main(String[] args) {
	
		Transaction obj = new Transaction();
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				try {
					obj.withDraw();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				try {
					obj.withDraw();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t3 = new Thread() {
			@Override
			public void run() {
				obj.deposit();
			}
		};
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		/*t1.setPriority(10);
		t2.setPriority(9);
		t3.setPriority(8);*/
		t1.start();
		t2.start();
		t3.start();

	}

}
