# Jagged Arrays In Java

- Jagged arrays in java are arrays containing arrays of different length. 
- Jagged arrays are also multidimensional arrays. 
- Jagged arrays in java sometimes are also called as ragged arrays.

The following example shows two dimensional jagged array containing 3 one dimensional arrays of length 3, 4 and 5 respectively.
```
public class JaggedArraysInJava
{
    public static void main(String[] args)
    {
        //One Dimensional Array of lenghth 3
        int[] OneDimensionalArray1 = {1, 2, 3};
 
        //One Dimensional Array of lenghth 4
        int[] oneDimensionalArray2 = {4, 5, 6, 7};
 
        //One Dimensional Array of lenghth 5
        int[] oneDimensionalArray3 = {8, 9, 10, 11, 12};
 
        //Jagged Two Dimensional Array
        int[][] twoDimensionalArray = {OneDimensionalArray1, oneDimensionalArray2, oneDimensionalArray3};
 
        //Printing elements of Two Dimensional Array
        for (int i = 0; i < twoDimensionalArray.length; i++)
        {
            for (int j = 0; j < twoDimensionalArray[i].length; j++)
            {
                System.out.print(twoDimensionalArray[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
```

The jagged array in the above program can be represented as,
![alt text](image-4.png)

## Instantiating Jagged Array

While instantiating a jagged array using new operator, you need not to mention the size of it’s contained arrays. It indicates that array contains the arrays of varied length. For example,
```
public class JaggedArraysInJava
{
    public static void main(String[] args)
    {
        //Jagged Two Dimensional Array, No need to mention the size of it's contained arrays
        int[][] jaggedTwoDimensionalArray = new int[5][];
 
        //One Dimensional Array of lenghth 3
        int[] OneDimensionalArray1 = {1, 2, 3};
 
        //One Dimensional Array of lenghth 4
        int[] oneDimensionalArray2 = {4, 5, 6, 7};
 
        //One Dimensional Array of lenghth 5
        int[] oneDimensionalArray3 = {8, 9, 10, 11, 12};
 
        //Initializing elements of Jagged Array
 
        jaggedTwoDimensionalArray[0] = OneDimensionalArray1;
 
        jaggedTwoDimensionalArray[1] = oneDimensionalArray2;
 
        jaggedTwoDimensionalArray[2] = oneDimensionalArray3;
    }
}
```
