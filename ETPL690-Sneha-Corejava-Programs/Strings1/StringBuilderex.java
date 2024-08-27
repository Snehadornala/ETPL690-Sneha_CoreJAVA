package com.evergent.corejava.Strings1;

public class StringBuilderex {
	public static void main(String args[]) {
		StringBuilder sb=new StringBuilder("Hello");
		System.out.println("intial string:"+sb);
		sb.append(" World");
		System.out.println("after append:"+sb);
		sb.insert(6, "Beautiful");
		System.out.println("after insert:"+sb);
		sb.replace(0, 5,"Hi");
		System.out.println("after replace:"+sb);
		sb.delete(0, 3);
		System.out.println("after delete:"+sb);
		sb.reverse();
		System.out.println("after reverse:"+sb);
		System.out.println("capacity:"+sb.capacity());
		System.out.println("length:"+sb.length());

}
}