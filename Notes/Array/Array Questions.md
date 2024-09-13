# Array Questions

1) What is an array?

- Array is a collection of same type of objects or values where each value or object is identified by an index. 
- You can make an array of int’s, double’s, boolean’s or any other types but all the values of an array must be of same type.

2) What are the different ways to create arrays in Java?

1) Creating an array without elements :
```
int[] a = new int[10] OR int a[] = new int[10]
```
2) Creating an array with elements :
```
int[] a = new int[] {1, 2, 3, 4 ,5} OR int a[] = new int[] {1, 2, 3, 4 ,5}
```

3) What is ArrayStoreException in Java? When you will get this exception?

- ArrayStoreException is a run time exception which occurs when you try to store non-compatible element in an array object. 
- The type of the elements must be compatible with the type of an array object. 
- For example, you can store only string elements in an array of strings. If you try to insert integer element in an array of strings, you will get ArrayStoreException at run time.
```
public class JavaArrayExample
{
    public static void main(String[] args)
    {
        Object[] stringArray = new String[5];   //No compile time error : String[] is auto-upcasted to Object[]
 
        stringArray[1] = "JAVA";     
 
        stringArray[2] = 100;     //No compile time error, but this statement will throw java.lang.ArrayStoreException at run time
 
        //because we are inserting integer element into an array of strings
    }
}
```

4) Can you pass the negative number as an array size?

- No. You can’t pass the negative integer as an array size. 
- If you pass, there will be no compile time error but you will get NegativeArraySizeException at run time.
```
public class JavaArrayExample
{
    public static void main(String[] args)
    {
        int[] array = new int[-5];     //No compile time error
 
        //but you will get java.lang.NegativeArraySizeException at run time
    }
}
```

5) Can you change the size of an array once you define it? OR Can you insert or delete the elements after creating an array?

- No. You can’t change the size of an array once you define it. 
- You can’t insert or delete the elements after creating an array. 
- Only you can do is change the value of the elements.


6) What is an anonymous array? Give example?

Anonymous array is an array without reference. For example,
```
public class JavaArrayExample
{
    public static void main(String[] args)
    {
        //Creating anonymous arrays
 
        System.out.println(new int[]{1, 2, 3, 4, 5}.length);    //Output : 5
 
        System.out.println(new int[]{21, 14, 65, 24, 21}[1]);   //Output : 14
    }
}
```

7) There are two array objects of int type. One is containing 100 elements and another one is containing 10 elements. Can you assign an array of 100 elements to an array of 10 elements?

Yes, you can assign an array of 100 elements to an array of 10 elements provided they should be of same type. While assigning, compiler checks only the type of an array not the size.
```
public class JavaArrayExample
{
    public static void main(String[] args)
    {
        int[] a = new int[10];
 
        int[] b = new int[100];
 
        a = b;      //Compiler checks only type, not the size
    }
}
```

8) “int a[] = new int[3] {1, 2, 3}” – is it a legal way of defining the arrays in Java?

No. You should not mention the size of an array when you are providing the array contents.

9) What are the differences between Array and ArrayList in Java?

| Array | ArrayList | 
|:--------------:|:--------------:|
| Arrays are static in nature. Arrays are fixed length data structures. You can’t change their size once they are created.| ArrayList is dynamic in nature. Its size is automatically increased if you add elements beyond its capacity.| 
| Arrays can hold both primitives as well as objects.| ArrayList can hold only objects.| 
| Arrays can be iterated only through for loop or for-each loop.| ArrayList provides iterators to iterate through their elements.|
| The size of an array is checked using length attribute.| The size of an ArrayList can be checked using size() method.| 
| Array gives constant time performance for both add and get operations.| ArrayList also gives constant time performance for both add and get operations provided adding an element doesn’t trigger resize.| 
| Arrays don’t support generics.| ArrayList supports generics.|
| Arrays are not type safe.| ArrayList are type safe.|
| Arrays can be multi-dimensional.| ArrayList can’t be multi-dimensional.|
| Elements are added using assignment operator.| Elements are added using add() method.|


10) Where the arrays are stored in the memory?

- Arrays are nothing but the objects in Java. 
- Hence, they are stored in heap memory like normal objects.

11) What are the different ways of copying an array into another array?

There are four ways available in Java to copy an array.

1) Using for loop

2) Using Arrays.copyOf() method

3) Using System.arraycopy() method

4) Using clone() method


12) What are jagged arrays in Java? Give example?

- Jagged arrays in Java are the arrays containing arrays of different length. Jagged arrays are also multidimensional arrays. 
- They are also called as ragged arrays.

13) How do you check the equality of two arrays in Java?

