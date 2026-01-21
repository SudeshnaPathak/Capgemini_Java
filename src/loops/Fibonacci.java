package loops;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 8;
		int x = 1;
		int y = 1;
		System.out.print(x + " " + y + " ");
		for(int i = 2 ; i < n ; i++)
		{
			int z = x + y;
			System.out.print(z + " ");
			x = y;
			y = z;
		}
	}

}
