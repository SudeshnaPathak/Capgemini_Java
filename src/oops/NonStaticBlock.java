package oops;

public class NonStaticBlock {
	NonStaticBlock()
	{
		System.out.println("Constructor");
	}
	
	{
		System.out.println("Non Static Block");
	}
	
//	public static void main(String[] args) {
//		System.out.println("Main Method");
//		NonStaticBlock b = new NonStaticBlock();
//	}
//	
//	O/P : Main Method
//	Non Static Block
//	Constructor
	
	public void main(String[] args) {
		System.out.println("Main Method");
		NonStaticBlock b = new NonStaticBlock(); //For Every Object Creation Non static block is always executed before constructor
	}
	
//	O/P:Non Static Block
//	Constructor
//	Main Method
//	Non Static Block
//	Constructor

}
