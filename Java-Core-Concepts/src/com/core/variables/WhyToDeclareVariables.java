package com.core.variables;

public class WhyToDeclareVariables {

	String accNumber = "Acc14324";
	String message = "hello gd morning, how r u";
	public static void main(String[] args) {
		
		WhyToDeclareVariables obj = new WhyToDeclareVariables();
		obj.printAccountNumber();
		obj.printAccountBalance();

	}
	
	public void printAccountNumber() {
		System.out.println(accNumber);
		
	}
	
	public void printAccountBalance() {
		
		System.out.println("Balance for the account number: "+accNumber+" is "+ 3000 );
		
	}

}
