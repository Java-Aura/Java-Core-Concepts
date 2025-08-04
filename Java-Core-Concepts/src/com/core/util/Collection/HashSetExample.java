package com.core.util.Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		String str = "javatststs";
		HashSet<Character> hs1 = new HashSet<Character>();
		char[] charArray = str.toCharArray();
		for(Character c: charArray)	{
			hs1.add(c);
		}
		System.out.println(hs1);
		HashSet<String> hs = new HashSet<String>();
		hs.add("Java");
		hs.add("HashSet");
		hs.add("Java");
		hs.add(null);
		System.out.println(hs);
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		for(Character c: charArray)	{
			lhs.add(c);
		}
		System.out.println(lhs);
	}

}
