package com.evergent.corejava.static1;

public class StaticDemo5 {
	static String cname="India";
	static {
		System.out.println("static block");
	}
	static public void MyData() {
		System.out.println("MyData");
	}
	public static void main(String args[]) {
		System.out.println(cname);
		staticDemo1.MyData();
	}

}
