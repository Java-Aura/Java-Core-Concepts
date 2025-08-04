package com.core.finalKeyword;

public class FinalVariableInitialization {

	final String str;
	final static String str1;
	final int k;

	{
		final int j;
		j = 34;
		//j = 34;
		str = "Java";
		// str1 = "initialzie from instance block";
	}

	static {
		// str = "static initialize";// instance variables can't be accessed in static
		// area
		final int j;
		j = 34;
		str1 = "initialzie from instance block";
	}

	FinalVariableInitialization() {
		final int j;
		j = 34;
		this.k = 89;
	}
	
	FinalVariableInitialization(int val){
		this.k = val;
	}
	
	FinalVariableInitialization(String val){
		this.k = 67;
	}

	public static void main(String[] args) {
		final int j;
		j = 34;
		
		FinalVariableInitialization obj = new FinalVariableInitialization();
		FinalVariableInitialization obj1 = new FinalVariableInitialization(12);
		System.out.println("Value of str : "+obj.str);
		System.out.println("Value of str1 : "+str1);
		System.out.println("Value of K : "+obj.k);
		System.out.println("Value of K from another constructor: "+obj1.k);
	}

}
