package Basic;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Character");
		char c = sc.next().charAt(0);
		
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
		{
			System.out.println("It is a Vowel");
		}
		else
		{
			System.out.println("It is a Consonant");
		}

	}

}
