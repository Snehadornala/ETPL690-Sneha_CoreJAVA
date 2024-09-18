package com.evergent.corejava.collections.stack;
import java.util.*;
public class Queue_ArrayDeque8_peek {
	public static void main(String args[]) {
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.add("Banana");
		ad.addFirst("Pineapple");
		ad.add("watermelon");
		ad.addLast("Papaya");
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println(ad.peekLast());
		System.out.println(ad);
	}

}
