package com.core.util.Collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class PrioirtyQueueExample {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(12);
		pq.add(23);
		pq.add(123);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		
		ArrayDeque<Integer> ard = new ArrayDeque<Integer>();
		ard.add(11);
		ard.add(18);
		ard.add(10);
		System.out.println(ard);
		ard.addFirst(2);
		System.out.println(ard);
		ard.addLast(56);
		System.out.println(ard);
		System.out.println(ard.peek());
		System.out.println(ard.poll());
		
		
	}

}
