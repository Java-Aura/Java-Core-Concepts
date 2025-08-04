package com.core.method.reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaticMethodReferring {
	
	public static int compare(Users u1, Users u2) {
		return u1.getSalary().compareTo(u2.getSalary());
	}
	
	public int compare1(Users u1, Users u2) {
		return u1.getSalary().compareTo(u2.getSalary());
	}

	public static void main(String[] args) {

List<Users> list = new ArrayList<Users>();
list.add(new Users("sv", 123));
list.add(new Users("sp", 3454));
list.add(new Users("sk", 6765723));
list.add(new Users("sm", 6578));

Collections.sort(list, StaticMethodReferring:: compare); // static method referring
list.stream().sorted(StaticMethodReferring:: compare);// static method referring

Collections.sort(list, new StaticMethodReferring():: compare1); // non-static method referring




	}

}

class Users {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	Integer salary;

	public Users(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}