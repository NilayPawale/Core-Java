package Basic;

import java.util.Scanner;

public class Check_Prime_or_Not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int p = sc.nextInt();
		
		if(p <= 1)
		{
			System.out.println(p + " is Not Prime");
		}
		else
		{
			boolean isPrime = true;
			
			for(int i = 2; i * i <= p; i++)
			{
				if(p % 1 == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
			{
				System.out.println(p + " is Prime");
			}
			else
			{
				System.out.println(p + " is not Prime");
			}
			
		}

	}

}
