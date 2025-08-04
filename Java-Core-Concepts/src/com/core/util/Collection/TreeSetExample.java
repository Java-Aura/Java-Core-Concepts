package com.core.util.Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>(new MySorting());
		//ts.add(null); // Raises NullPointerException
		ts.add("java");
		ts.add("Collection");
		ts.add("Framework");
		ts.add("Awesome");
		//ts.add(null);
		System.out.println(ts);
		
		TreeSet<User> ts1 = new TreeSet<User>();
		User user = new User("Emp3");
		User user1 = new User("Emp2");
		ts1.add(user);
		ts1.add(user1);
		
		System.out.println(ts1);

	}

}
class MySorting implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
		
	}
	
}

class User implements Comparable<User>{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(User o) {
		return o.name.compareTo(this.name);
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	
}
