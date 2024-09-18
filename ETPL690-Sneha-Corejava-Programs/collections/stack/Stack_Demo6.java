package com.evergent.corejava.collections.stack;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Stack_Demo6 {
	public static void main(String args[]) {
		Stack<String> mystack=new Stack<>();
		mystack.push("Red");
		mystack.push("Black");
		mystack.push("White");
		System.out.println(mystack);
		System.out.println("Enumeration Iteration");
		Enumeration e=mystack.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("Iterator---");
		Iterator il=mystack.iterator();
		while(il.hasNext()) {
			System.out.println(il.next());
		}
		System.out.println("For each adv loop:");
		for(String s:mystack) {
			System.out.println(s);
		}
	}

}
