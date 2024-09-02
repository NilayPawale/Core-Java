package PrepInsta_Strings;

import java.util.Scanner;

public class P8_Remove_Special_Characters {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String s = sc.next();
		
		removeCharacters(s);
	}
	
	
	//Method 1
//	public static void removeCharacters(String s)
//	{
//		// Loop through each character in the string 's'.
//		for(int i=0; i<s.length(); i++)
//		{
			// Check if the current character is not a letter (both uppercase and lowercase).
//			if(s.charAt(i) < 'A' || s.charAt(i) > 'Z' && s.charAt(i) < 'a' || s.charAt(i) > 'z')
//			{
	 			// If the character is not a letter, remove it by creating a new string
    			// that excludes the current character.
//				s = s.substring(0,i) + s.substring(i+1);
	
	
				// Decrement 'i' because the string length has been reduced,
			    // so we need to re-check the current index after removal.
//				i--;
//			}
//		}
//		System.out.println(s);
//	}
	
	//Method 2 - Using String Builder
	public static void removeCharacters(String s)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		
		for(int i=0; i<sb.length(); i++)
		{
			if(sb.charAt(i) < 'A' || sb.charAt(i) > 'Z' && sb.charAt(i) < 'a' || sb.charAt(i) > 'z')
			{
				sb.deleteCharAt(i);
				i--;
			}
		}
		
		System.out.println(sb);
	}
}



//Remove the Non-Letter Character:
//
//s = s.substring(0, i) + s.substring(i + 1);
//If the character is not a letter, it is removed from the string.
//s.substring(0, i): This creates a new string that includes all characters before the current index i.
//s.substring(i + 1): This creates a new string that includes all characters after the current index i.
//The two substrings are concatenated, effectively removing the character at index i from the string.


//Adjust the Index:
//
//i--;
//After removing a character, the length of the string decreases by one. 
//The i-- statement adjusts the index to re-check the current position since the string has shifted. 
//This ensures that no characters are skipped during the iteration.
