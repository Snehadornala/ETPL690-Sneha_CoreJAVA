package com.evergent.corejava.collections.stack;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Deque;

public class Queue_LinkedList10 {
	public static void main(String args[]) {
		Deque<String> pq=new LinkedList<>();
		pq.add("Ravi");
		pq.add("Bhanu");
		pq.add("shankar");
		pq.add("Chandu");
		System.out.println(pq);
		System.out.println(pq.poll());
		
	}

}
