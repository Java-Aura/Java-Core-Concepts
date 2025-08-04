package com.core.variables;

public class TypesOfVariables {

	public static void main(String[] args) {
		

		Types types = new Types();
		//System.out.println(Types.nonStaticVariable);//gives error we can't access non-static members directly using class name
		System.out.println(Types.staticVariable);// getting from class name directly
		System.out.println(Types.staticVariable);
		System.out.println(Types.staticTest);
		System.out.println(types.nonStaticVariable);
		System.out.println(types.localVariable());
		// local variables can't used outside the method System.out.println(types.localVariable().k);
		
	}

}

class Types{
	
	static String staticTest;
	static String staticVariable = "I'm static Variable"; // static
	String nonStaticVariable = "I'm Non-Static Variable"; // non-static/ instance
	String NonStaticVariable = "I'm Non-Static Variable"; // non-static/ instance
	
	public String localVariable() {
		int k = 23; // local variables can't used outside the method
		String localVariable = "I'm Local Variable"; // local 
		return localVariable;
	}
	
}
