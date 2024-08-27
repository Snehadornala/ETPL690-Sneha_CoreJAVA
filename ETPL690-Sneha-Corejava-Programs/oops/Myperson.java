package com.evergent.corejava.oops;

class Person1{
	public void personInfo() {
		System.out.println("Sneha");
	}
}
class PersonDetails extends Person1{
	public void PersonData() {
		System.out.println("Hyd");
	}
}
class Myperson extends PersonDetails{
	public void show() {
		System.out.println("local methods");
	}
	public static void main(String args[]) {
		Myperson mi=new Myperson();
		mi.personInfo();
		mi.PersonData();
		mi.show();
	}
}
