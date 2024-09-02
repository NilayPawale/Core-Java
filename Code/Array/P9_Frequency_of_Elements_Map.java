package PrepInsta_Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P9_Frequency_of_Elements_Map {

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
		int n = arr.length;
		
		// Step 1: Create a HashMap to store elements and their corresponding frequencies
		Map<Integer, Integer> map = new HashMap<>();
		
		// Step 2: Iterate through the array and populate the HashMap
		for(int i=0; i<n; i++)
		{
			if(map.containsKey(arr[i]))
			{
				// If the element is found in the map, increment its frequency by 1
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				// If the element is not found in the map, add it with a frequency of 1
				map.put(arr[i], 1);
			}
		}
		
		// Step 3: Iterate through the HashMap to print the frequencies of each element
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			// Print the element (key) and its frequency (value)
			System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times ");
		}
	}
}
