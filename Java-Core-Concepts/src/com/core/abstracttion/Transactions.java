package com.core.abstracttion;

import java.util.Scanner;

public class Transactions {

	public static void main(String[] args) {
		AccountInfo acc = new AccountInfo();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter bank name ");
		String bankName = input.nextLine();
		switch (bankName.toUpperCase()) {
		case "SBI": 
			System.out.println("Enter acount holder name");
			acc.setName(input.nextLine());
			System.out.println("Enter address");
			acc.setAddress(input.nextLine());
			System.out.println("Enter account number");
			acc.setAccNumber(input.nextLine());
			new SBI();
			new SBI(acc);
		default:
			
		}

	}

}
