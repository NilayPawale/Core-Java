package PrepInsta_Strings;

import java.util.Scanner;

public class P6_String_Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s = sc.next();

		palindrome(s);
	}

	public static void palindrome(String s)
	{
		int length = s.length();
		
		// Initialize an empty string to store the reverse of the input string
		String reverse = "";
		
		// Loop through the string in reverse order
	    // Start from the last character (index length-1) to the first character (index 0)
		for(int i=length-1; i>=0; i--)
		{
			// Append each character to the reverse string
			reverse = reverse + s.charAt(i);
			//By the end of the loop, reverse contains the original string in reverse order.
		}
		
		// Compare the original string with the reversed string
		if(s.equals(reverse))
		{
			System.out.println("The String is Palindrome");
		}
		else
		{
			System.out.println("The String is not Palindrome");
		}
	}
}
