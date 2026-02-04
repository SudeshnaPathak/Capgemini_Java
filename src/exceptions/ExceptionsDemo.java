package exceptions;

//checked
class StringVariableIsNullException1 extends Exception{
	public StringVariableIsNullException1(String msg)
	{
		super(msg);
	}
}

//unchecked
class StringVariableIsNullException2 extends RuntimeException{
	public StringVariableIsNullException2(String msg)
	{
		super(msg);
	}
	
	@Override
	public String getMessage()
	{
		return "The String Variable is Null";
	}
	
}
public class ExceptionsDemo {

	public static void main(String[] args) {
		String s = null;
		if(s == null)
			throw new StringVariableIsNullException2("The String Variable is Null");
	}

}
//we use throws keyword to throw checked exceptions
//unchecked exception can be thrown w/o throws
//When we extend Exception ---> Checked Exception
//When we extend RuntimeException ---> Unchecked Exception
