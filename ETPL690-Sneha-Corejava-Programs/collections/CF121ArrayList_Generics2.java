package com.evergent.corejava.collections;
import java.util.*;

public class CF121ArrayList_Generics2 {
	public static void main(String args[]) {
		ArrayList<Integer> mylist=new ArrayList<Integer>();
		mylist.add(100);
		mylist.add(10);
		mylist.add(40);
		mylist.add(200);
		System.out.println(mylist);
		Iterator i=mylist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(Object o:mylist) {
			System.out.println(o);
		}
		
		
	}

}
