package oops;

class StaticExample{
	static int staticVariable;
	
	//Static variables can be accessed from anywhere within the same class
	public void nonStaticMethod()
	{
		System.out.println(staticVariable);
	}
	
	public static void staticMethod()
	{
		System.out.println(staticVariable);
	}
}
public class StaticVariable {

	public static void main(String[] args) {
		StaticExample s1 = new StaticExample();
		s1.nonStaticMethod(); //NOT recommended to access a static member using an object
		StaticExample.staticMethod();
		StaticExample s2 = new StaticExample();
		StaticExample s3 = new StaticExample();
		System.out.println(StaticExample.staticVariable);
		
		//Share same class static area/static pool area
		System.out.println(s1.staticVariable); 
		System.out.println(s2.staticVariable);
		System.out.println(s3.staticVariable);
		
		s2.staticVariable = 20;
		System.out.println(s1.staticVariable); 
		System.out.println(s2.staticVariable);
		System.out.println(s3.staticVariable);
		
		s3.staticVariable = 30;
		System.out.println(s1.staticVariable); 
		System.out.println(s2.staticVariable);
		System.out.println(s3.staticVariable);
	}

}
