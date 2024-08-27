package com.evergent.corejava.exceptionhandling;

public class ArrayIndexOutofException13 {



	public static void main(String[] args) {

		int [] number= {1,2,3,4,5};

		try {

			System.out.println("Accessing element at index 10:"+number[10]);

		}

		catch(ArrayIndexOutOfBoundsException e)

		{

			System.out.println("caught an ArrayIndexOutofException:"+e);

			System.out.println("error:"+e.getMessage());

			

		}

		System.out.println("Program continues after handling");



	}



}