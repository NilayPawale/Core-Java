package PrepInsta_Array;

import java.util.Scanner;

public class P3_Smallest_Largest {

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
		
		int min = findMin(arr);
		int max = findMax(arr);
		
		System.out.println(min + " is Smallest Element in Array");
		System.out.println(max + " is Largest Element in Array");
		
	}
	
	public static int findMin(int[] arr)
	{
		int min = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int findMax(int[] arr)
	{
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		return max;
	}

}
