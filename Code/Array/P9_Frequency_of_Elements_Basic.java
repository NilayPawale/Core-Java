package PrepInsta_Array;

import java.util.Scanner;

public class P9_Frequency_of_Elements_Basic {

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

	//Method 1 - Naive Method without using Extra Spaces
	public static void frequency(int[] arr)
	{
		int n = arr.length;  // Store the length of the array
		
		// Outer loop to iterate over each element in the array
		for(int i=0; i<n; i++)
		{
			int flag = 0; // Flag to indicate if the current element has been encountered before
			int count = 0; // Variable to store the frequency of the current element
			
			// Inner loop to check if the current element appears later in the array
			for(int j=i+1; j<n; j++)
			{
				if(arr[i] == arr[j])
				{
					flag = 1; // Set the flag to 1 if the element is found again
					break; // Exit the loop as we don't need to check further
				}
			}
			
			// If the element was found later in the array, skip counting its frequency
			//This if Condition is not necessary but if not written it will print each number and at last display the count for each number.
			// While writing this condition prints the element and its count one time
			if(flag == 1)
			{
				continue; // Skip to the next iteration of the outer loop
			}
			
			// Loop to count how many times the current element appears in the array up to index i
			for(int j=0; j<=i; j++)
			{
				if(arr[i] == arr[j])
				{
					count++; // Increment the count if the element is found
				}
			}
			
			// Print the element and its frequency
			System.out.println(arr[i] + " : " + count);
		}
	}
}
