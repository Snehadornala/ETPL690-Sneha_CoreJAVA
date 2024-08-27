package com.evergent.corejava.final1;

public class finalDemo1 {
	final String cname="India";
	public void Mydata() {
		System.out.println(cname);
	}
	public static void main(String args[]) {
		finalDemo1 fd=new finalDemo1();
		fd.Mydata();
	}
}
