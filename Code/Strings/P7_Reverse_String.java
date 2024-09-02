package PrepInsta_Strings;

import java.util.Scanner;

public class P7_Reverse_String {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String s = sc.next();
		
		System.out.println(s + " is the String Before Reverse");
		
		reverse(s);
	}
	
	//Method 1
//	public static void reverse(String s)
//	{
//		int length = s.length();
//		
//		String reverse = "";
//		
//		for(int i=length-1; i>=0; i--)
//		{
//			reverse = reverse + s.charAt(i);
//		}
//		
//		System.out.println(reverse + " is the Reverse String");
//	}
	
	
	public static void reverse(String s)
	{
		// Create a new StringBuilder object and initialize it with the string 's'.
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		
		// Print the original string to the console.
		System.out.println("String is " + sb);
		
		// Reverse the contents of the StringBuilder object.
		sb.reverse();
		
		// Print the reversed string to the console.
		System.out.println("Reverse String is " + sb);
	
	}

}


//Here, the append() method is used to add the contents of the string s to the StringBuilder object sb. 
//Since StringBuilder is mutable, the contents of s are directly appended without the need to create a new StringBuilder object.

//The reverse() method is a built-in function in StringBuilder that reverses the sequence of characters. 
//This operation is done in-place, meaning the existing StringBuilder object is modified directly.


//Why Use StringBuilder?
//Mutability: StringBuilder is mutable, meaning it can be modified after it is created without creating new objects. This makes operations like reversing a string more efficient because no new strings are created during the process.
//
//Performance: For operations that involve multiple modifications of a string, such as appending, reversing, or inserting, StringBuilder is more efficient than using a String because it avoids the overhead of creating multiple String objects.
//
//Convenience: StringBuilder provides useful methods like reverse(), append(), insert(), and delete(), which make it easy to manipulate strings in a variety of ways.
//
//In this context, StringBuilder is used because it allows the string to be reversed efficiently and easily.