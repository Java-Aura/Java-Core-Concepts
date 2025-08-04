package com.core.inheritance;

public class MultiplInheritance {

	public static void main(String[] args) {
		Child child = new Child();
		child.display();
		System.out.println(child.k);
		/*can't access private methods*/
		//System.out.println(child.j); 
		//child.privateMethod();

	}

}

class Parent1{
	
	public void display() {
		System.out.println("From parent1");
	}
	
}

class Parent2{
	int k;
	private int j;
	
public void display() {
	System.out.println("From parent2");
	}

private void privateMethod() {
	System.out.println("From parent2");
	}
}

/*class Child extends Parent2,Parent1{ *///  compiler gives error as we can't extend more than one class at a time
class Child extends Parent2{
	
	
}

interface I1{
	
	public void display();
}

interface I2{
	public void display();
}
class Child2 implements I1,I2{

	@Override
	public void display() {
		
	}
	
}