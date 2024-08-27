package com.evergent.corejava.oops;

public class Overloading {
	public void loginDetails() {
		System.out.println("login details");
	}
	public void loginDetails(String Username,String pass) {
		System.out.println("Username"+Username);
		System.out.println("Password"+pass);
	}
	public void loginDetails(String Uname,String pass,String captcha) {
		System.out.println("Username"+Uname);
		System.out.println("Password"+pass);
		System.out.println("captcha"+captcha);
	}
	public int loginDetails(int mobile,String pass) {
		System.out.println("mobile"+mobile);
		System.out.println("Password"+pass);
		return 0;
	}
	public void show() {
		System.out.println("Method");
	}
	public static void main(String args[]) {
		Overloading Ulogin=new Overloading();
		Ulogin.loginDetails("Sneha","sneha123");
		Ulogin.loginDetails("Sneha","sneha123","asd");
		Ulogin.loginDetails(111111,"sneha123");
		
	}

}
