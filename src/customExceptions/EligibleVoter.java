package customExceptions;
import java.util.Scanner;

public class EligibleVoter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		try {
			check_eligible(age);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		sc.close();
	}
	
	public static void check_eligible(int age) throws AgeMisMatchException{
		if(age < 18) throw new AgeMisMatchException("You are too small to vote");
		else System.out.println("Eligible");
	}

}
