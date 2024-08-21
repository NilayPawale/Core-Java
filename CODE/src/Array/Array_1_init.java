package Array;

public class Array_1_init {

	public static void main(String[] args) {
		
		//Declare an Array
		int[] arr;

		//Initialize an Array with Values
		arr = new int[] {1,2,3,4};
		
		//OR, Declare and Initialize in One Line
		int[] arr2 = {1,2,3,45};
		
		
		System.out.println(arr[0]); //1
		System.out.println(arr2[1]); //2
		
		
		//Access Elements
		int firstElement = arr[3]; 
		int secondElement = arr2[2]; 
		
		System.out.println(firstElement); //4
		System.out.println(secondElement);//3
		
		//Modify Elements
		arr[2] = 10; //Now arr is {1,2,10,4}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println();
		
		//Get the Length of Array
		int length = arr.length;//4
		
		System.out.println(length);
	}

}
