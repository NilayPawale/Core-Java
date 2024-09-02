package PrepInsta_Basic;

import java.util.Scanner;

public class P1_Positive_Negative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		String result = result(n);
		System.out.println(result);
		
	}

	public static String result(int num)
	{
		if(num > 0)
		{
			return "The Number is Positive";
		}
		else if(num < 0)
		{
			return "The Number is Negative";
		}
		else
		{
			return "Zero";
		}
	}
}
