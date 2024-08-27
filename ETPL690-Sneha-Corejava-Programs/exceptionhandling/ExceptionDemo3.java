package com.evergent.corejava.exceptionhandling;
//if there are two errrors in class develper should be first exception and the second exception will be handle 
public class ExceptionDemo3 {
	String str="null";
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(str.length());
			System.out.println("end");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle:"+e);
		}
	}

	public static void main(String[] args) {
		ExceptionDemo3 ed2=new ExceptionDemo3();
		ed2.myData();

	}

}
