package com.evergent.corejava.static1;

public class StaticDemo2 {
	static String cname="India";
	String name="Sneha";
	static public void myData() {
		System.out.println("Mydata");
	}
	public void show() {
		System.out.println("show is non static");
	}
	public static void main(String args[]) {
		myData();
		System.out.println(cname);
	}

}
