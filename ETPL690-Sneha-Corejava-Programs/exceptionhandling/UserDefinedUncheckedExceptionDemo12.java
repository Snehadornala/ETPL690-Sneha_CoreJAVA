package com.evergent.corejava.exceptionhandling;

	class InvalidScoreException extends RuntimeException{

		public InvalidScoreException (String message){

			super(message);

		}}

		public class UserDefinedUncheckedExceptionDemo12 {

		public static  void validscore(int score) { 

			if(score<0 || score>100) {

				throw new InvalidScoreException("Score must be between 0 and 100");

			}

			else

			{

				System.out.println("Score is valid");

			}

		}

	public static void main(String[] args) 

	{

		try

		{

				validscore (110);

		}

		catch(InvalidScoreException e) {

			System.out.println("caught the exception:"+e.getMessage());

			System.out.println(e);

			

		}

		System.out.println("program continuess after handling the exception");

	}

	}




