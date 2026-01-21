package swebatch;

public class LeapYear {
	
	public static boolean isLeapYear(int y)
	{
		return(((y % 4 == 0) || (y % 400 == 0) && (y % 100 != 0)) ? true : false);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y = 2004;
		System.out.println(isLeapYear(y) ? "LEAP YEAR" : "NON LEAP YEAR");
	}

}
