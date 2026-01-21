package loops;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n = 13;
		boolean isPrime = true;
		for(int i = 2 ; i*i <= n ; i++)
		{
			if(n % i == 0) 
			{
				 isPrime = false;
				 break;
			}
		}
		System.out.println(isPrime ? "Prime" : "Not a Prime");
	}

}
