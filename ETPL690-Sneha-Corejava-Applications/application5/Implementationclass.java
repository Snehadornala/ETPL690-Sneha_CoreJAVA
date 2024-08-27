package com.evergent.corejava.sneha.application5;

public class Implementationclass {

	public static void main(String[] args) throws AgedNotFound, BookNotFound, AdNotFoundException1, BnFound1  {
		// TODO Auto-generated method stub
		KidUsers ku=new KidUsers();
		try
		{
		ku.registerAccount(10);
		}
		catch(AgedNotFound e)
		{
			e.printStackTrace();
		}
		try
		{
		ku.registerAccount(20);
		}
		catch(AgedNotFound e)
		{
			e.printStackTrace();
			
		}
		try
		{
			ku.requestBook("Kids");
		}
		catch(BookNotFound e)
		{
			e.printStackTrace();
		}
		try
		{
		ku.requestBook("Fiction");
		
		}
		catch(BookNotFound e)
		{
			e.printStackTrace();
		}
		AdultUser au=new AdultUser();
		try
		{
		au.registerAccount(5);
		}
		catch( AdNotFoundException1 e)
		{
			e.printStackTrace();
		}
		try
		{
		au.registerAccount(23);
		}
		catch( AdNotFoundException1 e)
		{
			e.printStackTrace();
		}
		try
		{
		au.requestBook("Kids");
		}
		catch(BnFound1 e)
		{
			e.printStackTrace();
		}
		try
		{
		
		au.requestBook("Fiction");
		}
		catch(BnFound1 e)
		{
			e.printStackTrace();
		}
	}
}
		
		
	
		
		
		
		
		
		
		
