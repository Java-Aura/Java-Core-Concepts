package com.core.exceptions;

public class HandleExceptionsByJVM {

	public static void main(String[] args) {
		new DefaultExceptionHandle().display();
		
	}

}


class DefaultExceptionHandle{
	public void display() {
		String str = null;
		System.out.println(str.toLowerCase());
		System.out.println("End of the method");

	}
}