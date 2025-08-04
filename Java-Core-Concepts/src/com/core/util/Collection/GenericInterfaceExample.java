package com.core.util.Collection;

public class GenericInterfaceExample<T> implements GenericInterface<T>,GenericInterface1<Number> {
	public static void main(String[] args) {

		GenericInterfaceExample gi = new GenericInterfaceExample();
		gi.display(12);
		gi.display("Java");
		gi.displayI1(12);
		//gi.displayI1("sv");
	}

	@Override
	public void display(T data) {
		System.out.println(data);
		
	}

	@Override
	public void displayI1(Number data) {
		System.out.println(data);
		
	}

}

interface GenericInterface<T> {
	
	public abstract void display(T data);

}

interface GenericInterface1<T extends Number> {
	
	public abstract void displayI1(T data);

}