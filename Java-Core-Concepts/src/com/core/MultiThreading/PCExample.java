package com.core.MultiThreading;

import java.util.Scanner;

public class PCExample {

	public static void main(String[] args) {
		
		AccountInfo accInfo = new AccountInfo("Sv",2314);
        Consumer consumer1 = new Consumer(accInfo);
        new Thread(consumer1,"consumer1").start();
        
        Consumer consumer2 = new Consumer(accInfo);
        new Thread(consumer2, "consumer2").start();
        
        Producer producer = new Producer(accInfo);
        new Thread(producer, "producer").start();
        System.out.println("All the threads are started");

	}

}

class AccountInfo{
	
	String accName;
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	long balance;
	public AccountInfo(String accName, long balance) {
		super();
		this.accName = accName;
		this.balance = balance;
	}
	
	
}

class Producer extends Thread {
	AccountInfo accInfo;;

public Producer(AccountInfo accInfo) {
    this.accInfo = accInfo;
}
Scanner in = new Scanner(System.in);
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started");
		try {
			Thread.sleep(1000);
			synchronized (accInfo) {
				System.out.println("Enter amount to deposit");
				int amt = in.nextInt();
				accInfo.setBalance(amt);
				System.out.println("Deposit completed and available balance : "+accInfo.getBalance());
				//accInfo.notify();
				 accInfo.notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}}

class Consumer extends Thread {
	private AccountInfo accInfo;

	public Consumer(AccountInfo accInfo) {
		this.accInfo = accInfo;
	}

	Scanner in = new Scanner(System.in);

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (accInfo) {
			try {
				System.out.println(name + " waiting to get notified for withdrawing amount:");
				accInfo.wait();
				System.out.println(name + " got notified for withdrawing amount:");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Enter amount to withdraw");
			int amt = in.nextInt();
			accInfo.setBalance(accInfo.getBalance() - amt);
			// process the message now
			System.out.println(name + " withDraw completed available balance: " + accInfo.getBalance());
		}
	}
	
}

