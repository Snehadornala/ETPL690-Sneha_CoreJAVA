package com.evergent.corejava.studentapplication;

import java.io.Serializable;



public class StudentBean implements Serializable {

	private int studentId;

	private String name;

	private float marks;

	private String grade;

	public int getStudentId() {

		return studentId;

	}

	public void setStudentId(int studentId) {

		this.studentId = studentId;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public float getMarks() {

		return marks;

	}

	public void setMarks(float marks) {

		this.marks = marks;

	}

	public String getGrade() {

		return grade;

	}

	public void setGrade(String grade) {

		this.grade = grade;

	}	

}
