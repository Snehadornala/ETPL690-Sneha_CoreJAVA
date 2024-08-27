package com.evergent.corejava.oops;

public class Person {
	int age=10;
	String address="Hyderabad";
	String name="sneha";
	public void display() {
		System.out.println("name:" +name);
		System.out.println("age:" +age);
		System.out.println("address:" +address);
		
	}
	public static void main(String args[]) {
		Person P=new Person();
		P.display();
	}

}
