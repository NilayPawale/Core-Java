# Arrays Class

java.util.Arrays class in java is used to perform some operations like copying, sorting and searching on the arrays.

1) toString() method
2) sort() method
3) binarySearch() method
4) fill() Method
5) copyOf() Method
6) copyOfRange() Method
7) deepToString() Method

## toString() method

- toString() method of Arrays class is used to display all elements of an array. 
- This method returns string representation of all elements of an array. String representation consists of all elements enclosed within “[ ]”. 
- All elements are seperated by “, “(Comma and Space). 

The following example shows usage of toString() method.
```
import java.util.Arrays;
 
public class ArraysClassInJava
{
    public static void main(String[] args)
    {
        //An array of byte
        byte[] b = {10, 20, 30};          
 
        System.out.println(Arrays.toString(b));        //Output : [10, 20, 30]
 
        //An array of short
        short[] s = {40, 50, 60, 70};        
 
        System.out.println(Arrays.toString(s));       //Output : [40, 50, 60, 70]
 
        //An array of int
        int[] i = {12, 21, 42, 68};   
 
        System.out.println(Arrays.toString(i));      //Output : [12, 21, 42, 68]
 
        //An array of long
        long[] l = {100, 110, 120, 130, 140, 150};
 
        System.out.println(Arrays.toString(l));      //Output : [100, 110, 120, 130, 140, 150]
 
        //An array of double
        double[] d = {12.5, 14.9, 87.4, 55.8};
 
        System.out.println(Arrays.toString(d));      //Output : [12.5, 14.9, 87.4, 55.8]
 
        //An array of char
        char[] c = {'A', 'B', 'C', 'D', 'E'};
 
        System.out.println(Arrays.toString(c));     //Output : [A, B, C, D, E]
 
        //An array of boolean
        boolean[] bln = {true, false, false, true};
 
        System.out.println(Arrays.toString(bln));     //Output : [true, false, false, true]
 
        //An array of String
        String[] str = {"java", "concepts", "Arrays", "methods"};
 
        System.out.println(Arrays.toString(str));     //Output : [java, concepts, Arrays, methods]
    }
}
```

## sort() method

- This method sorts elements of an array in ascending order. 
- This method internally uses quick sort algorithm to sort the elements. 

The following example shows usage of sort() method.
```
import java.util.Arrays;
 
public class ArraysClassInJava
{
    public static void main(String[] args)
    {
        //An array of byte
        byte[] b = {51, 22, 8, 37};          
 
        Arrays.sort(b);     //sorts elements of the specified array in ascending order
 
        System.out.println(Arrays.toString(b));        //Output : [8, 22, 37, 51]
 
        //An array of short
        short[] s = {24, 5, 21, 12, 19};
 
        Arrays.sort(s);
 
        System.out.println(Arrays.toString(s));       //Output : [5, 12, 19, 21, 24]
 
        //An array of int
        int[] i = {42, 12, 68, 21};
 
        Arrays.sort(i);
 
        System.out.println(Arrays.toString(i));      //Output : [12, 21, 42, 68]
 
        //An array of long
        long[] l = {879, 412, 258, 985, 856};
 
        Arrays.sort(l);
 
        System.out.println(Arrays.toString(l));      //Output : [258, 412, 856, 879, 985]
 
        //An array of double
        double[] d = {12.5, 87.4, 41.24, 14.9, 55.8};
 
        Arrays.sort(d);
 
        System.out.println(Arrays.toString(d));      //Output : [12.5, 14.9, 41.24, 55.8, 87.4]
 
        //An array of char
        char[] c = {'Z', 'B', 'X', 'L', 'b', 'A'};
 
        Arrays.sort(c);
 
        System.out.println(Arrays.toString(c));     //Output : [A, B, L, X, Z, b]
 
        //An array of String
        String[] str = {"java", "concepts", "Arrays", "methods", "core"};
 
        Arrays.sort(str);
 
        System.out.println(Arrays.toString(str));     //Output : [Arrays, concepts, core, java, methods]
 
        //An array of boolean
        boolean[] bln = {true, false, false, true};
 
        Arrays.sort(bln);   //Compile time error
 
        //Because, there is no sort method in Arrays class which sorts boolean type array
    }
}
```

## binarySearch() method

This method Searches the specified array for the specified value using the binary search algorithm. The array must be sorted before calling this method. If it is not sorted, the results will be undefined.

If the value is found in the array, it returns index of that value in the array. If not found, it returns (-n-1). Where, n is called insertion point. The insertion point is the point at which the specified value would be inserted into the sorted array. For example, it will be the index of the first element greater than the specified value or it will be the length of the array if all elements in the array are less than the specified value.

If the array contains multiple elements same as specified value, there is no guarantee which one will be found.

Note : There is no binarySearch() method in Arrays class which searches for a boolean value in the boolean type of array.

