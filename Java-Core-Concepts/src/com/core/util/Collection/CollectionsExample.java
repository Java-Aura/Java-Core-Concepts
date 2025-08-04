package com.core.util.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("ef");
		li.add("ab");
		li.add("cd");
		Collections.sort(li, (str, str1) -> str1.compareTo(str));
		System.out.println(li);
		List<String> synchronizedList = Collections.synchronizedList(li);
	}
}

class MyComparator1 implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}

}
