package com.evergent.corejava.exceptionhandling;
//we should follow Exception hierarchy
public class ExceptionDemo4 {
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
	
		
		}

	public static void main(String[] args) {
		ExceptionDemo4 ed2=new ExceptionDemo4();
		ed2.myData();

	}

}
