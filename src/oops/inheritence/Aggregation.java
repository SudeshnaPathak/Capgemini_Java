package oops.inheritence;

//Dependent class
class Engine{
	int cc;
}

//Depending class
class Car{
	Engine e;
	
	//Helper Method -> Object of Dependent class will be created only if I call the Helper method.(LOOSE COUPLING)
	public Engine getEngine()
	{
		e = new Engine();
		return e;
	}
}

public class Aggregation {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.e); //NULL
		c.getEngine();
		System.out.println(c.e);
	}

}
