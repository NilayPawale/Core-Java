package Basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		int temp = num;
		int sum=0;
		int rem;
		
		while(num > 0)
		{
			rem = num%10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		
		if(sum == temp)
		{
			System.out.println(temp + " is Palindrome Number");
		}
		else
		{
			System.out.println(temp + " is not Palindrome Number");
		}
	}
}
