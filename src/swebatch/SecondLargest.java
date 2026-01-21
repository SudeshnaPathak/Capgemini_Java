package swebatch;

import java.util.Scanner;
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers: ");
		int n = sc.nextInt();
		int largest = Integer.MIN_VALUE;
		int secondLargest = largest;
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Enter");
			int m = sc.nextInt();
			if(m > largest)
			{
				secondLargest = largest;
				largest = m;
			}
			else if(m > secondLargest && m < largest) secondLargest = m;
		}
		System.out.println("Largest: " + largest);
		System.out.println("Second Largest: " + secondLargest);
	}

}
