# More Things of Array

1) Size of an array can not be negative
2) Size of an array must be an integer
3) Declaration of an array must be of same type
4) Type of elements of an array must be compatible with type of the array object
5) Array without new operator
6) Declaring multi dimensional arrays
7) Array dimension after an empty dimension
8) Anonymous array
9) Compiler checks only type of the array not the size
10) Size of an array can not be changed

1) Size of an array can not be negative

- The size of an array can not be negative. 
- If you give size of an array as negative, you don’t get any errors while compliing. 
- But, you will get NegativeArraySizeException at run time.
```
public class ArraysInJava
{
    public static void main(String[] args)
    {
        int[] i = new int[-5];   //No Compile Time Error
 
        //You will get java.lang.NegativeArraySizeException at run time
    }
}
```

2) Size of an array must be an integer

- The size of an array must be an integer or an expression which results an integer. 
- Auto-widening is also allowed.
```
public class ArraysInJava
{
    public static void main(String[] args)
    {
        int[] i = new int[10+5];    //Array size can be an expression resulting an integer
 
        int[] i1 = new int[(byte)10];    //byte is auto-widened to int
 
        int i3 = new int[10.25];     //Compile Time Error : size can not be double
    }
}
```

3) Declaration of an array must be of same type

- Declaration and instantiating of an array strictly must be of same type. 
- No auto-widening, auto-boxing and auto-unboxing is allowed. 
- But only auto-upcasting is allowed.
```
public class ArraysInJava
{
    public static void main(String[] args)
    {
        Integer[] I = new int[5];   //Compile Time Error : Auto-Boxing not allowed
 
        int[] i = new Integer[10];   //Compile Time Error : Auto-UnBoxing not allowed
 
        long[] l = new byte[10];    //Compile Time Error : Auto-widening not allowed
 
        Object[] o = new String[10];    //No Compile Time Error : Auto-Upcasting is allowed, String[] is upcasted to Object[]
    }
}
```

4) Type of elements of an array must be compatible with type of the array object

- The type of elements of an array must be compatible with type of the array object. 
- If you try to store non-compatible element in an array object, you will get ArrayStoreException at run time.
```
public class ArraysInJava
{
    public static void main(String[] args)
    {
        Object[] o = new String[10];    //No Compile Time Error : String[] is auto-upcasted to Object[]
 
        //i.e array object of strings can be referred by array reference variable of Object type
 
        o[2] = "java";
 
        o[5] = 20;   //No Compile time error, 
 
        //but you will get java.lang.ArrayStoreException at run time.
    }
}
```

5) Array without new operator

If you are supplying the contents to the array without new operator, then it should be at the time of declaration only. Not at any other places.
```
public class ArraysInJava
{
    public static void main(String[] args)
    {
        int[] i = {1, 2, 3, 4};   //This is the correct way
 
        i = {1, 2, 3 , 4};     //Compile time error
 
        i = new int[]{1, 2, 3, 4};  //This is also correct way
    }
}
```

6) Declaring multi dimensional arrays

Another way of declaring multi dimensional arrays.
```
public class ArraysInJava
{
    public static void main(String[] args)
    {
        int[][] twoDArray;    //Normal way of declaring two-dimensional array
 
        int[] TwoDArray [];   //Another way of declaring two-dimensional array
 
        int[][][] threeDArray;  //Normal way of declaring three-dimensional array
 
        int[] ThreeDArray [][];    //This is also legal
    }
}
```

7) Array dimension after an empty dimension

While creating multi dimensional arrays, you can not specify an array dimension after an empty dimension.
```
public class ArraysInJava
{
    public static void main(String[] args)
    {
        int[][][] threeDArray = new int[10][][10];    //Compile Time Error
 
        int[][][] threeDArray1 = new int[][10][];     //Compile Time Error
 
        int[][][] threeDArray2 = new int[][][10];     //Compile Time Error
    }
}
```

8) Anonymous array

You can create an anonymous array i.e an array without reference.
```
public class ArraysInJava
{
    public static void main(String[] args)
    {
        //Creating anonymous array
 
        System.out.println(new int[]{1, 2, 3}.length);    //Output : 3
 
        System.out.println(new int[]{47, 21, 58, 98}[1]);   //Output : 21
    }
}
```

9) Compiler checks only type of the array not the size

While assigning one array reference variable to another, compiler checks only type of the array not the size.
```
public class ArraysInJava
{
    public static void main(String[] args)
    {
        int[] a = new int[10];
 
        int[] b = new int[100];
 
        double[] c = new double[20];
 
        a = b;
 
        b = c;     //Compile Time Error : can not convert from double[] to int[]
    }
}
```

10) Size of an array can not be changed

- The size of an array can not be changed once you define it. 
- You can not insert or delete array elements after creating an array. 
- Only you can change is the value of the elements. 
- This is the main drawback of arrays.