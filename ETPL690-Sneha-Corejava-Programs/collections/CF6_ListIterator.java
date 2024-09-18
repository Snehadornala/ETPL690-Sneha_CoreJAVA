package com.evergent.corejava.collections;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.*;

public class CF6_ListIterator {
	public static void main(String args[]) {
		List list=new ArrayList();
		list.add("Ramu");
		list.add("Ravi");
		list.add("Bhanu");
		list.add("Balu");
		ListIterator li=list.listIterator();
		li.add("welcome");
		while(li.hasNext()) {
			String S=(String)li.next();
			System.out.println(S);
			if(S.equals("balu"))
				li.remove();
			
		}
		while(li.hasPrevious())
			System.out.println(li.previous());
		
	}

}
