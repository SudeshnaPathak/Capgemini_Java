package customExceptions;

//Check for runtime exception
public class AgeMisMatchException extends Exception{
	public AgeMisMatchException(String msg)
	{
		super(msg);
	}
	
	@Override
	public String toString() //Over writes the message
	{
		return "InEligible to vote";
	}
}
