package com.core.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WaysTOCreateObjectInJava implements Cloneable,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	String val = "TestValue";
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException, IOException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		WaysTOCreateObjectInJava obj1 = new WaysTOCreateObjectInJava();
		System.out.println(obj1.val);
		System.out.println(obj1.hashCode());
		System.out.println();
		
		WaysTOCreateObjectInJava obj2 = (WaysTOCreateObjectInJava)Class.forName("com.core.basics.WaysTOCreateObjectInJava").newInstance();
		System.out.println(obj2.val);
		System.out.println(obj2.hashCode());
		System.out.println();
		
		//using clone method
		WaysTOCreateObjectInJava obj3 = (WaysTOCreateObjectInJava)obj1.clone();
		System.out.println(obj3.val);
		System.out.println(obj3.hashCode());
		System.out.println();
		
		//Using deserialization
		
		FileOutputStream fos = new FileOutputStream(new File("d:\\objCreate.ser"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj3);
		
		FileInputStream fis = new FileInputStream("d:\\objCreate.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		WaysTOCreateObjectInJava obj4 = (WaysTOCreateObjectInJava)ois.readObject();
		System.out.println(obj4.val);
		System.out.println(obj4.hashCode());
		System.out.println();
		
		Constructor<WaysTOCreateObjectInJava> declaredConstructors = (Constructor<WaysTOCreateObjectInJava>) WaysTOCreateObjectInJava.class.getDeclaredConstructor();
		WaysTOCreateObjectInJava obj5 = declaredConstructors.newInstance();
		System.out.println(obj5.val);
		System.out.println(obj5.hashCode());
	}

}

class User{
	
	String name;
	String val = "TestValue";

	public User(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	
	
}
