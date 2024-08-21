package Java_Basic_GFG;

import java.util.Scanner;

public class P9_LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//Checking for the Largest Number
		int ans = (a>b)?a:b;
		
		//Checking for Smallest Number that can be Divided by Both Numbers
		while(ans>0)
		{
			if(ans%a == 0 && ans%b == 0)
			{
				break;
			}
			ans++;
		}
		System.out.println("LCM of " + a + " and " + b
                + " : " + ans);
	}

}
