package Java_Pattern;

import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Taking Rows from the User
		
		System.out.println("Enter the Number of Rows");
		int rows = sc.nextInt();
		
		System.out.println("Here is Your Pattern !!!");
		
		pattern(rows);
	}

	public static void pattern(int rows)
	{
		for(int i=rows; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}

//7 7 7 7 7 7 7
//6 6 6 6 6 6
//5 5 5 5 5
//4 4 4 4
//3 3 3
//2 2
//1
