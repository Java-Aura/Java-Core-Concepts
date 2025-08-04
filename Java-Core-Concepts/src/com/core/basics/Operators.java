package com.core.basics;


public class Operators {

	public static void main(String[] args) {
		
new Test1().dis();
		
		final int i = 20;
		int k = 45;
		
		
		/* Arithmetic */

		System.out.println("i+k = "+(i+k));
		System.out.println("i-k = "+(i-k));
		System.out.println("i*k = "+(i*k));
		System.out.println("i/k = "+(i/k));
		System.out.println("i%k = "+(i%k));
		
		// unary
		int inc = 2;
		int inc1 = 3;
		System.out.println("post incriment = "+ inc++);
		
		System.out.println("post incriment = "+ ++inc1);
		
		int dec = 2;
		int dec1 = 3;
		
		System.out.println("post decriment = "+ dec++);
		
		System.out.println("post decriment = "+ ++dec1);
		
		/* Assignment */
		
		int assign = 23;
		assign+=23; // k = k+23
		assign-= 12; // k = k-12
		assign*= 12; // k = k*12
		assign/= 12; // k = k/12
		assign%= 12; // k = k%12
		System.out.println(assign);
		
		//relational
		
		System.out.println("i>k = "+(i>k));
		System.out.println("i<k = "+(i<k));
		System.out.println("i>=k = "+(i>=k));
		System.out.println("i<=k = "+(i<=k));
		System.out.println("i==k = "+(i==k));
		
		// ternary
		
		int j = i<k ? 17: 27;  
		System.out.println(j);
		
		boolean b = true;
		System.out.println(!b);
		
		
		
		
		
		// bitwise 
		
		int l = 12;
		int h = 32;
		System.out.println(Integer.toBinaryString(l));
		System.out.println(Integer.toBinaryString(h));
		System.out.println(l&h);

	}

}

