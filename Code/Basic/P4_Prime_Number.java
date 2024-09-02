package PrepInsta_Basic;

import java.util.Scanner;

public class P4_Prime_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int p = sc.nextInt();
		
		int i;
		boolean isPrime = true;
		
		if(p<2)
		{
			isPrime = false;
		}
		else
		{
			for(i=2; i<p; i++)
			{
				if(p%1==0)
				{
					isPrime = false;
					break;
				}
			}
		}
		
		String result = isPrime ? "Prime Number" : "not Prime Number";
		System.out.println("The Result is " + result);
		
	}

}
