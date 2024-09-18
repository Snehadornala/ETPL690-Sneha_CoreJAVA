package com.evergent.corejava.collections;

import java.util.HashSet;
import java.util.*;


public class CF12_Hashset_Generics2 {
	public static void main(String args[]) {
		HashSet<String> myset=new HashSet<String>();
		myset.add("Hello");
		myset.add("Hello");
		myset.add("Welcome");
		System.out.println(myset);
		Iterator i=myset.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(String s:myset) {
			System.out.println(s);
		}
	}

}
