package exceptions;

//import java.io.FileInputStream;

public class Libraries {

	public static void main(String[] args) {
		System.out.println("Main Start");
		try {
			System.out.println("Try Start");
			int a = 10/0; //Unchecked Exception
			
			//Control doesn't flow here after 1st Exception
			String s = null; 
			char ch = s.charAt(0); //Unchecked Exception
			System.out.println("Try Ends");
			System.exit(0); //Prevents execution of finally block
		}
		catch(ArithmeticException e) //catch(Throwable e) also works
		{
			System.out.println("Catch Block");
			System.out.println(e); //internally calls toString() : Prints Name + Reason
			e.printStackTrace();  //Prints Name + Details 
			System.out.println(e.getMessage()); //Only prints reason 
		}
		catch(Exception e) //Exception type reference variable which gets executed when none of the prior catch blocks match the exception
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally Block"); //Executed at any cost except for JVM forceful termination using System.exit(0);
		}
		System.out.println("Main Ends");
//		FileInputStream fis = new FileInputStream("kdfdyt"); //Checked Exception : Resource Leak
	}

}
