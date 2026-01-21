package swebatch;

public class DaysOfMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Days of Month : In order to print days of feb check where year is laep year or not 
		int y = 2004;
		int month = 2;
		
		switch(month)
		{
		case 1 : System.out.println("31");
		break;
		case 2 :
			{
				System.out.println((LeapYear.isLeapYear(y) ? "29" : "28"));
			}
		break;
		case 3 : System.out.println("31");
		break;
		case 4 : System.out.println("30");
		break;
		case 5 : System.out.println("31");
		break;
		case 6 : System.out.println("30");
		break;
		case 7 : System.out.println("31");
		break;
		case 8 : System.out.println("31");
		break;
		case 9 : System.out.println("30");
		break;
		case 10 : System.out.println("31");
		break;
		case 11 : System.out.println("30");
		break;
		case 12 : System.out.println("31");
		break;
		default : System.out.println("Invalid");
		}

	}

}
