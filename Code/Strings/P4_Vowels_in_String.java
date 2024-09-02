package PrepInsta_Strings;

import java.util.Scanner;

public class P4_Vowels_in_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s = sc.next();
		
		vowel(s);
	}

	public static void vowel(String s)
	{
		char[] ch = s.toCharArray();
		
		int vowel = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vowel++;
			}
		}
		System.out.println(vowel + " is the number of Vowels");
	}
}
