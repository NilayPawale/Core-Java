package Array;

import java.util.Scanner;

public class Array_3_input_output {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//Take Size from User
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		//Take Elements from User
		System.out.println("Enter the Elements of Array");
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Displaying Array");
		for(int i=0; i<size; i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		
		sc.close();
		
	}
}
