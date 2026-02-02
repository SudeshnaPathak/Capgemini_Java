package arrays;

public class VarArgs {
	
	public static void sum(int... a)
	{
		int sum = 0;
		for(int i : a) sum += i;
		System.out.println("Sum: " + sum);
	}
	public static void main(String[] args) {
		sum(10,20,30,40);
		sum(11,22,33,44,55,66,77,88,99);
	}

}
