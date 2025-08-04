package com.core.Object;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Objects;

public class ObjectClassExample extends Thread {

	private static Parameter[] parameters;

	public static void main(String[] args) {

		User obj = new User();
		Class<? extends User> class1 = obj.getClass();
		Method[] declaredMethods = class1.getDeclaredMethods();
		for (Method m : declaredMethods) {
			System.out.println(m.getName());
		}
		Constructor<?>[] declaredConstructors = class1.getDeclaredConstructors();
		for (Constructor c : declaredConstructors) {
			parameters = c.getParameters();
			for (Parameter p : parameters) {
				System.out.println(p.getType());
			}
			System.out.println();
		}
		System.out.println(obj.getClass());

	}

}

class User {

	User() {

	}

	public User(String name, String address, int id) {
		super();
		this.name = name;
		this.address = address;
		this.id = id;
	}

	String name;
	String address;
	int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		int hashCode = name.hashCode();
		hash = 11 * hash + (hashCode);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return  id == other.id ;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", id=" + id + "]";
	}

}