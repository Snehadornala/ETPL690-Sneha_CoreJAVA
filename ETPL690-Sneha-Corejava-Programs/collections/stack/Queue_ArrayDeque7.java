package com.evergent.corejava.collections.stack;

import java.util.ArrayDeque;

public class Queue_ArrayDeque7 {
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
		
	}

}
