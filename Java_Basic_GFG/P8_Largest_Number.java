package Java_Basic_GFG;

import java.util.Scanner;

public class P8_Largest_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1");
		int a = sc.nextInt();
		System.out.println("Enter Number 2");
		int b = sc.nextInt();
		System.out.println("Enter Number 3");
		int c = sc.nextInt();

		if(a>b && a>c)
		{
			System.out.println(a + " is the Greatest Number");
		}
		else if(b>c && b>a)
		{
			System.out.println(b + " is the Greatest Number");
		}
		if(c>b && c>a)
		{
			System.out.println(c + " is the Greatest Number");
		}
		
		//Or Using Ternary Operator
		int d = greatest(a, b, c);
		
		System.out.println(d + " is the Greatest Using Ternary");
		
	}
	
	
	static int greatest(int a, int b, int c)
	{
		return c > (a>b?a:b) ? c : ((a>b)?a:b);
	}

}
