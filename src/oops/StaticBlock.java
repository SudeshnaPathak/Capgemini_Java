package oops;

public class StaticBlock {
	
	//Single Line static initializer
	static int a = 10;
	
	//Multi Line Static initializer
	static {
		System.out.println("Static Block");
	}

	public static void main(String[] args) {
		
		System.out.println("Main Method");
	}

}
