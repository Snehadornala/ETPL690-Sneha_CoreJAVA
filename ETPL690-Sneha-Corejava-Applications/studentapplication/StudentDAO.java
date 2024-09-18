package com.evergent.corejava.studentapplication;

import java.util.ArrayList;

public class StudentDAO {

		public int addStudent(StudentBean StudentBean)

		{

			try{

				ArrayList studentList=new ArrayList();

				studentList.add(StudentBean.getStudentId());

				studentList.add(StudentBean.getName());

				studentList.add(StudentBean.getMarks());

				studentList.add(StudentBean.getGrade());	

				

				System.out.println(studentList);

				

				System.out.println("Student ID :"+StudentBean.getStudentId());

				System.out.println("Student Name :"+StudentBean.getName());

				System.out.println("Student Marks :"+StudentBean.getMarks());

				System.out.println("Student Grade :"+StudentBean.getGrade());

				

				return 1;

			}

			catch(Exception e)

			{

				System.out.println(e);

				return 0;

			}

		}



	}