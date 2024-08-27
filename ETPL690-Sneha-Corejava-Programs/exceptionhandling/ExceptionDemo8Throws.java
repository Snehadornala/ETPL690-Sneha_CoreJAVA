package com.evergent.corejava.exceptionhandling;
//throws an exception will execute method by method 
public class ExceptionDemo8Throws {


		String name="null";

		public void myData() throws NullPointerException{

			System.out.println("one");

			System.out.println(name.length());

			System.out.println("end");

		}



		public void myInfo() throws NullPointerException {

			myData();

			System.out.println("myInfomethod");

		}

		public static void main(String[] args) {

			try {

				ExceptionDemo8Throws ed2=new ExceptionDemo8Throws();

				ed2.myInfo();

			}

			catch(Exception e)

			{

				System.out.println("I can handle:"+e);

			}

		

			// TODO Auto-generated method stub



		}



	}



	