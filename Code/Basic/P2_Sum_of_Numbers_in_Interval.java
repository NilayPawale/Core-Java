package PrepInsta_Basic;

import java.util.Scanner;

public class P2_Sum_of_Numbers_in_Interval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();

		
		int addition = sum(a,b);
		System.out.println(addition + " is the Sum Between Two Numbers");
	}

	public static int sum(int a, int b)
	{
		int sum = 0;
		
		for(int i=a; i<=b; i++)
		{
			sum += i;
		}
		return sum;
	}
}
