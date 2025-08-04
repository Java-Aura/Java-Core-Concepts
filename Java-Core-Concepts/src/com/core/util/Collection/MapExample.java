package com.core.util.Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String str = "java";
		String str1 = "Java";
		String str2 = "javaa";
		String str3 = "nullCompute";

		hm.put(str, 8);
		hm.put(str2, 11);
		hm.put(str1, 17);
		hm.put(str2, 17);
		hm.replace(str2, 17, 67);
		hm.putIfAbsent(str2, 34);
		Integer i = 56;
		hm.put(str3, 2);
		hm.put(null, 45);
		System.out.println("SV".hashCode());
		System.out.println("Sv".hashCode());
		int index = "SV".hashCode() & (15);
		int index1 = "Sv".hashCode() & (15);

		System.out.println("Index " + index);
		System.out.println("Index1 " + index1);

		hm.compute(str3, (k, v) -> (v == null) ? i : v + i);

		System.out.println("Value of Java: " + hm.get("java"));
		System.out.println("Value of JavaTest: " + hm.get("JavaTest"));
		System.out.println("Value of javaa With Default Value: " + hm.getOrDefault("javaa", 90));

		System.out.println(hm.containsKey("javas"));
		System.out.println(hm.containsValue(17));
		System.out.println(hm.containsValue(117));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		Set<Entry<String, Integer>> entrySet = hm.entrySet();
		for (Entry<String, Integer> m : entrySet) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		hm.forEach((k, v) -> {
			System.out.println("forEach():" + k);
			System.out.println("forEach():" + v);
		});

		System.out.println(hm);

		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("St", "St");
		hm1.put("Sp", "Sp");
		hm1.put("Sv", "Sv");
		System.out.println(hm1);
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("St", "St");
		lhm.put("Sp", "Sp");
		lhm.put("Sv", "Sv");
		System.out.println(lhm);

		TreeMap<String, String> tm = new TreeMap<String, String>();

		tm.put("St", "St");
		tm.put("Sp", "Sp");
		tm.put("Sv", "Sv");
		System.out.println(tm);

		TreeMap<String, String> tm1 = new TreeMap<String, String>(new MyComparator());

		tm1.put("St", "Stt");
		tm1.put("Sp", "Spp");
		tm1.put("Sv", "Svv");
		System.out.println(tm1);
		LinkedList<Entry<String,String>> li = new LinkedList<Entry<String,String>>();
		li.addAll(tm1.entrySet());
		Collections.sort(li,(v1,v2)-> v1.getValue().compareTo(v2.getValue()));
		LinkedHashMap<String, String> lhm1 = new LinkedHashMap<String, String>();
		li.forEach(entry->{
			lhm1.put(entry.getKey(), entry.getValue());
		});
		
		System.out.println(lhm1);
		Hashtable<String, String> ht = new Hashtable<String,String>();
		ht.put("str", null);
		System.out.println(ht);
		
		
	}
}
class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}
