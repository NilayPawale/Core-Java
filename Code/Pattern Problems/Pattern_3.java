package Java_Pattern;

import java.util.Scanner;

public class Pattern_3 {

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
		for(int i=0; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i + " ");
				//i is not printed 0 since j=1 and this does not make the loop to run at i=0 condition
				//So when i=1 the inner loop runs
			}
			System.out.println();
		}
	}
}

//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5
//6 6 6 6 6 6
//7 7 7 7 7 7 7

