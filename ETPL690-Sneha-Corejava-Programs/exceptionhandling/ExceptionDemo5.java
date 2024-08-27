package com.evergent.corejava.exceptionhandling;
//if any exception is handled or not finally will execute
public class ExceptionDemo5 {
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
		catch(Exception e) {
			System.out.println("I can handle:"+e);
			}
		finally {
			System.out.println("Finally block ");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo5 ed2=new ExceptionDemo5();
		ed2.myData();

	}


}
