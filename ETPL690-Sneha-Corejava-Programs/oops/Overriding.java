package com.evergent.corejava.oops;

class Methodoveride {
	public void myData() {
		System.out.println("My big data:class method");
	}
}
class Overriding extends Methodoveride{
	public void myData() {
		System.out.println("Mydata");
	}
	public void show() {
		System.out.println("My big data:class method");
	}
	public static void main(String arg[]) {
		Overriding Ovr=new Overriding();
		Ovr.myData();
		Ovr.show();
	}
}
