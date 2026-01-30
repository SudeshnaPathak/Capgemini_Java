package arrays;

import java.util.Arrays;

public class ArrayQuestions {
	
	public static void q1(int[] arr)
	{
		int n = arr.length;
		for(int i = n/2-1 ; i >= 0 ; i--)
		{
		System.out.println(arr[i]);
		}
		
		for(int i = n/2 ; i < n ; i++)
		{
		System.out.println(arr[i]);
		}
	}
	
	public static void q2(int[] arr)
	{
		int n = arr.length;
		for(int i = 0 ; i < n ; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void q3(int[] arr , int key)
	{
		int flag = -1;
		for(int i : arr)
		{
			if(i == key)
			{
				flag = 1;
				break;
			}
		}
		System.out.println(flag == 1 ? "Present" : "Not Present");
	}
	
	public static void q4(int[] arr)
	{
		int sum = 0;
		int n = arr.length;
		for(int i : arr) sum += i;
		double avg = sum*1.0/n;
		System.out.println("Average: " + avg);
	}
	
	public static void q5(int[] arr)
	{
		int even = 0 , odd = 0;
		for(int i : arr)
		{
			if(i % 2 == 0) even++;
			else odd++;
		}
		System.out.println("Even Count: " + even);
		System.out.println("Odd Count: " + odd);
	}
	
	public static void q6(int[] arr)
	{
		long p = 1;
		for(int i : arr) p *= i;
		System.out.println("Product: " + p);
	}
	
	public static int q7(int[] arr)
	{
		int maxi = Integer.MIN_VALUE;
		for(int i : arr)
		{
			if(i > maxi) maxi = i;
		}
		System.out.println("Maximum: " + maxi);
		return maxi;
	}
	
	public static void q8(int[] arr)
	{
		int small = Integer.MAX_VALUE;
		int small2 = small;
		for(int i : arr)
		{
			if(i < small)
			{
				small2 = small;
				small = i;
			}
			else if(i > small && i < small2) small2 = i;
		}
		System.out.println("Smallest: " + small);
		System.out.println("2nd Smallest: " + small2);
	}
	
	public static void q9(int[] arr , int target)
	{
		int c = 0;
		for(int i : arr)
		{
			if(i == target) c++;
		}
		System.out.println("Frequency of " + target + " = " + c);
	}
	
	public static int[] q10(int[] arr)
	{
		int len = q7(arr);
		int[] arr1 = new int[len+1];
		for(int i : arr)
		{
			arr1[i]++;
		}
		
		int k = 0;
		for(int i = 0 ; i < arr1.length ; i++)
		{
			if(arr1[i] >= 1) k++;
		}
		int[] arr2 = new int[k];
		
		int j = 0;
		for(int i = 0 ; i < len+1 ; i++)
		{
			if(arr1[i] >= 1) arr2[j++] = i;
		}
		System.out.println(Arrays.toString(arr2));
		return arr2;
	}
	
	public static int[] q11(int[] arr)
	{
		int len = q7(arr) + 1;
		int arr1[] = new int[len];
		for(int i : arr)
		{
			arr1[i]++;
		}
		for(int i = 0 ; i < len ; i++)
		{
			if(arr1[i] >= 1)
				System.out.println("frequency of: " + i + ": " +  arr1[i]);
		}
		return arr1;
	}
	
	public static void q12(int[] arr , int k)
	{
		int n = arr.length;
		int start = k % n;
		System.out.println("Left Shift");
		for(int i = start ; i < n ; i++)
		{
			System.out.println(arr[i]);
		}
		for(int i = 0 ; i < start ; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Right Shift");
		for(int i = n - k ; i < n ; i++)
		{
			System.out.println(arr[i]);
		}
		for(int i = 0 ; i < n-k ; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void q13(int[] arr , int k)
	{
		int[] arr1 = q10(arr);
		int n = arr1.length;
		Arrays.sort(arr1);
		System.out.println(k + "th Largest: " + arr1[n-k]);
	}
	
	public static void q14(int[] arr)
	{
		int i = 0;
		int j = arr.length - 1;
		while(i < j)
		{
			if(arr[i] == 0)
			{
				while(arr[j] == 0) j--;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j--;
			}
			i++;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void q15(int[] arr)
	{
		int[] arr1 = q11(arr);
		int maxi = Integer.MIN_VALUE;
		int maxElement = -1;
		for(int i = 0 ; i < arr1.length ; i++)
		{
			if(arr1[i] >= 1)
			{
				if(arr1[i] > maxi)
				{
					maxElement = i;
					maxi = arr1[i];
				}
			}
		}
		System.out.println("Highest Frequency: " + maxElement + " = " + maxi);
	}
	
	public static void swap(int[] arr , int i , int j)
	{
		arr[i] = arr[i] + arr[j];
		arr[j] = arr[i] - arr[j];
		arr[i] = arr[i] - arr[j];
	}
	public static int[] bubblesort(int[] arr)
	{
		for(int i = 0 ; i < arr.length -1; i++)
		{
			if(arr[i] > arr[i+1])
			{
				swap(arr , i , i+1);
				i = -1;
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	public static void q16(int [] arr)
	{
		int i = 0;
		int j = arr.length - 1;
		while(i < j)
		{
			swap(arr , i , j);
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void removeDuplicates(int[] arr)
	{
		int[] arr1 = bubblesort(arr);
		for(int i = 0 ; i < arr1.length ; i++)
		{
			System.out.println(arr1[i]);
			while(i < arr1.length-1 && arr1[i] == arr1[i+1]) i++;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10 , 20 , 30 , 40 , 50 , 60 , 10};
//		q1(arr);
//		q2(arr);
//		q3(arr , 10);
//		q4(arr);
//		q5(arr);
//		q6(arr);
//		q7(arr);
//		q8(arr);
//		q9(arr , 10);
//		q10(arr);
//		q11(arr);
//		q12(arr , 3);
//		q13(arr , 3);
		int[] a = {2 , 0 , 3 , 0 , 4 , 5 , 0};
//		q14(a);
//		q15(a);
//		bubblesort(a);
//		q16(arr);
		removeDuplicates(a);
	}

}
