package com.core.thisKeyword;

public class ThisKeywordAsMethodArgument {

	public static void main(String[] args) {
		
		Class2 class2 = new Class2();
		class2.display();
	}

}


class Class1{
	
	public void display(Class2 class2) {
		
		System.out.println("Display from class1");
	}
}

class Class2{
	
	Class1 obj = new Class1();
	
	public void display() {
		obj.display(this);
	}
	
	
}