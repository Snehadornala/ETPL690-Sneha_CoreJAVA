package com.evergent.corejava.interface1;

public class BookImpl3 implements Book,NewBook{
	public void bookTitle() {
		System.out.println("Corejava :" +cname);
	}
	public void bookAuthor() {
		System.out.println("oracle crop");
		
	}
	public void bookprice() {
		System.out.println("Rs.550");
		
	}
	public void show() {
		System.out.println("loacl method");
	}
	public void addNewBook() {
		System.out.println("Java new version");
	}
	public void MyDataInfo(){
	System.out.println("My data interface");
	}
	public static void main(String args[]) {
		BookImpl3 b2=new BookImpl3();
		b2.bookTitle();
		b2.bookAuthor();
		b2.bookprice();
		b2.show();
		b2.addNewBook();
		b2.MyDataInfo();

}
}
