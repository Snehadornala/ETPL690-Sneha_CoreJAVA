package com.evergent.corejava.oops;

public class MethodFlow {
	public void Show() {
		System.out.println("No parameter no return type");
	}
	public void Mydata(int a,int b) {
		System.out.println(a+b);
	}
	public int Mymul(int a,int b) {
		return a*b;
	}
	public int Mychange() {
		return 100;
	}
	public static void main(String args[]) {
		MethodFlow mf=new MethodFlow();
		mf.Show();
		mf.Mydata(10,20);
		int k=mf.Mymul(5,5);
		System.out.println(k);
		int t=mf.Mychange();
		System.out.println(t);
	}
}
