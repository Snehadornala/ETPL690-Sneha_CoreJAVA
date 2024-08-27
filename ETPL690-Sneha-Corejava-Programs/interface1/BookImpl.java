package com.evergent.corejava.interface1;

public class BookImpl implements Book{
	public void bookTitle() {
		System.out.println("Corejava"+cname);
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
	public static void main(String args[]) {
		BookImpl book1=new BookImpl();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookprice();
		book1.show();
	}
}
