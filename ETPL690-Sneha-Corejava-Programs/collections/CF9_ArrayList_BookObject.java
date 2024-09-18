package com.evergent.corejava.collections;

import java.util.*;
class Book{
	String name;
	public Book(String name) {
		this.name=name;
	}

public String toString() {
	return name;
}
}
public class CF9_ArrayList_BookObject {
	public static void main(String args[]) {
		Book b1=new Book("Core Java");
		Book b2=new Book("Core Java");
		Book b3=new Book("Core Java");
		Book b4=new Book("Core Java");
		ArrayList mylist=new ArrayList();
		mylist.add(b1);
		mylist.add(b2);
		mylist.add(b3);
		mylist.add(b4);
		System.out.println(mylist);	
	}
}

