//The Two Sum problem asks us to find two numbers in an array that sum up to a given target value. 
//We need to return the indices of these two numbers.

//This is Brute Force Method Approach
//We use 2 Loops i.e Nested Loops to Iterate. It travels 2 times
//Not Eficient
//Time Complexity : O(n^2)
//Space Complexity : O(1)

package Array_LeetCode;

import java.util.Scanner;

public class Two_Sum_Array {

	public static int[] twoSum(int[] nums, int target)
	{
		int n = nums.length;
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(nums[i] + nums[j] == target)
				{
					return new int[]{i,j};
				}
			}
		}
		return new int[]{}; //In Case of No Solution 
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int size = sc.nextInt();
		
		int[] nums = new int[size];
		
		System.out.println("Enter the Elements of Array");
		
		//Input Array
		for(int i=0; i<nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.println();
		
		//Display Array
		for(int i=0; i<nums.length; i++)
		{
			System.out.print(nums[i]);
			System.out.print(" ");
		}		
		System.out.println();
		
		System.out.println("Enter Target Number");
		int target = sc.nextInt();
		
		int[] result = twoSum(nums,target);
		
		System.out.println("[" + result[0] + "," + result[1] + "]");
		
	}
}
