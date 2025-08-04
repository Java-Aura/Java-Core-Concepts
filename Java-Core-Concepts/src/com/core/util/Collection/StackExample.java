package com.core.util.Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(112);
		s.push(null);
		s.push(12);
		Iterator<Integer> iterator = s.iterator();
		ListIterator<Integer> listIterator = s.listIterator();
		Enumeration<Integer> elements = s.elements();
		System.out.println("Printing using enumarator");
		while (elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
			
		}
		System.out.println("top of the element in the stack: "+ s.peek());
		System.out.println("Removing elements");
		while(!s.isEmpty()) {
			System.out.println(s.pop());// removes elements
		}
		System.out.println(s);

	}

}
