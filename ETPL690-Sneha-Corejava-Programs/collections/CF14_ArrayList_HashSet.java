package com.evergent.corejava.collections;
import java.util.*;

public class CF14_ArrayList_HashSet {
	public static void main(String args[]) {
		List<String> mylist=new ArrayList<String>();
		mylist.add("CoreJAVA");
		mylist.add("J2EE");
		mylist.add("J2SE");
		mylist.add("MyJAVA");
		System.out.println(mylist);
		Set<String> s=new HashSet<String>();
		s.addAll(mylist);
		System.out.println(s);
		Set<String> s1=new HashSet<String>();
		s1.add("CoreJAVA");
		s1.add("CoreJAVA");
		s1.add("J2EE");
		s1.add("J2SE");
		s1.add("MyJAVA");
		//s1.add("Hello");
		if(s.equals(s1)) {
			System.out.println("same");
		}
		else {
			System.out.println("Not Same");
		}
		System.out.println(s.containsAll(s1));
		}
		
		
	}


