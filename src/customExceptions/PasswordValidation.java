package customExceptions;
import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The password must contain minimum 8 characters, atleast 1 UpperCase Letter,1 LowerCase Letter,1 Special Character, 1 digit and no Space");
		System.out.println("Enter Password: ");
		String password = sc.next();
		try {
			check_password(password);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		sc.close();
	}
	
	public static void check_password(String password) throws InvalidPasswordException
	{
		char p[] = password.toCharArray();
		int uc = 0 , lc = 0 , d = 0 , special = 0 , space = 0;
		for(char c : p)
		{
			if(Character.isUpperCase(c)) uc++;
			else if(Character.isLowerCase(c)) lc++;
			else if(Character.isDigit(c)) d++;
			else if(c == ' ')space++;
			else special++;
		}
		if(password.length() >= 8 && uc >= 1 && lc >= 1 && d >= 1 && space == 0 && special >= 1) System.out.println("Valid Password");
		else throw new InvalidPasswordException("Invalid Password Format.");
	}

}
