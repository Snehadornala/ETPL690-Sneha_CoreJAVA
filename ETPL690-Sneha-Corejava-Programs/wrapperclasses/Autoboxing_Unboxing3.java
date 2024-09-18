package com.evergent.corejava.wrapperclasses;

public class Autoboxing_Unboxing3 {
	public static void main(String args[]) {
		int a=10;
		Integer i=new Integer(a);
		int i1=i.intValue();
		System.out.println(i);
		System.out.println(i1);
		char ch ='a';
		Character myc=new Character(ch);
		char ch2=myc.charValue();
		System.out.println(ch);
		System.out.println(myc);
		
		
	}

}
