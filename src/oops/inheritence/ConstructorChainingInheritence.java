package oops.inheritence;


class N{
	
	N(){
		System.out.println("Parent");
	}
	N(int a)
	{
		System.out.println("Parent");
	}
}

class M extends N{
	
	M(){
		this(10);
		System.out.println("1st");
	}
	
	M(int a)
	{
		this(true);
		System.out.println("2nd");
	}
	
	M(boolean b)
	{
		this(10.25);
		System.out.println("3rd");

	}
	
	M(double d)
	{
		//super(); In the absence of this(), constructor will call super() without arguments by default
		super(0);
		System.out.println("4th");
	}
	
}
public class ConstructorChainingInheritence {

	public static void main(String[] args) {
		M m = new M();
	}

}
