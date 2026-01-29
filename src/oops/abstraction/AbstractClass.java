package oops.abstraction;

//Either default or public access modifier ~ Similar to access modifiers of any normal outer class
abstract class Car extends Object{
	
	//abstract method
	public abstract void engine();
	public abstract void seats();
	
	//NOT ALLOWED
	//private abstract void engine();
	//public static abstract void engine();
	//public final abstract void engine();

}

abstract class Mechanic extends Car{
	//inherits 2 abstract methods
	@Override
	public void engine()
	{
		System.out.println("From mechanic");
	}
	
}

class Showroom extends Mechanic{
	//inherits 1 abstract method and 1 concrete method
	@Override
	public void seats()
	{
		System.out.println("Seats added by Mechanic");
	}
}

class Customer extends Showroom{
	//inherits 2 concrete methods
}

//Default or public access modifier
class AbstractClass {

	public static void main(String[] args) {
        //Car c = new Car(); cannot instantiate abstract class
		//By Default, All classes are child of superior parent class -> Object Class, and they inherit the concrete methods of object class.
		//Hence 100% abstraction is not possible with Abstract class.
		Customer c = new Customer();
		c.engine(); //COMPILE TIME BINDING: According to compiler parent engine method is getting invoked, According to JVM child engine method is getting executed
	}

}
