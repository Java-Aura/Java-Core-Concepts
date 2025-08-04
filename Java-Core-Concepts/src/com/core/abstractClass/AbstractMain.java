package com.core.abstractClass;

public class AbstractMain {

	public static void main(String[] args) {
		SubClass2 obj = new SubClass2();
		obj.display("Empty String");
		obj.sum(12, 56);

	}

}


abstract class BaseClass implements I4{

	abstract public void display(String str);
	abstract public void sum(int k, int j);
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	
}


abstract class SubClass1 extends BaseClass {

	@Override
	public void display(String str) {
		System.out.println("Printing str: "+ str);
		
	}
	
}

class SubClass2 extends SubClass1 {


	@Override
	public void sum(int k, int j) {
		System.out.println("Sum of variables: "+ (k+j));
		
	}
	
	
}


interface I4{
	public void test();
}