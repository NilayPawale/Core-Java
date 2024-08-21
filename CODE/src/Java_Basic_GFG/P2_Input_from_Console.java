package Java_Basic_GFG;

import java.util.Scanner;

public class P2_Input_from_Console {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Integer");
		int a = sc.nextInt();
		
		System.out.println("Enter a Character");
		char b = sc.next().charAt(0);
		
		System.out.println("Enter a Float");
		float c = sc.nextFloat();
		
		System.out.println("Integer : " + a);
		System.out.println("Character : " + b);
		System.out.println("Float : " + c);

	}

}
