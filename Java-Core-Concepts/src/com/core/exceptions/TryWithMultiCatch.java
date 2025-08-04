package com.core.exceptions;

public class TryWithMultiCatch {
	public static void main(String[] args) {

		String str = "Test";
		
		try {
			str.toLowerCase();
			System.out.println(str);
			int k = 90;
			int h = 90;
			System.out.println(k/h);
		}
		catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		/*catch(ArithmeticException e) {
			e.printStackTrace();
		}*/
		
		/*catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}*/
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
