package PrepInsta_Strings;

import java.util.Scanner;

public class P5_Remove_Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s = sc.next();
		
		String remove = remove(s);

		System.out.println("After Removing Vowels " + remove);
	}

	//Method 1
//	public static void remove(String s)
//	{
//		String s1 = "";
//		s1 = s.replaceAll("[a,e,i,o,u]", "");
//		System.out.println("After Removing Vowels " + s1);
//		
//	}
	
	public static String remove(String s)
	{
		return s.replaceAll("[a,e,i,o,u]", "");
	}
}
