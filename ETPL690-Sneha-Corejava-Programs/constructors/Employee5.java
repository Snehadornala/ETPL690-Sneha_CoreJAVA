package com.evergent.corejava.constructors;

public class Employee5 {
	int eno;
	String name;
	double sal;
	Employee5(){
		System.out.println("default constructor");
	}
	Employee5(int eno){
		this.eno=eno;
	}
	Employee5(int eno,String name,double sal){
		this(eno);
		this.name=name;
		this.sal=sal;
	}
	public void display()
	{
		System.out.println("Employee eno:"+eno);
		System.out.println("Employee name:"+name);
		System.out.println("Employee sal:"+sal);
		
	}
	public static void main(String args[]) {
		new Employee5();
		Employee5 emp2=new Employee5(123,"Sneha",4000);
		emp2.display();
	}

}
