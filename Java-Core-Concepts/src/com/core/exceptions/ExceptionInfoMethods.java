package com.core.exceptions;

public class ExceptionInfoMethods {

	public static void main(String[] args) {
		new InfoMethods().display(); // object created without reference
	/*	new InfoMethods().display();
		new InfoMethods().display();
		new InfoMethods().display();*/
		
	}

}


class InfoMethods{
	
	String str = "TEST";
	
	public void display() {
		
		System.out.println("From display method");
		try {
		System.out.println(str.toLowerCase());
		int j =9;
		int k =0;
		System.out.println(j/k);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());// description of the exception
			System.out.println(e.toString()); // name and description of the exception
			e.printStackTrace(); // name, description and location of the exception 
		}
		finally {

		}
	}
}