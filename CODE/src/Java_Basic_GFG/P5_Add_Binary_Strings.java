package Java_Basic_GFG;

import java.util.Scanner;

public class P5_Add_Binary_Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		String a = sc.next();
		String b = sc.next();

		System.out.println(add_Binary(a, b));
	}
	
	static String add_Binary(String x, String y)
	{
		//Converting Binary String into Integer(Decimal Number)
		int num1 = Integer.parseInt(x,2);
		int num2 = Integer.parseInt(y,2);
		
		//Adding Decimal Numbers
		int sum = num1 + num2;
		
		String result = Integer.toBinaryString(sum);
		
		return result;
		
	}

}
