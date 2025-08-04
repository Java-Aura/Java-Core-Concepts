package com.core.util.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		//System.out.println(al.en);
		al.add(34);
		al.add(38);
		al.add(56);
		al.add(59);
		System.out.println(al);
		System.out.println(al.get(1));
		al.set(1, 345);
		System.out.println(al.get(1));
		System.out.println(al.remove(0));
		System.out.println(al);

		Iterator<Integer> iterator = al.iterator();
		while (iterator.hasNext()) {
			System.out.println("iterator: " + iterator.next());
		}

		ListIterator<Integer> listIterator = al.listIterator(al.size());

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previousIndex());
			System.out.println("List-iterator: " + listIterator.previous());

		}

		Collection c1 = new ArrayList();
		c1.add(34);
		c1.add(56);

		Collection c2 = new ArrayList();
		c2.add(67);
		c2.add(89);

		Collection c = new ArrayList();
		c.add(12);
		c.add(23);
		c.add(24);
		System.out.println("c Size: " + c.size());
		System.out.println("c isEmpty: " + c.isEmpty());
		System.out.println("c1 isEmpty: " + c1.isEmpty());
		System.out.println("c contains of 12: " + c.contains(12));
		System.out.println("c contains of 167: " + c.contains(167));
		Object[] array = c.toArray(); // conerting collection object to an array
		for (Object obj : array) {
			System.out.println(obj);
		}
		System.out.println();
		Iterator iterator1 = c.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		boolean remove = c.remove(24);
		System.out.println(remove);
		c.addAll(c1);
		c.addAll(c2);
		System.out.println(c);
		System.out.println(c.containsAll(c1));
		System.out.println(c.containsAll(c2));
		// System.out.println(c.removeAll(c1));
		c.retainAll(c1);
		al.removeIf(n -> (n <= 34));//

		System.out.println(c);
		c.clear();
		System.out.println(c);
		System.out.println(al);
		List<Integer> collect = al.stream().filter(n -> n > 38).collect(Collectors.toList());
		System.out.println(collect);
		Spliterator<Integer> spliterator = collect.spliterator();
		spliterator.forEachRemaining(n -> {
			System.out.println(n);
		});

		ArrayList<Integer> list = new ArrayList<Integer>();//

		// list.add("sv");
		list.add(12);
		list.forEach(e -> {
			System.out.println(e);
		});
	}

}
