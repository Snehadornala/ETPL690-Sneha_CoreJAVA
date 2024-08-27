package com.evergent.corejava.exceptionhandling;

 class ProductNotFoundException extends Exception

{

	public ProductNotFoundException(String message) { 

	System.out.println("Hello:"+message);

	}

}

public class ProductImpl9{

	int pno=105;

	public void myData() throws ProductNotFoundException

	{

		if(pno>100)

			throw new ProductNotFoundException("This product not there....");

		else

			System.out.println("Product is there");

		}

	public static void main(String[] args) {

		try {

			ProductImpl9 product1=new ProductImpl9();

			product1.myData();

		}

		catch(Exception e)

		{

			System.out.println("I can handle:"+e);

		}



	}



}



