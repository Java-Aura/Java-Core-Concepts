package com.core.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(16);
		list.add(10);
		list.add(67);
		list.add(45);
		list.add(89);
		list.add(12);

		Optional<Integer> op = Optional.empty();
		if(op.isPresent()) {
			System.out.println(op.get());
		}
		Optional<Integer> of2 = Optional.of(12);
		if(of2.isPresent()) {
			System.out.println(of2.get());
		}

		//Optional<Integer> of3 = Optional.of(null);// raises nullPointerException
		Optional<Integer> of3 = Optional.ofNullable(null);
		//System.out.println(of3.get());
		
		if(of2.isPresent()) {
			System.out.println(of2.get());
		}
		else {
			System.out.println("element not present");
		}
		
		of2.ifPresent(e->{
			System.out.println(e);
		});
		
	}

}
