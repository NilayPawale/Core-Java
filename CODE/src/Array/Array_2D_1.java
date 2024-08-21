package Array;

public class Array_2D_1 {

	public static void main(String[] args) {

		//Declare 2D Array
		int[][] matrix;
		
		//Initialize 2D Array
		matrix = new int[][]
				{
					{1,2,3},
					{4,5,6},
					{7,8,9}
				};
				
		//OR Declare and Initialize in One Line
		int[][] matrix2 = {
				{3,2,1},
				{6,5,4},
				{9,8,7}
		};
		
		//Accessing Elements in 2D Array
		int value = matrix[1][2]; //6
		
		System.out.println(value);
		
		//Modifying Elements in a 2D Array
		matrix[0][0] = 10; //Matrix[0][0] is 10
		
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(matrix[i][j]);
			}
		}

	}

}
