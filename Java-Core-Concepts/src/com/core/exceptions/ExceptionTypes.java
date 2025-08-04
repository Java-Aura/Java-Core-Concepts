package com.core.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ExceptionTypes {

	public static void main(String[] args) {
		
		new ExceptionType().printTable(12);
	}

}


class ExceptionType{
	
	
	
	
	public void printTable(int num) {
		
		
		List li = new ArrayList();
		li.add(12);
		li.add("java");
		li.add(true);
		
		for(Object val :  li) {
			System.out.println((int)val); // ClassCastException
		}
		
		
		int j = 8;
		int h = 0;
		
		int arr[] = {12,23,45};
		System.out.println(arr[6]); // ArrayIndexOutOfBoundException
		System.out.println(j/h); // ArithmeticException
		
		for(int k =1; k<=10;k++) {
			
			//FileOutputStream op = new FileOutputStream("");
			
			System.out.println(num + "*" + k + " = "+ (num*k));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("CompileTime Exception");
			}
		}
		
	}
	
	
	
	
}