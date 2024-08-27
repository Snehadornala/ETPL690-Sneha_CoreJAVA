package com.evergent.corejava.exceptionhandling;

class InsufficientFundsException(String message) {
	super(message);
}
public class UserDefinedExceptionDemo11 {
	public static void withdraw(double amount) throws InsufficientFundsException {
		double balance=500.00;
		if(amount>balance) {
			throw new InsufficientFundsException("InsufficienrFunds");
		}
		else {
			System.out.println("withdraw successful");
		}
		
	}
	public static void main(String args[]) {
		try {
			withdraw(600.00);
		}
		catch(InsufficientFundsException e) {
			System.out.println()
		}
	}

}
