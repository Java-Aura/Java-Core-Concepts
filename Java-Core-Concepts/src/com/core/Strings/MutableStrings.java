package com.core.Strings;

import java.util.StringTokenizer;

public class MutableStrings {

	public static void main(String[] args) {
		
		
		String str = "java";
		str.concat("test");
		
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer("java");
		sb.append("Test");
		System.out.println(sb.toString());
		///System.out.println(sb.capacity());
		
		StringBuilder sb1 = new StringBuilder("java");
		
		sb1.append("test1");
		System.out.println(sb1.toString());
		
		StringTokenizer st = new StringTokenizer("java test example for String tokenizer");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		StringTokenizer st1 = new StringTokenizer("java: test: example for String tokenizer",":");
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		StringTokenizer st2 = new StringTokenizer("java: test: example for String tokenizer",":",true);
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}

	}

}
