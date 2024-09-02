package PrepInsta_Array;

import java.util.Scanner;

public class P5_Sum_Of_Elements {

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
		
		int sum = sum(arr);
		
		System.out.println(sum + " is the Sum of Elements of Array");
	}
	
	public static int sum(int[] arr)
	{
		int sum = 0;
		
		for(int i=0; i<=arr.length; i++)
		{
			sum += i;
		}
		return sum;
	}

}
