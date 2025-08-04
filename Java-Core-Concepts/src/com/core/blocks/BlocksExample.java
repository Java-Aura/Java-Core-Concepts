package com.core.blocks;

public class BlocksExample {
	
	static int number;
	
	static{
		System.out.println("Executed from first static block");
		number = 23;
	}
	static{
		System.out.println("Executed from second static block");
		number = 63;
	}
	
	public static void main(String[] args) {
		System.out.println("Executed from main method");
		System.out.println("Value of number: "+number);
		System.out.println(BlocksEx.j);
		System.out.println(BlocksEx.j);
		BlocksEx obj = new BlocksEx();
		obj.k = 67;
		obj.j  = 90;
		BlocksEx obj1 = new BlocksEx();
		BlocksEx obj2 = new BlocksEx();
		System.out.println(obj2.k);
		System.out.println(obj2.j);
	}

}

class BlocksEx{
	
	int k;
	static int j;
	static {
		int h =89; // local to this block only.
		j =23;
		//k=78; // we can't access as it is a intance variable
		System.out.println("Executed from static block of BlocksEx: ");
	}
	
	{
		//System.out.println(h);
		k=45;
		j= 89;
		System.out.println("Executed from instance block of BlocksEx: ");
		
	}
	
	
}
