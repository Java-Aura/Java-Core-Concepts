package com.core.inheritance;

public class InheritanceExample {

	public static void main(String[] args) {
	
		class2 class2 = new class2();
		class2.getBalance();
	}

}

class class1{
	
	String accNumber = "14324324455";
	public void displayAccountInfo() {
		
		System.out.println("Account holder name is java");
		
	}
	
	class1(){
		System.out.println("class1 constructor");
	}
	
}

class class2 extends class1{
	
	class2(){
		super();
	}
	
	String accNumber = "465465466";
	public void getBalance() {
		
		super.displayAccountInfo();
		System.out.println("balance of account: "+super.accNumber + " is Rs"+800);
	}
	
	public void displayAccountInfo() {

		System.out.println("Account holder name is core");

	}
	
}


