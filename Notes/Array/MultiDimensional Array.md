# Multidimensional Arrays

Multidimensional arrays in java can be seen as arrays of arrays. i.e an array containing references of other array objects. Multidimensional arrays in java can be two, three, four or more dimensional.

## Two-Dimensional Array

Two dimensional array is an array containing references of one dimensional arrays.
```
public class MultiDimensionalArraysInJava
{
    public static void main(String[] args)
    {
        int[] fisrtElement = {1, 2, 3};      //One Dimensional Array
 
        int[] secondElement = {4, 5, 6};    //One Dimensional Array
 
        int[] thirdElement = {7, 8, 9};    //One Dimensional Array
 
        //Two Dimensional Array
        int[][] twoDimensionalArray = {fisrtElement, secondElement, thirdElement}; 
 
        //Printing elements of two dimensional array
        for (int i = 0; i < twoDimensionalArray.length; i++)
        {
            System.out.print("{");
            for (int j = 0; j < twoDimensionalArray[i].length; j++)
            {
                System.out.print(twoDimensionalArray[i][j] +"\t");
            }
            System.out.print("}");
            System.out.println();
        }
    }
}
```
Output :
{1 2 3 }
{4 5 6 }
{7 8 9 }

## Three-Dimensional Array

Three dimensional array is an array containing references of two-dimensional arrays.
```
public class MultiDimensionalArraysInJava
{
    public static void main(String[] args)
    {
        //One Dimensional Arrays
        int[] fisrtArray = {1, 2, 3};      
 
        int[] secondArray = {4, 5, 6};    
 
        int[] thirdArray = {7, 8, 9};    
 
        int[] fourthArray = {10, 11, 12};    
 
        int[] fifthArray = {13, 14, 15};    
 
        int[] sixthArray = {16, 17, 18};    
 
        int[] seventhArray = {19, 20, 21};    
 
        int[] eighthArray = {22, 23, 24};    
 
        int[] ninthArray = {25, 26, 27};    
 
        //Two Dimensional Arrays
        int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray}; 
 
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
 
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
 
        //Three Dimensional Array
        int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
 
        //Printing elements of three dimensional array
        for (int i = 0; i < threeDimensionalArray.length; i++)
        {
            System.out.print("{");
            for (int j = 0; j < threeDimensionalArray[i].length; j++)
            {
                System.out.print("{");
                for (int k = 0; k < threeDimensionalArray[i][j].length; k++)
                {
                    System.out.print(threeDimensionalArray[i][j][k] +"\t");
                }
                System.out.print("} ");
            }
            System.out.print("}");
            System.out.println();
        }
    }
}
```
Output :
{{1 2 3 } {4 5 6 } {7 8 9 } }
{{10 11 12 } {13 14 15 } {16 17 18 } }
{{19 20 21 } {22 23 24 } {25 26 27 } }