package PrepInsta_Array;

import java.util.Scanner;

public class P2_Smallest_Element {

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
		
		int smallest_element = small(arr);
		System.out.println(smallest_element + " is the Smallest Element");
		
	}
	
	public static int small(int[] arr)
	{
		int min = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		return min;
	}

}
