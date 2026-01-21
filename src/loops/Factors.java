package loops;

public class Factors {
	
	public static int sumOfProperFactors(int n)
	{
		int sum = 0;
		System.out.print("Factors of " + n + ": ");
		for(int i = 1 ; i*i <= n ; i++)
		{
			if(n % i == 0)
			{
				System.out.print(i + " ");
				sum += i;
				if(i != n/i) 
					{
					 	System.out.print(n/i + " ");
					 	if(i != 1) sum += n/i;
					}
			}
		}
		System.out.println();
		return sum;
	}
	public static void main(String[] args) {
		
		int n = 12;
		System.out.println("Sum of Proper Factors of " + n + ":" + sumOfProperFactors(n));
		

	}

}
