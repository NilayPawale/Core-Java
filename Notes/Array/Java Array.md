# Array

## Array Definition

Array is a Fixed Size index based data structure containing similar type of objects.

For example :

int[] a = new int[10] -> It is an array of 10 integers.

char[] c = new char[15] -> It is an array of 15 characters.

String[] s = new String[20] -> It is an array of 20 strings.


## Array Structure 

Arrays in Java use zero-based indexing to store the elements where first element is stored at 0th index, second element at 1st index, third element at 2nd index and so on.

## Array Declaration :

There are two ways to declare arrays in Java.

int[] intArray; OR int intArray[];

## Array Initialization 

There are three ways to initialize array elements.

1) Initializing individual elements

```
int[] intArray = new int[5];
intArray[0] = 21;
intArray[1] = 15;
intArray[2] = 37;
intArray[3] = 53;
intArray[4] = 17;
```

2) Passing all elements at a time with new operator
```
int[] intArray = new int[] {21, 15, 37, 53, 17};
```

3) Passing all elements at a time without new operator
```
int[] intArray = {21, 15, 37, 53, 17};
```

## Array Traversal 

There are two ways to traverse an array.

1) Using for loop :
```
int[] intArray = {21, 15, 37, 53, 17};
         
for (int i = 0; i < intArray.length; i++) 
{
    System.out.println(i);
}
```

2) Using advanced for loop :
```
int[] intArray = {21, 15, 37, 53, 17};
         
for (int i : intArray) 
{
    System.out.println(i);
}
```

## Multidimensional Arrays 

Multidimensional arrays can be defined as arrays of arrays. Arrays can be two dimensional, three dimensional, four dimensional and so on.

### Two Dimensional Array :
```
int[] firstArray = {1, 2, 3};      //One Dimensional Array
          
int[] secondArray = {4, 5, 6};    //One Dimensional Array
  
int[] thirdArray = {7, 8, 9};    //One Dimensional Array
  
//Two Dimensional Array
int[][] twoDimensionalArray = {firstArray, secondArray, thirdArray};
```

### Three Dimensional Array 
```
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
```

### Jagged Arrays 

Jagged arrays are also multidimensional arrays containing arrays of different length.
```
//One Dimensional Array of lenghth 3
int[] OneDimensionalArray1 = {1, 2, 3};
  
//One Dimensional Array of lenghth 4
int[] oneDimensionalArray2 = {4, 5, 6, 7};
  
//One Dimensional Array of lenghth 5
int[] oneDimensionalArray3 = {8, 9, 10, 11, 12};
  
//Jagged Two Dimensional Array
int[][] twoDimensionalArray = {OneDimensionalArray1, oneDimensionalArray2, oneDimensionalArray3};
```

## Anonymous Array 

Anonymous array is an array without reference or name.
```
new int[] {1,2,3,4,5,6};
```

## java.util.Arrays Class 

java.util.Arrays class is an utility class which contains many static methods to perform basic operations on an array.

Methods	

- sort() - Used to sort an array.
- stream() - Returns a stream containing all elements of an array.
- spliterator() - Returns spliterator of an array.
- setAll() - Initializes all elements of an array.
- fill() - Fills the given array with the given value.
- copyOf() - Creates copy of an array.
- asList() - Returns a list containing all elements of an array.
- binarySearch() - It is used to search an array for the given value.

## Array To List :
```
List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five");
```

## Array To List :
```
IntStream stream = Arrays.stream(new int[] {1, 2, 3, 4, 5});
```

## Array To List :
```
int[] intArray = new int[] {1, 2, 3, 4, 5};
         
System.out.println(intArray.length);  //Output : 5
```

## Array To String :
```
import java.util.Arrays;
 
public class MainClass 
{
    public static void main(String[] args) 
    {
        //Anonymous array
        System.out.println(Arrays.toString(new int[] {1, 2, 3, 4, 5}));
    }
}
```

## Array Pros And Cons :

Pros :
- Easy to use and implement
- Can hold both primitive types as well as objects
- Faster data retrieval

Cons :
- Fixed size
- Not type safe
- No in-built methods
