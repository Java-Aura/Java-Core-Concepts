package com.core.thisKeyword;

public class ThisKeywordForCurrentClassConstructor {

	public static void main(String[] args) {
		System.out.println("Execution started.!");
		
		ThisConstructor obj = new ThisConstructor();
		obj.displayInstanceVariable();
	}

}


class ThisConstructor{
	
	int k;
	int j;
	String str;
	
	/* default constructor or zero-arguments constructor*/
	ThisConstructor(){
		this(12,34);
	}
	
	
	ThisConstructor(int k, int j) {
		this(56,78,"Java");
		/*
		 * this.k = k; this.j = j;
		 */
				
	}
	
	ThisConstructor(int k, int j,String str) {

		this.k = k;
		this.j = j;
		this.str = str;

	}
	
	public void displayInstanceVariable() {
		System.out.println("Value of k : "+k);
		System.out.println("Value of j : "+j);
		System.out.println("Value of str : "+str);
	}
	
	
}