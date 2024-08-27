package com.evergent.corejava.exceptionhandling;
//throws an exception will exceute method by method
public class ExceptionDemo7 {
		String str="null";
		public void myData() throws NullPointerException {
			System.out.println("one");
				System.out.println(str.length());
				System.out.println("end");
			}
		public static void main(String args[]) {
			try {
			ExceptionDemo6 ed2=new ExceptionDemo6();
			ed2.myData();

		}
		catch(NullPointerException e) {
			System.out.println("I can handle:"+e);

}
		
		}	
}

