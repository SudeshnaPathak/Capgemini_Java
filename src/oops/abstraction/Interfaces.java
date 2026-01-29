package oops.abstraction;

interface Car1{
	//Internally: public static final 
	int a = 10;
	public static final int b = 20;
	
	//By Default: public abstract
    //void engine() {} -> Body not possible
	
	void accelerator();
	abstract public void engine();
}

class Mechanic1 implements Car1{
	
	@Override
	public void engine()
	{
		System.out.println("Engine Repaired");
	}
	
	public void accelerator()
	{
		System.out.println("Brakes fail");
	}
}

public class Interfaces {

	public static void main(String[] args) {
		Car1 c = new Mechanic1();
		c.accelerator();
		c.engine();
	}

}