The following example shows usage of binarySearch() method.
```
import java.util.Arrays;
 
public class ArraysClassInJava
{
    public static void main(String[] args)
    {
        //An array of int
        int[] i = {24, 13, 45, 37, 84, 13, 28};
 
        //Sorting the int array
        Arrays.sort(i);
 
        //Printing sorted array
        System.out.println(Arrays.toString(i));       //Output : [13, 13, 24, 28, 37, 45, 84]
 
        //Searching the value
        System.out.println(Arrays.binarySearch(i, 37));  //Output : 4
 
        System.out.println(Arrays.binarySearch(i, 13));  //Output : 1
 
        System.out.println(Arrays.binarySearch(i, 55));     //Output : -7
 
        //An array of char
        char[] c = {'X', 'n', 'F', 's', 'D', 'J', 'j', 'F'};
 
        //Sorting the char array
        Arrays.sort(c);
 
        //Printing Sorted array
        System.out.println(Arrays.toString(c));      //Output : [D, F, F, J, X, j, n, s]
 
        //Searching the character
        System.out.println(Arrays.binarySearch(c, 'F'));     //Output : 1
 
        System.out.println(Arrays.binarySearch(c, 'J'));     //Output : 3
 
        System.out.println(Arrays.binarySearch(c, 'Z'));     //Output : -6
 
        //An array of String
        String[] str = {"First", "second", "Third", "second", "Four", "fifth"};
 
        //Sorting the String array
        Arrays.sort(str);
 
        //Printing Sorted array
        System.out.println(Arrays.toString(str));       //Output : [First, Four, Third, fifth, second, second]
 
        //Searching the string in the array
        System.out.println(Arrays.binarySearch(str, "Third"));    //Output : 2
 
        System.out.println(Arrays.binarySearch(str, "second"));   //Output : 4
 
        System.out.println(Arrays.binarySearch(str, "sixth"));    //Output : -7
    }
}
```

## fill() Method 

- This method assigns specified value to each element of an array. 
- This method is useful in initializing all elements of an array with one value. 

The following example shows usage of fill() method.
```
import java.util.Arrays;
 
public class ArraysClassInJava
{
    public static void main(String[] args)
    {
        //An array of int
        int[] i = new int[5];
 
        Arrays.fill(i, 10);    //Assigns 10 to each element of the array
 
        System.out.println(Arrays.toString(i));   //Output : [10, 10, 10, 10, 10]
 
        //An array of double
        double[] d = {12.5, 14.8, 45.9, 23.5};
 
        Arrays.fill(d, 53.6);    //Assigns 53.6 to each element of the array
 
        System.out.println(Arrays.toString(d));   //Output : [53.6, 53.6, 53.6, 53.6]
 
        //An array of boolean
        boolean[] bln = new boolean[5];
 
        Arrays.fill(bln, true);     //Assigns true to each element of the array
 
        System.out.println(Arrays.toString(bln));     //Output : [true, true, true, true, true]
 
        //An array of char
        char[] c = new char[10];
 
        Arrays.fill(c, 'P');    //Assigns P to each element of the array
 
        System.out.println(Arrays.toString(c));     //Output : [P, P, P, P, P, P, P, P, P, P]
 
        //An array of String
        String[] str = {"Java", "Concepts", "basic java", "Arrays Class"};
 
        Arrays.fill(str, "value");    //Assigns value to each element of the array
 
        System.out.println(Arrays.toString(str));     //Output : [value, value, value, value]
    }
}
```

## copyOf() Method 

- This method copies the specified array into new array of same type. 
- While copying, the new array may be truncated or padded with default values so that it has the specified length.
```
import java.util.Arrays;
 
public class ArraysClassInJava
{
    public static void main(String[] args)
    {
        //An array of int
        int[] i = {1, 21, 15, 48, 79};
 
        //Copying array i into array i1
        int[] i1 = Arrays.copyOf(i, 10);
 
        System.out.println(Arrays.toString(i1));   //Output : [1, 21, 15, 48, 79, 0, 0, 0, 0, 0]
 
        //An array of double
        double[] d = {12.5, 45.8, 56.2, 47.9, 23.6, 89.5};
 
        //Copying array d into array d1
        double[] d1 = Arrays.copyOf(d, 4);
 
        System.out.println(Arrays.toString(d1));    //Output : [12.5, 45.8, 56.2, 47.9]
 
        //An array of boolean
        boolean[] bln = {true, false, true, true, false};
 
        //Copying array bln into array bln1
        boolean[] bln1 = Arrays.copyOf(bln, 10);
 
        System.out.println(Arrays.toString(bln1));    //Output : [true, false, true, true, false, false, false, false, false, false]
 
        //An array of char
        char[] c = {'X', 'B', 'Z', 'H', 'I', 'J'};
 
        //Copying array c into array c1
        char[] c1 = Arrays.copyOf(c, 5);
 
        System.out.println(Arrays.toString(c1));    //Output : [X, B, Z, H, I]  
 
        //An array of String
        String[] str = {"java", "j2ee", "struts", "hibernate"};
 
        //Copying array str into array str1
        String[] str1 = Arrays.copyOf(str, 7);
 
        System.out.println(Arrays.toString(str1));
    }
}
```

