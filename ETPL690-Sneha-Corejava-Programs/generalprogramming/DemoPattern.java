package com.evergent.corejava.generalprogramming;

public class DemoPattern {
	public static void main(String args[]) {
	int cnt=1,i,j;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=5;++j)
		{
			System.out.println(" " + cnt++);
		}
		System.out.println(" ");
	}
	
}
}