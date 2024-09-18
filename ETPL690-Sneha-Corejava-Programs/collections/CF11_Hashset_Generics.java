package com.evergent.corejava.collections;

import java.util.HashSet;
import java.util.*;


public class CF11_Hashset_Generics {
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
	}

}
