package com.core.InnerClass;

public class MainClass {

	public static void main(String[] args) {
		OuterClass obj = new OuterClass();
		obj.outClassMethod();
	}
}


class OuterClass{
	
	
	public void outClassMethod() {
		
		class localInnerClass{
			
			int k = 90;
			
			public void display() {
				System.out.println("Display from local inner class method");
			}
		}
		localInnerClass obj = new localInnerClass();
		obj.display();
	}

}
