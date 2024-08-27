package com.evergent.corejava.final1;
 class Myclass{
	 final public void  myproducts() {
		 System.out.println("all products");
	 }
 }
public class finalDemo2 {
	final String cname="India";
	public void myProduct1() {
		System.out.println("hello product");
	}
	public void myData() {
		System.out.println(cname);
	}
	public static void main(String args[]) {
		finalDemo2 fd=new finalDemo2();
		fd.myData();
		fd.myProduct1();
		
	}

}
