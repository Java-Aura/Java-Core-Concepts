package com.core.thisKeyword;

public class ThisKeywordExample {

	public static void main(String[] args) {
	System.out.println("Execution started.!");
	This obj = new This();// zero-argument constructor
	This obj1 = new This(12,34);
	obj.displayInstanceVariable();
	obj1.displayInstanceVariable();

	}

}


class This{
	
	int k;
	int j;
	This(){
		
	}
	This(int k , int j){
		this.k = k;
		this.j = j;
	}
	
	
	
	public void displayInstanceVariable() {
		System.out.println("Value of k : "+k);
		System.out.println("Value of j : "+j);
	}
}