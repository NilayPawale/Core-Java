package PrepInsta_Array;

import java.util.Arrays;
import java.util.Scanner;

public class P9_Frequency_of_Elements_Sort {

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
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		frequency(arr);
	}

	public static void frequency(int[] arr)
	{
		int n = arr.length; // Store the length of the array
		
		Arrays.sort(arr); // Sort the array in ascending order
		
		// Loop through the sorted array to count the frequency of each element
		for(int i=0; i<n; i++)
		{
			int count = 1; // Initialize count as 1 for the current element
			
			 // This loop increments the count if the next element is the same as the current one
			while(i<n-1 && arr[i] == arr[i+1])
			{
				i++; // Move to the next element
				count++; // Increment the count for the current element
			}
			 // Print the element and its frequency
			System.out.println(arr[i] + " : " + count);

		}
	}
}
