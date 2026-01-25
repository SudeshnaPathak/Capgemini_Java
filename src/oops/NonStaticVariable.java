package oops;

class Demo{
	int a = 10;
	
	public static void m1()
	{
		Demo d = new Demo();
		System.out.println(d.a);
	}
	
	public void m2()
	{
		System.out.println(a);
	}
	
}
public class NonStaticVariable {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.m2();
		System.out.println(d1.a);
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		
		//Non static variables share different memory blocks
		d1.a = 20;
		d2.a = 50;
		System.out.println(d1.a);
		System.out.println(d2.a);
		System.out.println(d3.a);
	}

}
