package com.evergent.corejava.collections.stack;

import java.util.Stack;

public class Stack_Demo3 {

	public static void main(String[] args) {
		Stack mystack=new Stack();
		mystack.push("Red");
		mystack.push("Black");
		mystack.push("White");
		System.out.println(mystack);
		System.out.println(mystack.search("White"));
		System.out.println(mystack);
	

	}

}
