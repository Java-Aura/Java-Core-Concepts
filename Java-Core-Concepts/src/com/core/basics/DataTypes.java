package com.core.basics;

public class DataTypes {
	
	byte b2;
	short s1;
	int i1;
	long l1;
	float f1;
	double d1;
	char c1;
	boolean b3;
	
	public void display() {
		System.out.println("Default value of byte: "+b2);
		System.out.println("Default value of short: "+s1);
		System.out.println("Default value of int: "+i1);
		System.out.println("Default value of long: "+l1);
		System.out.println("Default value of float: "+f1);
		System.out.println("Default value of double: "+d1);
		System.out.println("Default value of char: "+c1);
		System.out.println("Default value of boolean: "+b3);
	}

	public static void main(String[] args) {
		
		
		new DataTypes().display();
		
		byte b = 127; // byte data type.
		
		short s = 13; // 
		
		int i = 14;
		
		long l = 367;
		
		float f = 32.4f;
		
		double d = 32.7;
		
		char c = 'k';
		
		boolean b1 = true;
		
		System.out.println("byte: "+b);
		System.out.println("short: "+s);
		
		System.out.println("int: "+i);
		System.out.println("long: "+l);
		System.out.println("float: "+f);
		System.out.println("double: "+d);
		System.out.println("char: "+c);
		System.out.println("boolean: "+b1);
		
		

	}

}
class Test1{
	
void dis() {
	System.out.println("from calss test1");
}
}
