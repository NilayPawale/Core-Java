package PrepInsta_Strings;

import java.util.Scanner;

public class P1_Vowel_Consonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);
		
		//vowel(ch);
		
//		if(isUpperCaseVowel(ch) || isLowerCaseVowel(ch))
//		{
//			System.out.println(ch + " is a Vowel");
//		}
//		else
//		{
//			System.out.println(ch + " is a Consonant");
//		}
		
		if(vowel(ch))
		{
			System.out.println(ch + " is a Vowel");
		}
		
		else
		{
			System.out.println(ch + " is a Consonant");
		}
	}

	//Method 1
//	public static void vowel(char ch)
//	{
//		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//		{
//			System.out.println(ch + " is a Vowel");
//		}
//		else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
//		{
//			System.out.println(ch + " is a Vowel");
//		}
//		else
//		{
//			System.out.println(ch + " is a Consonant");
//		}
//	}
	
//	public static boolean isUpperCaseVowel(char ch)
//	{
//		//Returns 1 if char matches any of the below
//		return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
//	}
//	
//	public static boolean isLowerCaseVowel(char ch)
//	{
//		//Returns 1 if char matches any of the below
//		return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
//	}
	
	
	public static boolean vowel(char ch)
	{
		//Convert to Upper Case if not already
		//In-Built Method of Character Class
		ch = Character.toUpperCase(ch);
		
		return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
	}
}