## copyOfRange() Method

- This method is used to copy some part of an array into another array of same type. 
- While copying the new array may be truncated or padded with default values to obtain the required length.
```
import java.util.Arrays;
 
public class ArraysClassInJava
{
    public static void main(String[] args)
    {
        //An array of int
        int[] i = {1, 21, 15, 48, 79};
 
        //Copying some part of array i into array i1
        int[] i1 = Arrays.copyOfRange(i, 2, 7);
 
        System.out.println(Arrays.toString(i1));   //Output : [15, 48, 79, 0, 0]
 
        //An array of double
        double[] d = {12.5, 45.8, 56.2, 47.9, 23.6, 89.5};
 
        //Copying some part of array d into array d1
        double[] d1 = Arrays.copyOfRange(d, 2, 5);
 
        System.out.println(Arrays.toString(d1));    //Output : [56.2, 47.9, 23.6]
 
        //An array of boolean
        boolean[] bln = {true, false, true, true, false};
 
        //Copying some part of array bln into array bln1
        boolean[] bln1 = Arrays.copyOfRange(bln, 1, 8);
 
        System.out.println(Arrays.toString(bln1));    //Output : [false, true, true, false, false, false, false]
 
        //An array of char
        char[] c = {'X', 'B', 'Z', 'H', 'I', 'J'};
 
        //Copying some part of array c into array c1
        char[] c1 = Arrays.copyOfRange(c, 2, 4);
 
        System.out.println(Arrays.toString(c1));    //Output : [Z, H]  
 
        //An array of String
        String[] str = {"java", "j2ee", "struts", "hibernate"};
 
        //Copying some part of array str into array str1
        String[] str1 = Arrays.copyOfRange(str, 4, 8);
 
        System.out.println(Arrays.toString(str1));   //Output : [null, null, null, null]
    }
}
```

## deepToString() Method

- Arrays.deepToString() method is used to get the string representation of multidimensional arrays. 
- This method returns the deep contents of the specified array. 
- If the specified array contains other arrays as it’s elements then it returns the contents of those arrays also.

Below example shows how to use deepToString() method to print the contents of the multidimensional arrays.
```
public class MainClass
{
    public static void main(String[] args)
    {
        //One Dimensional Array
 
        String[] oneDArray = new String[] {"ONE", "TWO", "THREE", "FOUR", "FIVE"};
 
        System.out.println("One Dimensional Array : ");
 
        //Printing one dimensional array contents using deepToString() method
 
        System.out.println(Arrays.deepToString(oneDArray));
 
        //Two Dimensional Array
 
        String[][] twoDArray = new String[][] {
                                                    {"ONE", "TWO", "THREE", "FOUR"},
                                                    {"FIVE", "SIX", "SEVEN"},
                                                    {"EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE"}
                                                };
 
        System.out.println("Two Dimensional Array : ");
 
        //Printing two dimensional array contents using deepToString() method
 
        System.out.println(Arrays.deepToString(twoDArray));
 
        //Three Dimensional Array
 
        String[][][] threeDArray = new String[][][] {
                                                        {
                                                            {"ONE", "TWO", "THREE"},
                                                            {"FOUR", "FIVE", "SIX", "SEVEN"}
                                                        },
                                                        {
                                                            {"EIGHT", "NINE", "TEN", "ELEVEN"},
                                                            {"TWELVE", "THIRTEEN", "FOURTEEN"}
                                                        },
                                                        {
                                                            {"FIFTEEN", "SIXTEEN"} ,
                                                            {"SEVENTEEN", "EIGHTEEN", "NINETEEN"},
                                                            {"TWENTY", "TWENTY ONE"}
                                                        }
                                                    };
 
        System.out.println("Three Dimensional Array : ");
 
        //Printing three dimensional array contents using deepToString() method
 
        System.out.println(Arrays.deepToString(threeDArray));
    }
}
```

Output :
```
One Dimensional Array :
[ONE, TWO, THREE, FOUR, FIVE]

Two Dimensional Array :
[[ONE, TWO, THREE, FOUR], [FIVE, SIX, SEVEN], [EIGHT, NINE, TEN, ELEVEN, TWELVE]]

Three Dimensional Array :
[[[ONE, TWO, THREE], [FOUR, FIVE, SIX, SEVEN]], [[EIGHT, NINE, TEN, ELEVEN], [TWELVE, THIRTEEN, FOURTEEN]], [[FIFTEEN, SIXTEEN], [SEVENTEEN, EIGHTEEN, NINETEEN], [TWENTY, TWENTY ONE]]]
```
- If you want to print the contents of one dimensional arrays, then use Arrays.toString() method or normal for loop or enhanced for loop. You can also use Arrays.deepToString() method to print the contents of one dimensional arrays. 
- If you want to print the contents of multidimensional arrays, instead of nesting multiple for loops, use Arrays.deepToString() method. It is the easiest method to print the contents of multidimensional arrays.