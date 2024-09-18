package com.evergent.corejava.collections.stack;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Queue_Demo5_Reverseorder {
	public static void main(String args[]) {
		Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
		pq.add(8);
		pq.offer(2);
		pq.add(5);
		pq.add(9);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		
	}

}
