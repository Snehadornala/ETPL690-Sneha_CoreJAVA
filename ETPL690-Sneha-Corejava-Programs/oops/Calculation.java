package com.evergent.corejava.oops;

public class Calculation {
	int a=10;
	int b=20;
	int c;
	public void addition(){
		c=a+b;
		System.out.println(c);
	}
	public void subtract(){
		c=a-b;
		System.out.println(c);
		
	}
	public void multiply(){
		c=a*b;
		System.out.println(c);
	}
	public static void main(String args[]) {
		Calculation cal=new Calculation();
		cal.addition();
		cal.subtract();
		cal.multiply();
	}
	
}
