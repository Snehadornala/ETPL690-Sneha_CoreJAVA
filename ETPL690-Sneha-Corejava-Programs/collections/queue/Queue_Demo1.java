package com.evergent.corejava.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.*;
public class Queue_Demo1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(8);
		pq.offer(2);
		pq.add(5);
		pq.add(9);
		System.out.println(pq);
		System.out.println(pq.peek());
	}

	}


