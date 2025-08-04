package com.core.blocks;

public class LocalBlock {

	public static void main(String[] args) {
		
		new BlockLocal(); // local blocks will not be executed
		new BlockLocal().loclBlock();

	}

}

class BlockLocal{
	
	String str;
	static String strStatic;
	
	public void loclBlock() {
		String localVar = "I'm local variable";
		
		{
			str = "Initialized from local block";
			strStatic = "I'm static but initialized from local block";
			System.out.println("I'm from local block");
			System.out.println(str);
			System.out.println(strStatic);
			System.out.println(localVar);
		}
		
		{
			System.out.println();
			System.out.println("Second Local Bloack");
			str = "Initialized from local block";
			strStatic = "I'm static but initialized from local block";
			System.out.println("I'm from local block");
			System.out.println(str);
			System.out.println(strStatic);
			System.out.println(localVar);
		}
		
	}
}