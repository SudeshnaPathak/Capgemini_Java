package oops;

class Chalk3{
	String brand;
	int length;
	String color;
	
	Chalk3(){
		this("Camels");
	}
	
	Chalk3(String brand)
	{
		this(brand , "white");
		this.brand = brand;
		System.out.println(this); //The object used to call the specific block will be the latest reference value inside this keyword.

	}
	
	Chalk3(String brand , String color)
	{
		this(brand , 10 , color);
		this.brand = brand;
		this.color = color;
		System.out.println(this);

	}
	
	Chalk3(String brand , int length)
	{
		this(brand , length , "white");
		this.brand = brand;
		this.length = length;
		System.out.println(this);

	}
	
	Chalk3(int length , String color)
	{
		this("Camels" , length , color);
		this.color = color;
		this.length = length;
		System.out.println(this);

	}
	
	Chalk3(String brand , int length , String color)
	{
		//In Java: All constructors cannot have this(), infinite recursion
		this.brand = brand;
		this.length = length;
		this.color = color;
		System.out.println(this);
	}
	
}
public class ContructorChainingPractical {

	public static void main(String[] args) {
		 Chalk3 c1 = new Chalk3(); 
		 System.out.println(c1.brand);
		 System.out.println(c1.length);
		 System.out.println(c1.color);
	
		 Chalk3 c2 = new Chalk3("Apsara"); 
		 System.out.println(c2.brand);
		 System.out.println(c2.length);
		 System.out.println(c2.color);
		 
		 Chalk3 c3 = new Chalk3("Doms" , "pink"); 
		 System.out.println(c3.brand);
		 System.out.println(c3.length);
		 System.out.println(c3.color);
		 
		 Chalk3 c4 = new Chalk3("Doms" , 18 ,  "yellow"); 
		 System.out.println(c4.brand);
		 System.out.println(c4.length);
		 System.out.println(c4.color);
	}

}

