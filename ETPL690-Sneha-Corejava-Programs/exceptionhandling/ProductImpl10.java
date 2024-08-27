package com.evergent.corejava.exceptionhandling;

class 	AgeNotsupportException extends Exception

{

	public AgeNotsupportException(String message) { 

	System.out.println("Hello:"+message);

	}

}

public class ProductImpl10{

	int age=18;

	public void myData() throws  AgeNotsupportException

	{

		if(age>=18)

			throw new AgeNotsupportException("Eligible for vote");

		else

			System.out.println("Not Eligible for vote ");

		}

	public static void main(String[] args) {

		try {

			ProductImpl10 product1=new ProductImpl10();

			product1.myData();

		}

		catch(Exception e)

		{

			System.out.println("I can handle:"+e);

		}



	}



}