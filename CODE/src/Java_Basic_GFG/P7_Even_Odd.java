package Java_Basic_GFG;

import java.util.Scanner;

public class P7_Even_Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int a = sc.nextInt();
		
		if(a%2 == 0)
		{
			System.out.println("The Number is Even");
		}
		else
		{
			System.out.println("The Number is Odd");
		}

	}

}
