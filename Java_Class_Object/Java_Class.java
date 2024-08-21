package Java_Class_Object;

import java.util.Scanner;

public class Java_Class {

	//Data Member and Instance Variable
	int id;
	
	//Data Member and Instance Variable
	String name;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Creating an Object of Java_Class
		Java_Class j1 = new Java_Class();
		
		System.out.println(j1.id); //0
		System.out.println(j1.name); //null
		
		System.out.println("Enter ID and Name");
		j1.id = sc.nextInt();
		j1.name = sc.next();

		System.out.println(j1.id);
		System.out.println(j1.name); 
	}

}
