package com.core.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectIOStreams {

	public static void main(String[] args) throws ClassNotFoundException {

		Employee emp = new Employee("Bhanu",24,"Hyderabad");
		System.out.println(emp.toString());
		try (FileOutputStream fos = new FileOutputStream("D:\\Employee.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream("D:\\Employee.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);){
			oos.writeObject(emp);
			Employee readObject = (Employee)ois.readObject();
			System.out.println(readObject.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Employee() {
		System.out.println("Default Constructor");
	}
	
	public String name;
	public transient int age;
	public String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
}
