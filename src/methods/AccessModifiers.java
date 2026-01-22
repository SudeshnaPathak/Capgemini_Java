package methods;

public class AccessModifiers {
	
	//PUBLIC SCOPE
	public static void m1() {
		System.out.println("hii from m1");
	}
	
	//DEFAULT SCOPE
	static void m2() {
		System.out.println("hii from m2");
	}
	
	//PROTECTED SCOPE
	protected static void m3() {
		System.out.println("hii from m3");
	}
	
	private static void m4() {
		System.out.println("hii from m4");
	}
	
	public static void main(String[] args) {
		m1(); //PUBLIC : accessible everywhere
		m2(); //DEFAULT : only accessible inside same package
		m3(); //PROTECTED : accessible inside same package and child class of different package
		m4(); //PRIVATE : only accessible inside same class
		
		return;
//		return 10; //VOID Methods cannot return a value , not even NULL
	}

}
