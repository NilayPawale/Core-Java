package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_6_Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the Elements of Array");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println();
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println();

		
		int n = arr.length;
		
		for(int i = 0; i<n/2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
		}
		
		System.out.print("Reversed Array is ");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
	}

}
