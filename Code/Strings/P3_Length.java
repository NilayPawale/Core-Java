package PrepInsta_Strings;

import java.util.Scanner;

public class P3_Length {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s = sc.next();
		
		length(s);

	}

	public static void length(String s)
	{
		int length = 0;
		
		for(char ch : s.toCharArray())
		{
			length++;
		}
		
		System.out.println(length + " is the Length of the String");
	}
}
