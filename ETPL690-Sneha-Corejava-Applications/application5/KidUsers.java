package com.evergent.corejava.sneha.application5;

class AgedNotFound extends Exception
{
	public AgedNotFound(String msg)
	{
		System.out.println(msg);
	}
}
class BookNotFound extends Exception
{
	public BookNotFound(String msg)
	{
		System.out.println(msg);
	}
}

public class KidUsers implements LibraryUser
{
	int age;
	String bookType;
	
	public void registerAccount(int age) throws AgedNotFound
	{
		if(age<12)
		{
			System.out.println("You have successfully registered under a Kids Account");
		}
		else
		{
			throw new AgedNotFound("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	public void requestBook(String btype) throws BookNotFound
	{
		if(btype.equals("Kids"))
		{
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else
		{
			throw new BookNotFound("Oops, you are allowed to take only kids books");
		}
	}
	

}