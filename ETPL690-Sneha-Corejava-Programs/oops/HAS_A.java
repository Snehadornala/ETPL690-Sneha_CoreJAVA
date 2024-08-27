package com.evergent.corejava.oops;

public class HAS_A {
	public void myData() {
		System.out.println("HAS_A");
	}
	public static void main(String arg[]) {
		HAS_A has=new HAS_A();
		has.myData();
		Person person=new Person();
		person.display();
	}

}
