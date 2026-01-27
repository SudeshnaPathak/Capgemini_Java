package oops.inheritence;

//Dependent class
class Engine1{
	int cc;
}

//Depending class
class Car1{
	
	//Non static initializer(TIGHT COUPLING)
	Engine1 e = new Engine1();
}


public class Composition {

	public static void main(String[] args) {
		Car1 c = new Car1();
		System.out.println(c.e);
	}

}
