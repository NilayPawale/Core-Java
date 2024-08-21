package Basic;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Base Number");
		int m = sc.nextInt();
		
		System.out.println("Enter Index Number");
		int n = sc.nextInt();
		
		int prod = 1;
		
		for(int i=1; i<=n; i++)
		{
			prod = prod * m;
		}
		System.out.println("Product of " + m + " is " + prod);

	}

}
