package Java_Basic_GFG;

import java.util.Scanner;

public class P4_Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println("Before Swap a : " + m + " b : " + n);
		
		int temp;
		
		temp = m;
		m = n;
		n = temp;
		
		System.out.println("After Swap a : " + m + " b : " + n);
	}

}
