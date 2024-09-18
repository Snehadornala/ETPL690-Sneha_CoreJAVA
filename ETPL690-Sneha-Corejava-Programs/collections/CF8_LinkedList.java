package com.evergent.corejava.collections;
 import java.util.*;
 
public class CF8_LinkedList {
	public static void main(String args[]) {
		LinkedList fruits=new LinkedList();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Date");
		fruits.add("cherry");
		System.out.println("intial LinkedList:"+fruits);
		fruits.addFirst("Mango");
		System.out.println("adding first in the  LinkedList:"+fruits);
		fruits.addLast("Orange");
		System.out.println("after adding last:"+fruits);
		System.out.println("get Index element:"+fruits.get(2));
		fruits.removeFirst();
		System.out.println("removed first element:"+fruits);
		fruits.removeLast();
		System.out.println("removed last element:"+fruits);
		System.out.println("contains "+fruits.contains("Banana"));
		fruits.remove("Banana");
		System.out.println(fruits);
		System.out.println("Size of fruits"+fruits.size());
		fruits.clear();
		
		
		
	
	}

}
