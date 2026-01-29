package designPatterns;

class Android{
	static Android a; //Static object variable
	
	//private constructor
	private Android() {}	
	
	//static helper/factory method
	public static Android getObject()
	{
		if(a == null)
		{
			a = new Android();
			return a;
		}
		return a;
	}
}

public class SingletonDesignPattern {

	public static void main(String[] args) {
		Android a1 = Android.getObject();
		System.out.println(a1);
		Android a2 = Android.getObject();
		System.out.println(a2);
		System.out.println(a1 == a2);//True : SingletonDesignPattern generates only one object
	}

}
