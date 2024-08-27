package com.evergent.corejava.static1;

public class StaticDemo4 {
	static String cname="India";
	String name="Sneha";
	static public void Mydata() {
		System.out.println("Mydata");
	}
	public void show() {
		Mydata();
		System.out.println("show data");
	}
	public static void main(String args[]) {
		Mydata();
		System.out.println(cname);
		StaticDemo4 sd4=new StaticDemo4();
		sd4.show();
	}

}
