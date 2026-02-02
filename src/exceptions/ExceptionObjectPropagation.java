package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionObjectPropagation {

	public static void main(String[] args) {
		try {
			m3();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void m1() throws FileNotFoundException
	{
		System.out.println("read inputs from File");
		FileInputStream fis = new FileInputStream("File");
	}
	public static void m2() throws FileNotFoundException
	{
		m1();
	}
	public static void m3() throws FileNotFoundException
	{
		m2();
	}
	
}

//EXCEPTION OBJECT PROPAGATION:-
//By default, unchecked exceptions are forwarded in the calling chain (propagated).
//By default, checked exceptions are not forwarded in calling chain (propagated). They must be declared in the method signature using the throws keyword.
//An exception occurs in the m1() method, where it is not handled, 
//So it is propagated to the previous m2() method, where it is not handled
//So it is again propagated to the previous m3() method, where it is not handled again 
//Hence, it is finally propagated to main() method, where the exception is handled. 
