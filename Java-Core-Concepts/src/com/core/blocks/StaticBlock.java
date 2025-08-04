package com.core.blocks;

public class StaticBlock {

	public static void main(String[] args) {

System.out.println(Block.k);
new Block();
new Block();

	}

}

class Block{
	
	int f;
	static int i; // declared
	static String k= "str";
	
	static {
		// gives error as we can access only static members f = 12;
		i = 23;
		System.out.println("From Static Block " + i);
	}
	
	static {
		i = 12;
		System.out.println("From Static Block " + i);
	}
	
	
	
}
