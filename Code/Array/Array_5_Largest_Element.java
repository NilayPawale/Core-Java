package Array;

import java.util.Scanner;

public class Array_5_Largest_Element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		//Input
		System.out.println("Enter the Elements of Array");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println();
		
		
		//Display
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println();
		
		
		
		//Largest Element
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		
		System.out.println("Largest Element is : "+max);
		
		
		

	}
}


