package com.core.basics;

import com.core.arrays.ArrayExample;

public class StaticNonStatic {

	public static void main(String[] args) {
		ArrayExample arrr= new ArrayExample();
		
		StaticNonStaticTest obj = new StaticNonStaticTest(); // one object is created
		
		obj.k=70;
		obj.j=90;
		System.out.println(obj.k); // 70
		System.out.println(obj.j);  //90
		
		StaticNonStaticTest obj1 = new StaticNonStaticTest(); // second object is created
		System.out.println(obj1.k); // 30
		System.out.println(obj1.j);  //90
		
	}

}

class StaticNonStaticTest{
	
	int k = 30;
	static int j = 20;
	
}
