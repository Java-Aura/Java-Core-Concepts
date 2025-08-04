package com.core.operators;

public class Operators {

	public static void main(String[] args) {
		
		int i = 30;
		int k = 34;	
		
		// unary : ++,--,! ==> can be used to perform increment/decrement operations
		System.out.println(++i); // pre-increment = 31
		System.out.println(i++); // post-increment.. == 32 after display the value will be incremented by one
		System.out.println(i); // 32
		
		/*
		 * Decrement: can be used to decrease the value by one.
		 */
		
		System.out.println(--k);  // 33 pre-decrement: first decrement the value by one and then display it.
		System.out.println(k--);  // 33 post-decrement: first display the value and decrement the value
		System.out.println(k); // 32
		
		
		// assignment : =, +=,-=,/=,%=,*=  ==> can be used to assign values to variables.
		
		int j = 10; 
		j += 12; // same as j = j+12 which is 22
		j -= 10; // same as j = j-10 which 12
		System.out.println(j);
		
		//relational: <,> <=,>=, == returns true/false ==> can be used to copare the values(find the equality/ greater than/less than etc).
		
		int h = 12;
		int t = 23;
		System.out.println(h>t); // false
		System.out.println(t>h); // true
		int g = 12;
		int d = 12;
		int n = 9;
		System.out.println(g==d); // true
		System.out.println(g>h); // false
		System.out.println(g>=h); // true
		System.out.println(n<=g); // true
		
		int ternaryExample =  (g>h) ? 56 : 45; // 45
		System.out.println(ternaryExample); // 45
		ternaryExample = (g>=h) ? 56 : 45; // 56
		System.out.println(ternaryExample); // 56
		
		//bitwise : &, |,^, ~ ==> can be used to perform bitwise comparison between operands.
		
		int bit1 = 10;
		int bit2= 12;
		int a =5;
		
		System.out.println(Integer.toBinaryString(bit1));
		System.out.println(Integer.toBinaryString(bit2));
		System.out.println(Integer.toBinaryString(-6));
		System.out.println("(bit1 & bit2) parseInt = "+Integer.parseInt("1000", 2)); //bit1 & bit2
		System.out.println("(bit1 | bit2) parseInt = "+Integer.parseInt("1110", 2)); // (bit1 | bit2
		System.out.println("bitwise not = " + Integer.parseInt("11111010",2));
		
		System.out.println("(bit1 & bit2) = " + (bit1 & bit2));
		System.out.println("(bit1 | bit2) = " + (bit1 | bit2));
		System.out.println(~a);
	}

}
