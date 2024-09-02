package Java_Pattern;

import java.util.Scanner;

public class Pattern_5 {

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
			for(int j=rows; j>=i; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}

//7
//7 6
//7 6 5
//7 6 5 4
//7 6 5 4 3
//7 6 5 4 3 2
//7 6 5 4 3 2 1