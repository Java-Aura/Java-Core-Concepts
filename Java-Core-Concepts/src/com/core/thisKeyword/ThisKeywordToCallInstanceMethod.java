package com.core.thisKeyword;

public class ThisKeywordToCallInstanceMethod {

	public static void main(String[] args) {
		
		CallIntsanceMethod obj = new CallIntsanceMethod();
		obj.callInstanceMethod();

	}

}

class Test{
	
public void instanceMethod() {
		
System.out.println("From Test class");
}

}

class CallIntsanceMethod extends Test{
	
	
	public void callInstanceMethod() {
		
		this.instanceMethod();
		super.instanceMethod();
	}
	
	public void instanceMethod() {
		System.out.println("From CallIntsanceMethod class");
	}
	
}
