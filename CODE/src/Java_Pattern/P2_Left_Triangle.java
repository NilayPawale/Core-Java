package Java_Pattern;

import java.util.Scanner;

public class P2_Left_Triangle {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number for *");
		int n = sc.nextInt();
		
		LeftStarTriangle(n);

	}
	
	public static void LeftStarTriangle(int s)
	{
		int i,j;
		for(i = 0; i < s; i++)
		{
			for(j = 2 * (s - i); j >= 0; j--)
			{
				System.out.print(" ");
			}
			
			for(j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

//        * 
//      * * 
//    * * * 
//  * * * * 
//* * * * * 