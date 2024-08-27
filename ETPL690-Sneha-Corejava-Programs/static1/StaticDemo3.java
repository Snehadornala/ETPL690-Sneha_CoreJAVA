package com.evergent.corejava.static1;

public class StaticDemo3 {
	static String cname="India";
	String name="Sneha";
	static public void Mydata() {
		System.out.println("Mydata");
	}
	public void show() {
		System.out.println("show data");
	}
	public static void main(String args[]) {
		Mydata();
		System.out.println(cname);
	StaticDemo3 st=new StaticDemo3();
	}

}
