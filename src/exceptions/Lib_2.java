package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lib_2 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		try {
			System.out.println("Try Started");
			//No such file named "rft" in CWD : FileNotFoundException(Checked Exception)
			FileInputStream file = new FileInputStream("rft"); //creates a FileInputStream to read raw bytes from a file named "rft" located in the current working directory.
			System.out.println("Try Ends");
		}
		catch(ArithmeticException e)
		{
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			
		}
		//Recommended to have Exception or Throwable type reference variable at the end of multiple catch blocks
		catch(Exception e)
		{
			
		}
		System.out.println("Main Ends");
	}
	

}
