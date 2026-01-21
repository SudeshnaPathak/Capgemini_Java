package swebatch;

public class LoopPractiseQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 346;
		int temp = n;
		int rev = 0;
		while(temp > 0)
		{
			int r = temp % 10;
			rev = rev*10 + r;
			temp = temp / 10;
		}
		System.out.println((rev == n) ? "Palindrome" : "Not a Palindrome");
		
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
		
		int m = 9;
		int sq = m*m;
		temp = sq;
		int sum = 0;
		while(temp > 0)
		{
			int r = temp % 10;
			sum += r;
			temp = temp / 10;
		}
		System.out.println((m == sum) ? "Neon" : "Not Neon");
		
		sum = 0;
		temp = 18;
		while(temp > 0)
		{
			int r = temp % 10;
			sum += r;
			temp = temp / 10;
		}
		System.out.println((temp % sum == 0) ? "Harshad" : "Not Harshad");
		
		temp = 123;
		sum = 0;
		int prod = 1;
		while(temp > 0)
		{
			int r = temp % 10;
			sum += r;
			prod *= r;
			temp = temp / 10;
		}
		System.out.println((sum == prod) ? "Spy" : "Not Spy");
		
		temp = 121;
		n = temp;
		sum = 0;
		rev = 0;
		while(temp > 0)
		{
			int r = temp % 10;
			sum += r;
			rev = rev*10 + r;
			temp = temp / 10;
		}
		
		int ext = n % 10 + rev % 10;
		int rem = sum - ext;
		System.out.println((ext == rem) ? "Xylem" : "Not Xylem");
		
	}

}
