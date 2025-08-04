package com.core.util.Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {


		Vector<String> v = new Vector<String>();
		v.add("Sv");
		v.add("Sp");
		Enumeration<String> e = v.elements();
	System.out.println("Printing using enumarator");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("Printing using iterator");
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Prinitng using listIterator forward direction");
		ListIterator< String> lit = v.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
			
		}

	}

}
