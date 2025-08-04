package com.core.InnerClass;

public class AnonymousMethod {

	public static void main(String[] args) {
		
		I3 i3 = (int k, int h)->{
			System.out.println("Sum of variables : "+ (k+h));
		};
		i3.sum(56, 67);
	}

}

@FunctionalInterface
interface I3{
	public void sum(int k, int g);
}

interface I4{
	
	public void sum(int k, int j);
	public void display(String str);
}
