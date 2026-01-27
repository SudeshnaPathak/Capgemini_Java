package oops.inheritence;

class Pa{
	int a = 10;
	int d;
	public void m() {
		System.out.println("Hii");
	}
}

//IsA Relationship
class Ch extends Pa{
	int b = 20;
	
	public void access()
	{
		System.out.println(this.a); //this: Priority to same class variable
		System.out.println(super.a); //super: Priority to immediate parent class variable
//		super.d = 20+30; //We can access using super as well
		d = 20+30; //Code Re-usability
		System.out.println(d);
	}
	
	public void r() {
		System.out.println("Bye");
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		Ch c = new Ch();
		System.out.println(c.a);
		System.out.println(c.b);
		c.m();
		c.access();
		c.r();
	}

}
