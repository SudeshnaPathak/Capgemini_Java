package loops;

public class Numbers {

	public static void main(String[] args) {
		
		
		//2. Neon Number
		int n = 9;
		System.out.println(n + ":" + (NumberHelper.sumOfDigits(n*n) == n ? "NEON NUMBER" : "NOT A NEON NUMBER"));
		
		//3. Harshad Number
		n = 18;
		System.out.println(n + ":" + (n % NumberHelper.sumOfDigits(n) == 0 ? "HARSHAD NUMBER" : "NOT A HARSHAD NUMBER"));
		
		//4. Palindrome Number
		n = 121;
		System.out.println(n + ":" + (n == NumberHelper.reverseNumber(n) ? "PALINDROME" : "NOT A PALINDROME"));
		
		//5. Spy Number
		n = 123;
		System.out.println(n + ":" + (NumberHelper.sumOfDigits(n) == NumberHelper.prodOfDigits(n) ? "SPY NUMBER" : "NOT A SPY NUMBER"));
		
		//6. Xylem or Phloem Number
		n = 12326;
		int sum = NumberHelper.sumOfDigits(n);
		int rev = NumberHelper.reverseNumber(n);
		int ext = (n % 10) + (rev % 10);
		int rem = sum - ext;
		System.out.println(n + ":" + (ext == rem ? "XYLEM NUMBER" : "NOT A XYLEM NUMBER"));
		
		//7. Happy Number
		n = 19;
		int temp = n;
		while(n > 9)
		{
			n = NumberHelper.sumOfDigitsRaisedToPower(n , 2);
		}
	   System.out.println(temp + ":" + ((n == 7 || n == 1) ? "HAPPY NUMBER" : "SAD NUMBER"));
	   
	   //8. Armstrong Number
	   n = 153;
	   int c = NumberHelper.countDigits(n);
	   System.out.println(n + ":" + (n == NumberHelper.sumOfDigitsRaisedToPower(n , c) ? "ARMSTRONG NUMBER" : "NOT AN ARMSTRONG NUMBER"));
	   
	   //9. Perfect Number
	   n = 28;
	   System.out.println(n + ":" + (n == Factors.sumOfProperFactors(n) ? "PERFECT NUMBER" : "NOT A PERFECT NUMBER"));
	   
	   //10. Magic Number
	   n = 1234;
	   temp = n;
	   while(n > 9)
	   {
		   n = NumberHelper.sumOfDigits(n);
	   }
	   System.out.println(temp + ":" + (n == 1 ? "MAGIC NUMBER" : "NOT A MAGIC NUMBER"));
	   
	   //11. Bouncy Number
	   n = 12321;
	   temp = n;
	   int prev = n % 10;
	   n = n/10;
	   boolean inc = false;
	   boolean dec = false;
	   while(n > 0)
	   {
		   int r = n % 10;
		   if(r < prev) inc = true;
		   if(r > prev) dec = true;
		   if(inc && dec) break;
		   prev = r;
		   n /= 10;
	   }
	   System.out.println(temp + ":" + (inc && dec ? "BOUNCY NUMBER" : "NOT A BOUNCY NUMBER"));
	   
	   //12. Tech Number
	   n = 2025;
	   temp = n;
	   int l = NumberHelper.countDigits(n);
	   if(l % 2 == 0)
	   {
		 int size = (int)Math.pow(10 , l/2);
		 int left = n/size;
		 int right = n%size;
		 sum = left + right;
		 if(sum*sum == temp) System.out.println(temp + ": TECH NUMBER");
		 else System.out.println(temp + ": NOT A TECH NUMBER");
	   }
	   else System.out.println(temp + ": NOT A TECH NUMBER");
	}

}
