package com.core.util.Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVSLinkedList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		//System.out.println(al.en);
		al.add(34);
		al.add(38);
		al.add(56);
		al.add(59);
		System.out.println(al);
		al.add(0, 89);
		System.out.println(al);
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(12);
		li.add(23);
		System.out.println(li);
		li.add(0, 78);
		System.out.println(li);

	}

}
