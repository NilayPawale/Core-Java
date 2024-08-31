package Basic;

import java.util.Scanner;

public class Basic_Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Angle One");
		int a = sc.nextInt();
		
		System.out.println("Enter Angle Two");
		int b = sc.nextInt();
		
		System.out.println("Enter Angle Three");
		int c = sc.nextInt();
		
		int d = a+b+c;
		
		if(d == 180)
		{
			System.out.println("Its a Triangle");
		}
		else
		{
			System.out.println("Its not a Triangle");
		}
	}

}
