package Basic;

import java.util.Scanner;

public class Basic_Income {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Income");
		int i = sc.nextInt();
		
		if(i < 150000)
		{
			System.out.println("Income Tax is 0");
		}
		else if(i > 150000 && i < 300000)
		{
			System.out.println("Income Tax is "+(i * 0.2));
		}
		else if(i > 300000)
		{
			System.out.println("Income Tax is "+(i * 0.3));
		}

	}

}
