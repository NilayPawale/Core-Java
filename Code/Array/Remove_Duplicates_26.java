package Array;

import java.util.Scanner;

public class Remove_Duplicates_26 {

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

		int duplicate = duplicate(arr);
		
		System.out.println(duplicate + " is the Number of Elements");
		
	}

	
	public static int duplicate(int[] nums)
	{
		int n = nums.length;
		
		if(nums.length == 0)
		{
			return 0;
		}
		
		int l = 1;
		
		for(int r=1; r<n; r++)
		{
			if(nums[r] != nums[r-1])
			{
				nums[l] = nums[r];
				l++;
			}
		}
		
		return l;
	}
}
