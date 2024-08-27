package com.evergent.corejava.sneha.application5;

class AdNotFoundException1 extends Exception
{
	AdNotFoundException1(String msg)
	{
	   System.out.println("Sorry, Age must be greater than 12 to register as an adult");
	}
}
class BnFound1 extends Exception
{
	BnFound1(String msg)
	{
		System.out.println(msg);
	}
}

public class AdultUser implements LibraryUser
{

	@Override
	public void registerAccount(int age) throws AdNotFoundException1 {
		// TODO Auto-generated method stub
		if(age>12)
		{
			System.out.println("You have successfully registered under an Adult Account");
		}
		else
		{
			throw new AdNotFoundException1("Sorry, Age must be greater than 12 to register as an adult");
		}
		
	}

	@Override
	public void requestBook(String btype) throws BnFound1 {
		// TODO Auto-generated method stub
		if(btype.equals("Fiction"))
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else
		{
			throw new BnFound1("Oops, you are allowed to take only adult Fiction books");
		}
		
	}
	

}