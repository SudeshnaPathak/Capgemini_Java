package arrays;

public class Array2D {

	public static void main(String[] args) {
		int [][] a = new int[4][4];
		for(int i = 0 ; i < 4 ; i++)
		{
			for(int j = 0 ; j < 4 ; j++)
			{
				a[i][j] = i+j;
			}
		}
		
		int sum1 = 0 , sum2 = 0;
		for(int i = 0 ; i < 4 ; i++)
		{
			for(int j = 0 ; j < 4 ; j++)
			{
				if(i == j) sum1 += a[i][j];
				if(i+j == 3) sum2 += a[i][j];
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);
	}

}
