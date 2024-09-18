package com.evergent.corejava.collections.stack;

import java.util.ArrayDeque;

public class Queue_LinkedList11 {
	public static void main(String args[]) {
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.add("Banana");
		ad.addFirst("Pineapple");
		ad.add("watermelon");
		ad.addLast("Papaya");
		ad.offerFirst("Kiwi");
		ad.offer("Apple");
		ad.offerLast("Mango");
		System.out.println(ad);
		boolean t=ad.isEmpty();
		System.out.println(t);
		ad.clear();
		System.out.println(ad);
		
		
	}

}
