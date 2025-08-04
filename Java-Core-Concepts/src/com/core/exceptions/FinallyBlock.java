package com.core.exceptions;

public class FinallyBlock {

	public static void main(String[] args) {
System.out.println(new FinallyBlock().getString());
		
	}

	public String getString() {
		String str = "TEST";
		try {
			str.toLowerCase();
			return str;
			//System.exit(0); // will shutdown the JVM or system
		}
		finally {
			System.out.println("Always executes");
		}
	}
}
