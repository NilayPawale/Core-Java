package Array;

public class Array_2_iterate {

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6};
		
		//Iterate Array
		
		//Using For Loop
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		
		//Using For Each Loop
		for(int element : arr)
		{
			System.out.print(element);
		}
	}
}
