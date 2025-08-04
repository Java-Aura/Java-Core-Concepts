package com.core.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodsExample {

	public static void main(String[] args) {

		Map<String, String> employees = new HashMap<String, String>();

		employees.put("Sv", "Hyd");
		employees.put("Sp", "vizag");
		employees.put("Sk", "warangal");
		employees.put("Sh", "sdpt");
		employees.put("Sm", "Hyd");

		List<Integer> list = new ArrayList<Integer>();
		list.add(16);
		list.add(10);
		list.add(67);
		list.add(45);
		list.add(89);
		list.add(12);

		List<List<Integer>> list1 = new ArrayList<List<Integer>>();
		list1.add(list);
		list1.add(list);

		System.out.println(list1);
		List<Integer> falttenMap = list1.stream().flatMap(e -> e.stream()).map(e -> e + 56)
				.collect(Collectors.toList());
		System.out.println(falttenMap);

		Integer summingInt = falttenMap.stream().collect(Collectors.summingInt(e -> e));
		System.out.println(summingInt);

		Long counting = falttenMap.stream().collect(Collectors.counting());
		System.out.println(counting);

		List<Integer> filter = list.stream().filter(e -> e > 40).collect(Collectors.toList());
		System.out.println(filter);

		List<Integer> map = list.stream().map(e -> e + 34).collect(Collectors.toList());
		System.out.println(map);

		Map<String, List<Entry<String, String>>> collect3 = employees.entrySet().stream()
				.collect(Collectors.groupingBy(e -> e.getValue()));
		System.out.println(collect3);

		List<Integer> ascendingOrder = list.stream().sorted().collect(Collectors.toList());
		System.out.println(ascendingOrder);

		List<Integer> decendingOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(decendingOrder);
		
		Optional<Integer> findFirst = decendingOrder.stream().findFirst();
		System.out.println(findFirst.get());
		
		Optional<Integer> findAny = decendingOrder.stream().findAny();
		System.out.println(findAny.get());
		
		Optional<Integer> findFirst2 = decendingOrder.stream().skip(1).findFirst();
		System.out.println(findFirst2.get());
		
		Integer summingInt1 = decendingOrder.stream().collect(Collectors.summingInt(e->e+2));
		System.out.println(summingInt1);
		
		Integer reduce = decendingOrder.stream().reduce(2,(a,b)->a+b);
		System.out.println(reduce);
	}

}
