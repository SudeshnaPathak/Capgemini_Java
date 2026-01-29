package oops.polymorphism;

class Parent1{
	
	public void bike()
	{
		System.out.println("Splendor");
	}
	
	void shaadi()
	{
		System.out.println("Sheela");
	}
	
	//OVERLOADING
	public static void shaadi(int a)
	{
		System.out.println("Shilpa");
	}
	
	protected void shaadi(boolean b)
	{
		System.out.println("Yasmin");
	}
	
	Object shaadi(char ch) {
		System.out.println("Meena");
		return "Meena";
	}
	
	//Static method for shadowing
	public static void m1()
	{
		System.out.println("Hello from m1 in Parent");
	}
	
}

class Child extends Parent1{
	
	//OVERRIDING - @Overrride is not compulsory
	public void bike() {
		System.out.println("Pulser");
	}
	
	//Applicable both in case of shadowing & Overriding(Child class access modifier can be different)
	//We can use PUBLIC , PROTECTED , DEFAULT >= DEFAULT scope of parent shaadi method
	//Child class access modifier must have same or higher scope than parent class access modifier of overridden method
	@Override         //-------Also overloading w.r.t other shaadi methods
	public void shaadi()
	{
		System.out.println("Leela");
	}
	
	//Applicable both in case of shadowing & Overriding(Child class return type can be different)
	//Child class return type can be different, but parent class return type >= child class return type of the overridden method.
	String shaadi(char ch)
	{
		System.out.println("Shreya");
		return "Shreya";
	}
	
	//SHADOWING
	public static void m1()
	{
		System.out.println("Hello from m1 in Child");
	}
}

public class MethodOveriding_Overloading_Shadowing {

	public static void main(String[] args) {
		Parent1 p = new Parent1();
		
		p.shaadi(); //Sheela
		p.shaadi(true); //Yasmin
		p.shaadi('a'); //Shilpa
		
		Child c = new Child();
		//PRIORITY 1st GIVEN To Same Class
		c.shaadi(); //Leela
		c.m1(); //Hello from m1 in Child
		c.bike();//pulser
		
		c.shaadi('a'); //Shilpa
		c.shaadi(true); //Yasmin
		
		//Method Overiding->Dynamic Method Dispatch
		//Compiler performs Compile Time Binding to Parent class
		//JVM performs Run Time binding to Child class
		Parent1 p1 = new Child();
		p1.shaadi(); //Leela ---> RUN TIME POLYMORPHISM(Overriding non static methods)
		p1.m1(); //Hello from m1 in Parent -->COMPILE TIME POLYMORPHISM(Shadowing static methods)
		p1.bike();//Pulser ---> RUN TIME POLYMORPHISM(Overriding non static methods)
		
		Child c1 = (Child)p1;
		c1.shaadi(); //Leela
		
		//COMPILE TIME POLYMORPHISM --> Method Overloading, Method Shadowing
		//RUN TIME POLYMORPHISM
	}

}
