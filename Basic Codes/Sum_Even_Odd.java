package Basic;

import java.util.Scanner;

public class Sum_Even_Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int n = sc.nextInt();
		
		int sumEven = 0;
		int sumOdd = 0;
		
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			{
				sumEven = sumEven + i;
			}
			else
			{
				sumOdd = sumOdd + i;
			}
		}
		
		System.out.println("Sum of Even Numbers is " + sumEven);
		System.out.println("Sum of Odd Numbers is " + sumOdd);

	}

}
