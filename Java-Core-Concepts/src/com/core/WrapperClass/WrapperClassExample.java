package com.core.WrapperClass;

public class WrapperClassExample {

	public static void main(String[] args) {
		
		char c= 'k';
		Character ch = c;// auto boxing
		Character ch1 = new Character(c); // using constructor.
		Character ch2 =  Character.valueOf(c); // using valueOf() static method
		
		char c1 = ch; //auto unboxing;
		char c2 = ch.charValue(); // 
		char c3 = Character.valueOf(ch2);
		System.out.println(c);
		System.out.println(ch);
		System.out.println(c1);
		
		
		int i = 23;
		Integer i1 = i;
		Integer i2 = new Integer(i);
		Integer i3 = Integer.valueOf(i);
		
		int k = i1;
		int k1= i1.intValue();
		int k2 = Integer.parseInt("12");
		int k3 = Integer.valueOf(k);
		
		float f = 23;
		Float f1 = f;
		Float f2 = new Float(f);
		Float f3 = Float.valueOf(f);
		Float f4 = Float.parseFloat("12");
		String str = f4.toString();
		System.out.println(str);
		

	}

}
