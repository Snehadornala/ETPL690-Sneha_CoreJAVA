package com.evergent.corejava.basicprograms;

public class Swapping {
	int a=6,b=9,c;
	public void swapping() {
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		}
	public void swapc() {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String args[]) {
		Swapping sp=new Swapping();
		sp.swapping();
		sp.swapc();
	}

}



