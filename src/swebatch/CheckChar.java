package swebatch;

public class CheckChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		if(ch >= 65 && ch <= 90) System.out.println("UPPER CASE LETTER");
		else if(ch >= 97 && ch <= 122) System.out.println("LOWER CASE CHARACTER");
		else if(ch >= '0' && ch <= '9') System.out.println("NUMBERS");
		else System.out.println("SPECIAL CHARACTER");
	}

}
