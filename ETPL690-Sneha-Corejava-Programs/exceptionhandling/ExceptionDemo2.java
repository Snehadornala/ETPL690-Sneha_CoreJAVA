package com.evergent.corejava.exceptionhandling;
/* all exceptions are executed while abnormal conditions only
 * once any exceptions are occurring in java 
 then remaining lines of code is unreachable
 */
public class ExceptionDemo2 {
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
		ExceptionDemo2 ed2=new ExceptionDemo2();
		ed2.myData();

	}

}
