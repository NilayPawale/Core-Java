package Java_Pattern;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Taking Rows from the User
		
		System.out.println("Enter the Number of Rows");
		int rows = sc.nextInt();
		
		pattern(rows);

	}
	
	// The outer loop controls the number of rows in the pattern.
    // It starts from 0 and goes up to the value of 'rows'.
	public static void pattern(int rows)
	{
		System.out.println("Here is Your Pattern");
		
		for(int i=1; i<=rows; i++)
		{
			// The inner loop is responsible for printing the numbers in each row.
	        // It starts from 1 and goes up to the current row number 'i'.
			for(int j=1; j<=i; j++)
			{
				// Print the current value of 'j' followed by a space.
	            // This prints the sequence of numbers in each row.
				System.out.print(j+" ");
			}
			 // After printing the numbers in a row, move to the next line.
			System.out.println();
		}
	}
}


//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 5 6
//1 2 3 4 5 6 7