package com.evergent.corejava.collections.stack;
import java.util.*;
public class Queue_ArrayDeque9_poll {
	public static void main(String args[]) {
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.add("Banana");
		ad.addFirst("Pineapple");
		ad.add("watermelon");
		ad.addLast("Papaya");
		System.out.println(ad);
		System.out.println(ad.poll());
		System.out.println(ad.pollLast());
		System.out.println(ad.pollFirst());
		System.out.println(ad);
	}

}
