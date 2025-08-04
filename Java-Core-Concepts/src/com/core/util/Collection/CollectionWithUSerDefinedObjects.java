package com.core.util.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionWithUSerDefinedObjects {

	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee("bhanu", "Hyderabad", Long.valueOf(23000)));
		employee.add(new Employee("Akhil", "Vizag", Long.valueOf(26000)));
		employee.add(new Employee("Akhil", "Hyderabad", Long.valueOf(10000)));
		employee.add(new Employee("vinod", "Vizag", Long.valueOf(13000)));
		employee.add(new Employee("akhila", "Hyderabad", Long.valueOf(12000)));
		Comparator<Employee> com = Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)
				.reversed();
		Comparator<Employee> com1 = Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary);
		System.out.println(employee);
		List<Employee> sorted = employee.stream().sorted(com).collect(Collectors.toList());
		System.out.println(sorted);

		long count = employee.stream().filter(e -> e.getSalary() > 15000).count();
		Optional<Employee> findFirst = employee.stream().filter(e -> e.getSalary() > 15000).sorted(com1).findFirst();
		Optional<Employee> findAny = employee.stream().filter(e -> e.getSalary() > 15000).sorted(com1).findAny();
		System.out.println(findAny.get());
		System.out.println(findFirst.get());
		System.out.println(employee.stream().anyMatch(e -> e.getName().startsWith("K")));

		System.out.println(count);
		List<Integer> li = new ArrayList<Integer>();
		li.add(2);
		li.add(22);
		li.add(21);
		li.add(72);
		li.add(42);
		li.add(92);

		Optional<Integer> reduce = li.stream().reduce((e1, e2) -> e1 + e2);
		System.out.println(reduce.get());
		Stream<Integer> limit = li.stream().limit(4);
		System.out.println("printing limit");
		limit.forEach(System.out::println);
		Map<String, Long> collect = employee.stream()
				.collect(Collectors.groupingBy(e -> e.getAddress(), Collectors.counting()));
		System.out.println(collect);
		
		Map<String, Long> collect1 = employee.stream()
				.collect(Collectors.groupingBy(Employee:: getAddress, Collectors.counting()));

		Stream<String> of = Stream.of("sv", "sp", "sa");
		Stream<String> sorted2 = of.sorted();
		sorted2.forEach(System.out::println);
		Integer in[] = new Integer[] { 12, 34, 11, 45 };
		Stream<Integer> of2 = Stream.of(in);
		of2.forEach(System.out::println);
		
		List<Integer> li2 = new ArrayList<Integer>();
		li2.add(2);
		li2.add(22);
		li2.add(21);
		li2.add(72);
		li2.add(42);
		li2.add(92);
		//li2 = null;
		if(null!=li2) {
			Optional<List> op = Optional.of(li2);
			System.out.println(op.get());
		}
		 ArrayList<Integer> arrayList = new ArrayList<Integer>();
		 arrayList.add(100);
		List<Integer> orElseGet = Optional.ofNullable(li2).orElseGet(()-> new ArrayList<Integer>());
		System.out.println(orElseGet);
		List<Integer> orElse = Optional.ofNullable(li2).orElse(arrayList);
		System.out.println(orElse);
		
		ArrayList<List<Integer>> arrayList2 = new ArrayList<List<Integer>>();
		arrayList2.addAll(Arrays.asList(li));
		arrayList2.addAll(Arrays.asList(li2));
		System.out.println(arrayList2);
		List<Integer> map = arrayList2.stream().flatMap(Collection::stream).map(e->e+4).collect(Collectors.toList());
		System.out.println(map);
		List<List<Integer>> asList = Arrays.asList(Arrays.asList(23,67),Arrays.asList(56,68));
		System.out.println(asList);
		
	}

}

class Employee {
	String name;
	String address;
	Long salary;

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

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Employee(String name, String address, Long salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}

	static void getMsg() {
		System.out.println("static method");
	}
	
}