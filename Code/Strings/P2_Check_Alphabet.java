package PrepInsta_Strings;

import java.util.Scanner;

public class P2_Check_Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);
		
		alphabet(ch);

	}

	//Method 1
//	public static void alphabet(char ch)
//	{
//		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
//		{
//			System.out.println(ch + " is a Alphabet");
//		}
//		else
//		{
//			System.out.println(ch + " is not a Alphabet");
//		}
//	}
	
	
	public static void alphabet(char ch)
	{
		if((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90))
		{
			System.out.println(ch + " is a Alphabet");
		}
		else
		{
			System.out.println(ch + " is not a Alphabet");
		}
	}
}
