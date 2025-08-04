package com.core.abstracttion;

import java.util.Scanner;

public class SBI implements RBI {
	
	int balance = 9000;
	
	SBI(){
		 System.out.println(RBI.policy());
		 
	}
	
	SBI(AccountInfo accInfo){
		
		   String ContinueOption = "Yes";
		do {
			System.out.println("Choose option to continue");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Account info");
			System.out.println("4.Update KYC");
			
			
				Scanner sc = new Scanner(System.in);
				int option = sc.nextInt();
				switch (option) {
				case 1: 
				{
					System.out.println("Enter amount to deposit");
					int amount = sc.nextInt();
					depositAMT(amount);
					continueOptions(sc,ContinueOption);
					break;
				}
					
				case 2:
				{
					System.out.println("Enter amount to withdraw");
					int amount = sc.nextInt();
					withdrawAMT(amount);
					continueOptions(sc,ContinueOption);
					break;
				}
				case 3:
				{
					accountInfo(accInfo);
					continueOptions(sc,ContinueOption);
					break;
				}
				case 4:
				{
					UpdateKYC(accInfo);
					continueOptions(sc,ContinueOption);
					break;
				}
				default:
					System.out.println("No Option selected");
				}
				
		}while(ContinueOption.equalsIgnoreCase("Yes"));
	
	}



	private String continueOptions(Scanner sc, String continueOption) {
		System.out.println("1.continue");
		System.out.println("2.Exit");
		int opt = sc.nextInt();
		switch (opt) {
		case 1: 
			continueOption = "Yes";
			return continueOption;
		case 2: 
			System.out.println("Exiting from options");
			System.exit(0);
				
			default: 
				System.out.println("Exiting from options");
				System.exit(0);
		
		}
		return continueOption;
	}

	

	@Override
	public void accountInfo(AccountInfo accInfo) {
		System.out.println(accInfo.toString());
	}
	@Override
	public void UpdateKYC(AccountInfo accInfo) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter phone number:");
		accInfo.setPhoneNumber(sc.nextLine());
		System.out.println("Updated account info: " +accInfo.toString());
	}



	@Override
	public void depositAMT(int amount) {
		System.out.println("Depositing amount: "+amount);
		balance = balance + amount;
		System.out.println("Avaialble balance: "+ balance);
		
	}



	@Override
	public void withdrawAMT(int amount) {
		System.out.println("withdrawing amount:"+amount);
		balance = balance - amount;
		System.out.println("Available balance is : "+ balance);
		
	}

}
