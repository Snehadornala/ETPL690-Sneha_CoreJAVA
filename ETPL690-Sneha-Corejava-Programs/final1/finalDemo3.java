package com.evergent.corejava.final1;
 final class Myclass1{
	 final public void  myproducts() {
		 System.out.println("all products");
	 }
 }
public class finalDemo3 {//extends Myclass1{
	final String cname="India";
	public void myProduct1() {
		System.out.println("hello product");
	}
	public void myData() {
		System.out.println(cname);
	}
	public static void main(String args[]) {
		finalDemo3 fd=new finalDemo3();
		fd.myData();
		fd.myProduct1();
		
	}

}
