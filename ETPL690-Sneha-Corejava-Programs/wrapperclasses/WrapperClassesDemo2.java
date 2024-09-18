package com.evergent.corejava.wrapperclasses;

public class WrapperClassesDemo2 {
	public static void main(String args[]) {
		int i1=100;
		Integer t1=new Integer(i1);
		int i2=t1.intValue();
		double d1=799.89;
		Double d2=new Double(d1);
		double t2=d2.doubleValue();
		byte b1=10;
		Byte b2=new Byte(b1);
		byte bb3=b2.byteValue();
		//integer
		System.out.println("Int value:"+i1);
		System.out.println("obj value:"+t1);
		System.out.println("convert int obj value to primitive:"+i2);
		//Double value
		System.out.println("Int value:"+d1);
		System.out.println("obj value:"+d2);
		System.out.println("convert int obj value to primitive:"+t2);
		//Byte value
		System.out.println("Int value:"+b1);
		System.out.println("obj value:"+b2);
		System.out.println("convert int obj value to primitive:"+bb3);
		//Double value
		
	}

}
