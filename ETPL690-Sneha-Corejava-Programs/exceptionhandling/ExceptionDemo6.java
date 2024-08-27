package com.evergent.corejava.exceptionhandling;
//try followed by either catch or finally block
public class ExceptionDemo6 {
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
			ExceptionDemo6 ed2=new ExceptionDemo6();
			ed2.myData();

		}

}
