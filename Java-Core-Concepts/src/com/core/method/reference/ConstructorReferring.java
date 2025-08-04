package com.core.method.reference;

import java.util.function.Function;

public class ConstructorReferring {

	public static void main(String[] args) {
		I1 i1 = (sal)->new Employee(sal);
		System.out.println(i1.getSalary(1000).getSalary());
		
		Function<Integer, Employee> f1 = Employee:: new;
		System.out.println(f1.apply(2345).getSalary());;
	}

}


class Employee{
	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	Integer salary;

	public Employee(Integer salary) {
		super();
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}
	
}

@FunctionalInterface
interface I1{
	Employee getSalary(Integer s);
}
