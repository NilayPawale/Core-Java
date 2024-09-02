package PrepInsta_Array;

import java.util.Scanner;

public class P6_Reverse_Array {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the Elements of Array");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println();
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println();
	
		reverse(arr);
		
		
	}

	//Method 1 - Print in Reverse
//	public static void reverse(int[] arr)
//	{
//		int n = arr.length;
//		
//		for(int i=n-1; i>=0; i--)
//		{
//			System.out.print(arr[i] + " ");
//		}
//	}
	
	//Method 2 - Reverse the Array
	public static void reverse(int[] arr)
	{
		int n = arr.length;
		int start = 0;
		int end = n-1;
		
		while(start < end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start ++;
			end -- ;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
