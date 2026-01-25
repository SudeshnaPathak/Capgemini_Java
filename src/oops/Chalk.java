package oops;

class Chalk1{
	String brand;
	int length;
	String color;
	static final float width = 10; //Constant value inside class static area
	static double price = 20.0;
	//non parameterized constructor ---> STATIC INITIALIZATION
	//	Chalk1(){
	//		brand = "Camels";
	//		length = 10;
	//		color = "White";
	//	}
	
	//parameterized constructor ---> ALLOWS DYNAMIC INITIALIZATION
	//NOT INDUSTRY STANDARD , FORMAL ARGUMENTS & GLOBAL VARIABLES SHOULD HAVE SAME NAME CONVENTIONALLY ---> Hence we need this keyword
	//	Chalk1(String b , int l , String c)
	//	{
	//		brand = b;
	//		length = l;
	//		color = c;
	//	}
	
	//CONSTRUCTOR OVERLOADING
	protected Chalk1(){
		return; //We can use return statement inside constructor, although no specific need
	}
	
	Chalk1(String brand)
	{
		this.brand = brand; 
	}
	
	Chalk1(String brand , String color)
	{
		this.brand = brand;
		this.color = color;
		this.price = 15; // STATIC variables can be re-initialized inside a constructor
//		this.width = 5; //FINAL variables cannot be re-initialized
		return;
	}
	
	Chalk1(String brand , int length)
	{
		this.brand = brand;
		this.length = length;
	}
	
	//DIFFERENT ORDER 
	Chalk1(int length , String color)
	{		
		this.length = length;
		this.color = color;
	}
	
	Chalk1(String brand , int length , String color)
	{
//		brand = brand; NO EFFECT: LOCAL = LOCAL --> Hence we need this
		this.brand = brand;
		this.length = length;
		this.color = color;
	}
	
}
public class Chalk {

	public static void main(String[] args) {
		 Chalk1 c1 = new Chalk1(); 
		 System.out.println(c1); //String generated Address of Memory allocated in Heap Block
		 System.out.println(c1.brand);
		 System.out.println(c1.color);
		 
		 Chalk1 c2 = new Chalk1();
		 System.out.println(c2); //Each time we use a new keyword, a new object space is allocated in heap
		 
		 Chalk1 c3 = new Chalk1("Camels" , 15 , "yellow"); 
		 Chalk1 c4 = new Chalk1("Doms" , 12 , "Green");
		 System.out.println(c3.brand); 
		 System.out.println(c4.color); 
		 
		 Chalk1 c5 = new Chalk1("Camels" , 15);
		 System.out.println(c5.length);
	
		 Chalk1 c6 = new Chalk1(30 , "pink");
		 System.out.println(c6.color);
		 System.out.println(c6.width);
		 System.out.println(c6.price);
		 
		 Chalk1 c7 = new Chalk1("Apsara" , "blue");
		 System.out.println(c7.price);
		 System.out.println(c6.price);
		 
//		 We can re-initialize static variable inside a constructor, However, using final static which
//		 prevents re-initialization by assigning a shared memory for all objects
//		 inside static pool
	}

}
