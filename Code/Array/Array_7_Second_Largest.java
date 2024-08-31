package Array;

import java.util.Scanner;

public class Array_7_Second_Largest {

	public static void main(String[] args) {
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
		
		System.out.println("Displaying Array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println();
		
		//Second Largest Element
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				secondMax = max;
				max = arr[i];
			}
			else if(arr[i] > secondMax && arr[i] != max)
			{
				secondMax = arr[i];
			}
		}
		
		System.out.println("The Second Largest Element is "+secondMax);

	}

}
