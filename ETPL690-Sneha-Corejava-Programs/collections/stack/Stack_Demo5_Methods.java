package com.evergent.corejava.collections.stack;

import java.util.Stack;

public class Stack_Demo5_Methods {
	public static void main(String args[]) {
		Stack<String> stack=new Stack<>();
		stack.push("Apple");
		stack.push("Banana");
		stack.push("cherry");
		stack.push("Date");
		System.out.println("Stack:"+stack);
		String topElement=stack.peek();
		System.out.println("top element:"+topElement);
		String removedElement=stack.pop();
		System.out.println("removed Element:"+removedElement);
		System.out.println(stack);
		boolean isEmpty=stack.isEmpty();
		System.out.println("Is the stack empty"+isEmpty);
		int position=stack.search("Banana");
		if(position!=-1) {
			System.out.println("position of banana:"+position);
		}
		else {
			System.out.println("Banana is not in stack");
		}
		stack.clear();
		System.out.println("stack after clearing:"+stack);
		
		}

}
