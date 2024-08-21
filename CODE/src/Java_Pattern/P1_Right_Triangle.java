package Java_Pattern;

import java.util.Scanner;

public class P1_Right_Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number for *");
		int n = sc.nextInt();
		
		RightStarTriangle(n);

	}
	
	public static void RightStarTriangle(int s)
	{
		for(int i = 0; i < s; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}


//* 
//* * 
//* * * 
//* * * * 
//* * * * * 