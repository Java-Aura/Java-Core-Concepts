package com.core.MultiThreading;

import java.util.Scanner;

public class ProducerConsumerExample {

	public static void main(String[] args) {
		AccountDeatails accDetails = new AccountDeatails("SV",2000);
		Consumer1 consumer1 = new Consumer1(accDetails);
		Producer1 producer1= new Producer1(accDetails);
		new Thread(consumer1,"consumer1").start();
		new Thread(consumer1,"consumer2").start();
		new Thread(producer1,"Producer1").start();;

	}

}

class AccountDeatails{
	String accName;
	long balance;
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
	public AccountDeatails(String accName, long balance) {
		super();
		this.accName = accName;
		this.balance = balance;
	}
	
}

class Producer1 extends Thread{
	AccountDeatails accountDeatails;
	Producer1(AccountDeatails accountDeatails){
		this.accountDeatails = accountDeatails;
	}
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			String name = Thread.currentThread().getName();
			System.out.println(name + " Started ");
			synchronized (accountDeatails) {
				System.out.println("Enter amount to deposit");
				long amt = accountDeatails.getBalance();
				long requestedAmt =  sc.nextLong();
				accountDeatails.setBalance(amt+requestedAmt);
				System.out.println("Depost completed");
				accountDeatails.notifyAll();
			}
			
		} catch (InterruptedException e) {
			
		}
	}
	
}

class Consumer1 extends Thread{
	AccountDeatails accountDeatails;
	Consumer1(AccountDeatails accountDeatails){
		this.accountDeatails = accountDeatails;
	}
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " Started");
		synchronized (accountDeatails) {
			try {
				System.out.println(name +" Waiting");
				accountDeatails.wait();
				System.out.println(name +" Got notified");
			} catch (Exception e) {
			}
			System.out.println("Enter amount to withdraw");
			long amt = accountDeatails.getBalance();
			long requestedAmt =  sc.nextLong();
			accountDeatails.setBalance(amt+requestedAmt);
			System.out.println("Withdraw completed");
		}
	}
}