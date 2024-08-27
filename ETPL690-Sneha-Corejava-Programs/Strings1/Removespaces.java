package com.evergent.corejava.Strings1;

public class Removespaces {
	public static void main(String args[]) {
		String str="Hello World,this is a test";
		String noSpaces=str.replace(" ", "");
		System.out.println(noSpaces);
	}

}
