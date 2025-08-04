package com.core.MultiThreading;

import java.util.Scanner;

public class ThreadCommunication {

	public static void main(String[] args) {
		Transactions obj = new Transactions();
		Thread t1 = new Thread() {
			public void run() {
				try {
					obj.withDrawAmt();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				obj.depositAmt();
			}
		};
		
		Thread t3 = new Thread() {
			public void run() {
				try {
					obj.withDrawAmt();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		t1.start();
		t3.start();
		t2.start();
	}

}

class Transactions {
	Scanner in = new Scanner(System.in);
	long bal = 2333;
	public synchronized void withDrawAmt() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + "started");
		
		System.out.println("Enter amount to withdraw");
		int amt = in.nextInt();
		while(bal<=amt) {
			System.out.println("Waiting thread due to low balance "+ Thread.currentThread().getName());
			wait();
			System.out.println("Got notified for deposied amount "+ Thread.currentThread().getName());
		}
		bal -=amt;
		System.out.println("Withdraw completed and available balance : "+bal);

	}

	public synchronized void depositAmt() {
		System.out.println(Thread.currentThread().getName() + "started");
		System.out.println("Enter amount to deposit");
		int amt = in.nextInt();
		bal +=amt;
		System.out.println("Deposit completed and available balance : "+bal);
		notifyAll();
	}

}

class Account{
	
	long bal = 2333;
	
}
