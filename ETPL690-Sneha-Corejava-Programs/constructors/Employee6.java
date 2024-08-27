package com.evergent.corejava.constructors;

class MyEmployee{
	int eno;
	public MyEmployee() {
		
	}
	MyEmployee(int eno){
		this.eno=eno;
		System.out.println("Employee no super class:"+eno );
	}
}
public class Employee6 extends MyEmployee {
	int eno;
	String name;
	double sal;
	Employee6(){
		System.out.println("Default constructor");
	}
	Employee6(int eno,String name,double sal){
		super(eno);
		this.name=name;
		this.sal=sal;
	}
	public void display() {
		System.out.println("Employee eno:"+eno);
		System.out.println("Employee name:"+name);
		System.out.println("Employee sal:"+sal);
	}
	public static void main(String args[]) {
		new Employee6();
		Employee6 emp3=new Employee6(232,"Sneha",444);
		emp3.display();
		
	}

}
