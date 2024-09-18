package com.evergent.corejava.studentapplication;

import java.util.Scanner;

public class MainController {



		public static void main(String[] args) {

			int StudentId=0;

			String name="";

			float marks=0;

			

			Scanner sin=new Scanner(System.in);

			

			System.out.println("Enter Student ID");

			StudentId=sin.nextInt();

			System.out.println(("Enter Student Name"));

			name = sin.next();

			System.out.println("Enter Student Marks");

			marks = sin.nextFloat();

			

			StudentService StudentService = new StudentService();

			

			int updeateCount=StudentService.addStudentService(StudentId,name,marks);

			

			

			//last

			  System.out.println("Inserted :"+updeateCount+" record Successful");
			

		}
		
}