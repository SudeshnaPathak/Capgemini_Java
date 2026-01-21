package loops;

import java.util.Scanner;
public class GreatestOfMultipleNumbers {

	public static void main(String[] args) {
		
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter -1 to Discontinue");
		int maxi = Integer.MIN_VALUE;
		while(true)
		{
			System.out.println("Enter:");
			n = sc.nextInt();
			if(n == -1) break;
			maxi = (n > maxi) ? n : maxi;
		}
		System.out.println(maxi);
	}

}
