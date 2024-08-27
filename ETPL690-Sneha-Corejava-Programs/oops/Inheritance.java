package com.evergent.corejava.oops;

public class Inheritance extends Calculation{
	public void show() {
		System.out.println("local methods");
	}
	public static void main(String args[]) {
		Inheritance my=new Inheritance();
		my.show();
		my.addition();
	}

}
