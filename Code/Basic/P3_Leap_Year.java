package PrepInsta_Basic;

import java.util.Scanner;

public class P3_Leap_Year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Year");
		int y = sc.nextInt();
		
		boolean leap_year = year(y);
		if(leap_year)
		{
			System.out.println(y + " is a Leap Year");
		}
		else
		{
			System.out.println(y + " is not a Leap Year");
		}
	}

	public static boolean year(int y)
	{
		if(y%400 == 0)
		{
			return true;
		}
		else if(y%4==0 && y%100 !=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
