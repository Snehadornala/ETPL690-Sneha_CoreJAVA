package com.evergent.corejava.exceptionhandling;

public class StackOverFlowException16 {
	public static void main(String args[]) {
		try {
			recursiveMethod();
		}
		catch(StackOverflowError e) {
			System.out.println("StackOverFlowException:"+e.getMessage());
		}
	}

public static void recursiveMethod() {
	recursiveMethod();
}
}