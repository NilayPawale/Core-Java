package PrepInsta_Array;

import java.util.Arrays;
import java.util.Scanner;

public class P8_Sort_Array {

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
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	
		sort(arr);
	}
	
	//Method 1 By Using Naive Approach
	public static void sort(int[] arr)
	{
		int n = arr.length;
		
		int temp = 0;
		
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	
	//Method 2 By Using InBuilt Method
//	public static void sort(int[] arr)
//	{
//		int n = arr.length;
//		
//		Arrays.sort(arr);
//		
//		for(int i=0; i<n; i++)
//		{
//			System.out.print(arr[i] + " ");
//		}
//	}
}
