package Java_Basic_GFG;

import java.util.Scanner;

public class PP10_GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int gcd = GCD(a, b);
		
		System.out.println("GCD of " + a + " and " + b + " is " + gcd);
	}

	static int GCD(int a, int b)
	{
		int gcd = 1;
		for(int i=1; i<=a && i<=b; i++)
		{
			if(a%i == 0 && b%i == 0)
			{
				gcd = i;
			}
		}
		return gcd;
	}
}
