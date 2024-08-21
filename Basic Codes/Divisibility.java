package Basic;

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int a = sc.nextInt();
		
		if(a%5==0 && a%7==0)
		{
			System.out.println("The Number is Divisible by 5 and 7");
		}
		else
		{
			System.out.println("The Number is not Divisible by 5 and 7");
		}
	}

}
