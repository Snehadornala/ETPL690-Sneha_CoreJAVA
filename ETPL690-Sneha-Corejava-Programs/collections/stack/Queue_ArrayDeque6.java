package com.evergent.corejava.collections.stack;

import java.util.ArrayDeque;

public class Queue_ArrayDeque6 {
	public static void main(String args[]) {
		ArrayDeque<String> pq=new ArrayDeque<>();
		pq.add("Ravi");
		pq.add("Bhanu");
		pq.add("shankar");
		pq.add("Chandu");
		System.out.println(pq);
		System.out.println(pq.peek());
		
	}

}
