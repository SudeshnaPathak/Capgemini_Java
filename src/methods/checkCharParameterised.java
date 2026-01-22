package methods;

public class checkCharParameterised {
	
	public static String checkCharacter(char userInput)
	{
		//MULTIPLE RETURN STATEMENTS BUT IN DIFFERENT BLOCKS
		if(userInput >= 'A' && userInput <= 'Z') return "UPPER CASE";
		else if(userInput >= 'a' && userInput <= 'z') return "LOWER CASE";
		else if(userInput >= '0' && userInput <= '9') return "NUMBER";
		else return "SPECIAL";
	}
	
	public static void main(String[] args) {
		String result = checkCharacter('a'); //BEST PRACTISE
		System.out.println("The Character is:" + result);
	}

}
