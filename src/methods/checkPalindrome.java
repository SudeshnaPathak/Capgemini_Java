package methods;

public class checkPalindrome {
	
	public static boolean isPalindrome(int n)
	{
		int temp = n;
		int rev = 0;
		while(n > 0)
		{
			rev = rev*10 + (n % 10);
			n /= 10;
		}
		return temp == rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 121;
		System.out.println(n + ":" + (isPalindrome(121) ? "PALINDROME" : "NOT A PLAINDROME"));
	}

}
