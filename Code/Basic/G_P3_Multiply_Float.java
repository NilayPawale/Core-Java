package Java_Basic_GFG;

import java.util.Scanner;

public class P3_Multiply_Float {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Decimal Numbers");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		System.out.println("Product of Float is " + (a*b));
		
		//OR
		
		float c = a*b;
		
		System.out.println("Product of Float is " + c);
	}
}
