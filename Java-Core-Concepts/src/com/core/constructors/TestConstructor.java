package com.core.constructors;

public class TestConstructor {
	
	int k;
	static int j;
	
	{
		k =78;
		j=67;
	}
	static {
		
		j=45;
	}
	
	TestConstructor(){
		System.out.println("value of k = "+k);
		System.out.println("value of j = "+j);
		k= 90;
		j=89;
	}

	public static void main(String[] args) {
		
//System.out.println("value of k = "+new TestConstructor().k);
System.out.println("value of j = "+j);
	}

}
