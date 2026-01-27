package oops.polymorphism;

class Parent1{
	public void shaadi()
	{
		System.out.println("Sheela");
	}
}

class Child extends Parent1{
	@Override
	public void shaadi()
	{
		System.out.println("Leela");
	}
}

public class MethodOveriding {

	public static void main(String[] args) {
		Parent1 p = new Parent1();
		p.shaadi(); //Sheela
		Child c = new Child();
		c.shaadi(); //Leela
		
		//Method Overiding->Dynamic Method Dispatch
		//Compiler performs Compile Time Binding to Parent class
		//JVM performs binding during Run Time to Child class
		Parent1 p1 = new Child();
		p1.shaadi(); //Leela
		Child c1 = (Child)p1;
		c1.shaadi(); //Leela
	}

}
