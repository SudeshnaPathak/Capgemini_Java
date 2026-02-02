package oops;

class Outer{
	
	public void p()
	{
		System.out.println("Hello from Outer class");
	}
	
	class Inner1{
		public void m1()
		{
			System.out.println("Hello from Non Static Inner Class");
		}
	}
	
	static class Inner2{
		public void m1()
		{
			System.out.println("Hello from Static Inner Class");
		}
	}
}
public class NestedClass {

	public static void main(String[] args) {
		//Outer class
		Outer o = new Outer();
		o.p();
		
		//Nested non static class
		Outer.Inner1 o1 = new Outer().new Inner1();
		o1.m1();
		
		//Nested Static class
		Outer.Inner2 o2 = new Outer.Inner2();
		o2.m1();
	}

}
