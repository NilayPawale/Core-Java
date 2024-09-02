package Array;

import java.util.Scanner;

public class Concatenation_1929 {

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

		int[] concat = concat(arr);
		for(int i=0; i<concat.length; i++)
		{
			System.out.print(concat[i] + " ");
		}
	}

	public static int[] concat(int[] nums)
	{
		int n = nums.length;
		
		int[] ans = new int[2*n];
		
		for(int i=0; i<n; i++)
		{
			ans[i] = nums[i];
			ans[i+n] = nums[i];
		}
		
		return ans;
	}
}
