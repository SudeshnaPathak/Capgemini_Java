package swebatch;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		int temp = n;
		int c = 0, sum = 0, p = 1 , rev = 0;
		while(n > 0)
		{
			int r = n % 10;
			c++;
			sum += r;
			p *= r;
			rev = rev*10 + r;
			n = n/10;
		}
		System.out.println("No of digits: " + c);
		System.out.println("Sum of digits: " + sum);
		System.out.println("Product of digits: " + p);
		System.out.println("Reverse: " + rev);
		
		n = temp;
		System.out.print("Factors of " + n + ":");
		for(int i = 1 ; i*i <= n ; i++)
		{
			if(n % i == 0)
			{
				System.out.print(i + " ");
				if(i != n/i) System.out.print(n/i + " ");
			}
		}
		
		System.out.println();
		
		n = temp;
		long fact = 1;
		for(int i = 1 ; i <= n ; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial: " + fact);
		
		

	}

}
