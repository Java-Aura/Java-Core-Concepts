package com.core.basics;

public class TypeOfVariables {

	public static void main(String[] args) {
		
		VariableTypes obj = new VariableTypes();
		obj.nonStaticVariable = "nonStaticVariable value changed for obj";
		System.out.println(obj.nonStaticVariable); 
		
		VariableTypes obj1 = new VariableTypes();
		System.out.println(obj1.nonStaticVariable);
		
		System.out.println(obj.staticVaraible); // accessed with class name
		System.out.println(VariableTypes.staticVaraible);
		//System.out.println(VariableTypes.nonStaticVariable); // we can't access by class name as it is a instance variable
		//System.out.println(obj.methodName().localVariable); // local variables are not available outside of method.
		obj.nonStaticMethod();
		obj.staticMethod(); // gives warning
		VariableTypes.staticMethod();
		System.out.println(obj.nonStaticInitialization);
		System.out.println(obj.nonStaticInitializationFromConstructor);
		System.out.println(VariableTypes.staticInitialization);
		
		
		
	}

}
class VariableTypes{
	
	static String staticVaraible = "staticVaraible"; // static variable
	String nonStaticVariable = "nonStaticVariable";
	
	String nonStaticInitialization;
	String nonStaticInitializationFromConstructor;
	static String staticInitialization;
	
	{
		nonStaticInitialization = "nonStaticInitialization from not-static block";
	}
	static {
		staticInitialization = "staticInitialization from static block";
	}
	
	/* constructor*/
	public VariableTypes() {
		nonStaticInitializationFromConstructor = "nonStaticInitialization from constructor";
	}
	
	/*non-static method */
	public void nonStaticMethod() {
		System.out.println("Non-Static method execution");
		//static String localStatic = "test";local static can't be possible
		String localVariable = "localVariable";
		
	}
	/*static method */
	public static void staticMethod() {
		//static String localStatic = "test"; local static can't be possible
		System.out.println("Static method execution");
	}
	
	
	
}
