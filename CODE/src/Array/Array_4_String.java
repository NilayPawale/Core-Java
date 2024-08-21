package Array;

import java.util.Scanner;

public class Array_4_String {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();
		sc.nextLine(); //Consume the NewLine
		
		//Declare the Array
		String[] arr = new String[size];
		
		//Array Elements Input
		System.out.println("Enter the Elements of Array");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextLine();
		}
		System.out.println();
		
		//Display
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		sc.close();
	}
}
