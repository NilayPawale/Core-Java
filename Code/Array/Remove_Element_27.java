package Array;

import java.util.Scanner;

public class Remove_Element_27 {

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
		
		System.out.println("Enter the Value to be Removed");
		int val = sc.nextInt();

		int remove = remove(arr, val);
		System.out.println(remove + " is the Size of Array");
		
		
	}

	public static int remove(int[] nums, int val)
	{
		int n = nums.length;
		
		int k = 0;
		
		for(int i=0; i<n; i++)
		{
			if(nums[i] != val)
			{
				nums[k] = nums[i];
				k++;
			}
		}
		
		return k;
	}
}
