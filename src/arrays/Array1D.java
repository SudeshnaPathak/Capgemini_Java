package arrays;

import java.util.*;

public class Array1D {
	
	public static void main(String[] args) {
		byte[]a = new byte[0];
		System.out.println(a);
		
		boolean[]b = new boolean[5];
		System.out.println(b);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements added successfully");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		int[] d = new int[0];
		System.out.println(Arrays.toString(d));

		//ArrayIndexOutOfBoundsException
		//System.out.println(d[0]);
		//System.out.println(d[-1]);
		//System.out.println(d[d.length]);
		
		//If I have the values
		int [] e = {11 , 22 , 33};
		System.out.println(e.length);
		System.out.println(Arrays.toString(e));

	}

}
