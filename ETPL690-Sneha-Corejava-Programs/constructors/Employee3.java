package com.evergent.corejava.constructors;

public class Employee3 {
	int eno;
	String ename;
	double sal;
	Employee3(){
		System.out.println("Default constructor");
	}
	Employee3(int eno,String ename,double sal){
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
	}
 public void display() {
	
		System.out.println("emp eno:"+eno);
		System.out.println("emp name:"+ename);
		System.out.println("emp sal:"+sal);
		
	}
public static void main(String args[]) {
		new Employee3();
		Employee3 emp3=new Employee3(123,"Sneha",50000);
		emp3.display();
	}

}
