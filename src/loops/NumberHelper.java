package loops;

public class NumberHelper {
	
	public static int countDigits(int n)
	{
		int c = 0;
		while(n > 0)
		{
			c++;
			n /= 10;
		}
		return c;
	}
	
	public static int sumOfDigits(int n)
	{
		int sum = 0;
		while(n > 0)
		{
			sum += (n % 10);
			n /= 10;
		}
		return sum;
	}
	
	public static int sumOfDigitsRaisedToPower(int n , int p)
	{
		int sum = 0;
		while(n > 0)
		{
			sum += Math.pow(n % 10 , p);
			n /= 10;
		}
		return sum;
	}
	
	public static int prodOfDigits(int n)
	{
		int p = 1;
		while(n > 0)
		{
			p *= (n % 10);
			n /= 10;
		}
		return p;
	}
	
	public static int reverseNumber(int n)
	{
		int rev = 0;
		while(n > 0)
		{
			rev = rev*10 + (n % 10);
			n /= 10;
		}
		return rev;
	}
	public static void main(String[] args) {
		int n = 347;
		System.out.println("Number: " + n);
		System.out.println("Count of Digits: " + countDigits(n));
		System.out.println("Sum of Digits: " + sumOfDigits(n));
		System.out.println("Sum of Square of Digits: " + sumOfDigitsRaisedToPower(n , 2));
		System.out.println("Product of Digits: " + prodOfDigits(n));
		System.out.println("Reverse of Number: " + reverseNumber(n));
	}

}
