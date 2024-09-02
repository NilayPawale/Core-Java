package PrepInsta_Array;

import java.util.Arrays;
import java.util.Scanner;

public class P7_Sort_Ascending_Descending {

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
	
	public static void sort(int[] arr)
	{
		Arrays.sort(arr);
		
		int n = arr.length;
		
		//Print First Half in Ascending
		for(int i=0; i<n/2; i++)
		{
			System.out.print(arr[i] + " ");
		}

		//Print the Second Half in Descending
		for(int i=n-1; i>=n/2; i--)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
