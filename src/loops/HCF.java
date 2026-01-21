package loops;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 120;
		int b = 25;
		while( b != 0)
		{
			int r = a % b;
			a = b;
			b = r;
		}
		System.out.println("HCF: " + a);
	}

}
