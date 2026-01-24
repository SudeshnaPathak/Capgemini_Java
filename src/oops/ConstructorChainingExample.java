package oops;

class Chalk2{
	
	Chalk2(){
		this(10);
		System.out.println("First");
	}
	
	Chalk2(int a){
		this(10 , 20);
		System.out.println("Second");
	}
	
	Chalk2(int a , int b)
	{
		this(true);
		System.out.println("Third");
	}
	
	Chalk2(boolean b)
	{
		System.out.println("Forth");
	}
}
public class ConstructorChainingExample{

	public static void main(String[] args) {
		Chalk2 c1 = new Chalk2(); //Follows STACK TRACE
	}

}
