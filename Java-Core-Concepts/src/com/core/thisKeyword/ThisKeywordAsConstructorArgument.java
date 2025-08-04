package com.core.thisKeyword;

public class ThisKeywordAsConstructorArgument {

	public static void main(String[] args) {
		
		TestClass1 testClass1 = new TestClass1();
	}

}


class TestClass1{
	
	TestClass1(){
		
		TestClass2 testClass2 = new TestClass2(this);
	}
	
	public void display() {
		
		System.out.println("Executed from TestClass1");
	}
}


class TestClass2{
	
	TestClass1 testClass1;
	
	TestClass2(){
		
	}
	
	TestClass2(TestClass1 testClass1){
		this.testClass1 = testClass1;
		testClass1.display();
	}
	
}
