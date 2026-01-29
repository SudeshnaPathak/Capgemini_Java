package designPatterns;

class Iphone{
	//private constructor --> To stop others from accessing the constructor
	private Iphone() {
		
	}
	
	//static factory method/helper method
	public static Iphone getObject()
	{
		//VERIFICATION LOGIC
		return new Iphone();
	}
}
public class FactoryDesignPattern {

	public static void main(String[] args) {
		Iphone i1 = Iphone.getObject();
		System.out.println(i1);
		Iphone i2 = Iphone.getObject();
		System.out.println(i2);
		
		System.out.println(i1 == i2); //false : Factory method generates new object each time
		
		//Not allowed as Constructor is private
		//Iphone i2 = new Iphone();
		//System.out.println(i2);
	}

}
