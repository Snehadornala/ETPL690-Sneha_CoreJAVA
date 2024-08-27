package com.evergent.corejava.interface1;

public class BookImpl2 implements Book{
	public void bookTitle() {
		System.out.println("Corejava");
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
		Book b2=new BookImpl2();
		b2.bookTitle();
		b2.bookAuthor();
		b2.bookprice();
	//b2.show(); shows only interface methods by interface reference show()is a local method
		//BookImpl2 book1=new BookImpl2();
		//book1.show();
	}
	
	
	
	
	
	
}