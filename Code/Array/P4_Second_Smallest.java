package PrepInsta_Array;

import java.util.Scanner;

public class P4_Second_Smallest {

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
		
		int second_small = small(arr);
		System.out.println(second_small + " is the Second Smallest Element");
	}
	
	public static int small(int[] arr)
	{
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(first > arr[i])
			{
				second = first;
				first = arr[i];
			}
			else if(second > arr[i])
			{
				second = arr[i];
			}
		}
		return second;
	}
}


//Initialize Variables: Two integer variables, first and second, are initialized to Integer.MAX_VALUE. 
//These will hold the smallest and second smallest values, respectively.
//Loop Through Array: For each element in the array:
//Update first and second:
//If the current element arr[i] is smaller than first, update second to be first, and then update first to be arr[i].
//If the current element arr[i] is not equal to first and is smaller than second, update second to be arr[i].
//Return Second Smallest: After the loop, the value of second (the second smallest element) is returned.