You can use Arrays.equals() method to compare one dimensional arrays and to compare multidimensional arrays, use Arrays.deepEquals() method.

14) What is ArrayIndexOutOfBoundsException in Java? When it occurs?

ArrayIndexOutOfBoundsException is a run time exception which occurs when your program tries to access invalid index of an array i.e negative index or index higher than the size of an array.

15) How do you sort the array elements?

- You can sort the array elements using Arrays.sort() method. 
- This method internally uses quick sort algorithm to sort the array elements.
```
import java.util.Arrays;
 
public class JavaArrayExample
{
    public static void main(String[] args)
    {
        int[] a = new int[]{45, 12, 78, 34, 89, 21};
 
        Arrays.sort(a);
 
        System.out.println(Arrays.toString(a));
 
        //Output : [12, 21, 34, 45, 78, 89]
    }
}
```

16) How do you find the intersection of two arrays in Java?

Below is the code to find the common elements or intersection of two arrays in Java.

1) Using Iterative Method

- In this method, we iterate both the given arrays and compare each element of one array with elements of other array. 
- If the elements are found to be equal, we will add that element into HashSet. 
- This method also works for those arrays which contain duplicate elements.
```
class CommonElements
{
    public static void main(String[] args)
    {
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
 
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
 
        HashSet<String> set = new HashSet<String>();
 
        for (int i = 0; i < s1.length; i++)
        {
            for (int j = 0; j < s2.length; j++)
            {
                if(s1[i].equals(s2[j]))
                {
                    set.add(s1[i]);
                }
            }
        }
 
        System.out.println(set);     //OUTPUT : [THREE, FOUR, FIVE]
    }
}
```

2) Using retainAll() Method :

- This is one of the easiest method to find the common elements from two arrays. 
- In this method, we create two HashSets using given two arrays and then use reatinAll() method of HashSet to retain only common elements from the two sets.
```
class CommonElements
{
    public static void main(String[] args)
    {
        Integer[] i1 = {1, 2, 3, 4, 5, 4};
 
        Integer[] i2 = {3, 4, 5, 6, 7, 4};
 
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1));
 
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2));
 
        set1.retainAll(set2);
 
        System.out.println(set1);     //Output : [3, 4, 5]
    }
}
```

17) What are the different ways of declaring multidimensional arrays in Java?

The following code snippet shows different ways of declaring 2D, 3D and 4D arrays.
```
//2D Arrays
 
int[][] twoDArray1;
 
int twoDArray2[][];
 
int[] twoDArray3[];
 
//3D Arrays
 
int[][][] threeDArray1;
 
int threeDArray2[][][];
 
int[] threeDArray3[][];
 
int[][] threeDArray4[];
 
//4D Arrays
 
int[][][][] fourDArray1;
 
int fourDArray2[][][][];
 
int[] fourDArray3[][][];
 
int[][] fourDArray4[][];
 
int[][][] fourDArray5[];
```

18) While creating the multidimensional arrays, can you specify an array dimension after an empty dimension?

No, you can’t specify an array dimension after an empty dimension while creating multidimensional arrays. It gives compile time error.
```
int[][][] a = new int[][5][];    //Compile time error
 
int[][][] b = new int[5][][5];   //Compile time error
 
int[][][] c = new int[][5][5];   //Compile time error
```

19) How do you search an array for a specific element?

You can search an array to check whether it contains the given element or not using Arrays.binarySearch() method. This method internally uses binary search algorithm to search for an element in an array.

20) What are the different ways to iterate over an array in java?

1) Using normal for loop
```
public class JavaArrayExample
{
    public static void main(String[] args)
    {
        int[] a = new int[]{45, 12, 78, 34, 89, 21};
 
        //Iterating over an array using normal for loop
 
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
```

2) Using for-each loop
```
public class JavaArrayExample
{
    public static void main(String[] args)
    {
        int[] a = new int[]{45, 12, 78, 34, 89, 21};
 
        //Iterating over an array using extended for loop
 
        for (int i : a)
        {
            System.out.println(i);
        }
    }
}
```


21) How do you convert a List or Set to an array?

Using toArray() method.

22) What is the time complexity of different operations on arrays?

| Operations | Time Complexity (Worst Case Scenario) | 
|:--------------: |:--------------:| 
| Modify
(You can’t insert or delete elements once an array is created. What you can do is just change value of an existing element)         | O(1)         | 
| Search | O(n) | 
| Retrieval | O(1) | 


23) What are the main drawbacks of the arrays in Java?

- The main drawback of the arrays is that arrays are of fixed size. 
- You can’t change the size of the array once you create it. 
- Therefore, you must know how many elements you want in an array before creating it. 
- You can’t insert or delete the elements once you create an array. Only you can do is change the value of the elements.
