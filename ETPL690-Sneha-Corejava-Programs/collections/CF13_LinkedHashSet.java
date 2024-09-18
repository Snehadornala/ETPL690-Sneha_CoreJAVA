package com.evergent.corejava.collections;
 import java.util.*;
 
public class CF13_LinkedHashSet {
	public static void main(String args[]) {
		LinkedHashSet<String> fruits=new LinkedHashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Date");
		fruits.add("cherry");
		System.out.println("intial LinkedList:"+fruits);
		System.out.println("iterating over linkedHAshset:"+fruits);
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		System.out.println("contains "+fruits.contains("Banana"));
		fruits.remove("Banana");
		System.out.println("After removing:"+fruits);
		System.out.println("Size of LinkedHashSet:"+fruits.size());
		fruits.clear();
		System.out.println("After clearing:"+fruits);
		
		
		
	
	}

}
