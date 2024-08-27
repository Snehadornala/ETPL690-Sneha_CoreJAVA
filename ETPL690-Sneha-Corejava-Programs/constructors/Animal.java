package com.evergent.corejava.constructors;

class Animall {
	private String name;
	private int age;
  Animall(String name,int age) {
	this.name=name;
	this.age=age;
 }
	public void displayInfo(){
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}	
 }
 class Dog extends Animall{
    private String breed;
	public Dog(String name, int age,String breed) {
		super(name, age);
		this.breed=breed;
	}
	public void displayInfo(){
		super.displayInfo();
		System.out.println("Breed:"+breed);
	}
	
}
public class Animal{
	public static void main(String args[]) {
      Dog dog=new Dog("bruno",11,"pug");
      dog.displayInfo();
      

	}

}