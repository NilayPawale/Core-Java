package PrepInsta_Array;

import java.util.Scanner;

public class P1_Largest_Element {

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
		
		int largest_element = large(arr);
		System.out.println(largest_element + " is the Largest Element");
		
	}

	public static int large(int[] arr)
	{
		int max = 0;
		
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
