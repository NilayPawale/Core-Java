package Basic;

import java.util.Scanner;

public class Simple_Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		
		System.out.println("Before Swap : "+a+" "+b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swap : "+a+" "+b);
	}
}
