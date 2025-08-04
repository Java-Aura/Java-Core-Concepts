package com.core.basics;

import java.util.Scanner;

public class ThreadTest2 {

	public static void main(String[] args) {
		
		Thread t1 = new Trans();
		Thread t2 = new Trans();
		Thread t3 = new Trans();
		t1.setName("withdraw-1");
		t2.setName("withdraw-2");
		t3.setName("withdraw-3");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
class AccountDetails{
	long balance = 2341;

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
}
class Trans extends Thread{
	Long bal = Long.valueOf(2341);
	
	private boolean withdraw = true;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to withdraw");
		int amt = sc.nextInt();
		synchronized (bal) {
			
			while (!withdraw) {
				System.out.println("Entering thread: "+Thread.currentThread().getName());
	            try { 
	            	System.out.println("Waiting thread: "+Thread.currentThread().getName());
	            	bal.wait();
	            	System.out.println(Thread.currentThread().getName() + " Notified");
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt(); 
	                System.err.println("Thread Interrupted");
	            }
			}
			
			System.out.println("Withdrawing amount!");
			bal-= amt;
			System.out.println("Withdraw complete");
			System.out.println("Available balance after withdraw: " + bal);
			bal.notifyAll();
		}
		
		
	}
	
}

