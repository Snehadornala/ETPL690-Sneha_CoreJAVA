package com.evergent.corejava.collections;
import java.util.*;

public class CF10_ArrayList_Generics {
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
		
		
	}

}
