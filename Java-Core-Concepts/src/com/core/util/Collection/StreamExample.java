package com.core.util.Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(2);
		li.add(22);
		li.add(21);
		li.add(72);
		li.add(42);
		li.add(92);
		Stream<Integer> stream = li.stream();
		List<Integer> collect = stream.map(e -> e+7).collect(Collectors.toList());
		System.out.println(li);
		System.out.println(collect);
		List<Integer> collect2 = collect.stream().filter(e-> e>30).collect(Collectors.toList());
		System.out.println(collect2);
		List<Integer> collect3 = collect2.stream().sorted(new MySorting1()).collect(Collectors.toList());
		System.out.println(collect3);
		
		System.out.println("using Stream: ");
		li.stream().forEach(System.out:: println);
		System.out.println("using parallelStream: ");
		li.parallelStream().forEach(System.out:: println);
		System.out.println("using parallelStream forEachOrdered : ");
		li.parallelStream().forEachOrdered(System.out:: println);
	}

}

class MySorting1 implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2.compareTo(o1);
	}
	
}
