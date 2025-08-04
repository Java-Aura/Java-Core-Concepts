package com.core.basics;

import java.util.Scanner;

public class TestThread {
public static void main(String[] args) throws InterruptedException {
	Transacations obj = new Transacations();
	Thread t1 = new Thread() {
		@Override
		public void run() {
			try {
				obj.withDraw();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};

	Thread t3 = new Thread() {
		@Override
		public void run() {
			try {
				obj.deposit();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	t1.setName("withdraw-1");
	t3.setName("Deposit");
	t1.start();
	t3.start();
	
	
	
	
}
}


class Transacations{
	
	
	long bal = 1234;
	private boolean transfer = false;
	private boolean withdraw = true;
	
	synchronized public void withDraw() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to withdraw");
		int amt = sc.nextInt();
		if(bal<= amt ) {
			withdraw = false;
		}
		while (!withdraw) {
			System.out.println("Entering thread: "+Thread.currentThread().getName());
            try { 
            	System.out.println("Waiting current thread and notifying deposit thread due to low balnce");
            	transfer = true;
            	notify();
            	wait();
            	System.out.println(Thread.currentThread().getName() + " Notified");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
                System.err.println("Thread Interrupted");
            }
		}
		
		System.out.println("Withdrawing amount!");
		bal -= amt;
		System.out.println("Withdraw complete");
		System.out.println("Available balance after withdraw: " + bal);
		
		withdraw = true;
		transfer = false;
		
	}
	synchronized public void deposit() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " started");
		 Scanner sc = new Scanner(System.in);
		while (!transfer) {
            try { 
            	System.out.println("Waiting deposit thread untill got notified");
                wait();
                System.out.println("deposit thread got notified");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
                System.err.println("Thread Interrupted");
            }
        }
		
		System.out.println("Enter amount to deposit");
		int amt = sc.nextInt();
		System.out.println("Depositing amount");
		bal +=amt;
		System.out.println("Available balance after deposit: "+ bal);
		transfer  = false;
		withdraw = true;
		notify();
		
	}
	
	
}