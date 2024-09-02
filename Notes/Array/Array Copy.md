# Copying an Array

Consider the following program
```
public class ArraysInJava
{
    public static void main(String[] args)
    {
        int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
 
        int[] b = a;             //copying array 'a' to array 'b'
 
        //Printing elements of array 'b'
 
        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
 
        a[2] = 56;     //Changing value of 3rd element of array 'a'
 
        System.out.println(b[2]);    //value of 3rd element of array 'b' also changes
 
        b[4] = 100;     //Changing value of 5th element of array 'b'
 
        System.out.println(a[4]);     //value of 5th element of array 'a' also changes
    }
}
```
- In the above example, we are defining an array of ints. 
- We are copying that array to another array of ints. 
- You can notice that changing the value of one array will be reflected in another array also. 
- That means, both the array variables(a and b) are pointing to same object in the memory. 

This can be illustrated using diagram as below,

![alt text](image-2.png)


If you copy an array using above method, changes made in one array will be reflected in other. Normally, you don’t want such behaviour in real time. You may need two different array objects with same set of elements. 
In such scenarios, Instead of using the above method, use any one of the following methods.

## Copying An Array Using for Loop 

The following example shows how to copy an array using for-loop.
```
public class ArraysInJava
{
    public static void main(String[] args)
    {
        int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
 
        int[] b = new int[a.length];             //Declaring and instantiating another array of ints with same length
 
        for (int i = 0; i < a.length; i++)
        {
            b[i] = a[i];
        }
 
        //Now changing values of one array will not reflect in another array
 
        a[2] = 56;       //Changing value of 3rd element in array 'a'
 
        System.out.println(b[2]);    //value of 3rd element in array 'b' will not change
 
        b[4] = 100;     //Changing value of 5th element in array 'b'
 
        System.out.println(a[4]);    //value of 5th element in array 'a' will not change
    }
}
```

## Copying An Array Using copyOf() Method of java.util.Array Class
```
public class ArraysInJava
{
    public static void main(String[] args)
    {
        int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
 
        //creating a copy of array 'a' using copyOf() method of java.util.Arrays class
 
        int[] b = Arrays.copyOf(a, a.length);  
 
        //Printing elements of array 'b'
 
        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
 
        //Now changing values of one array will not reflect in other array
 
        a[2] = 56;       //Changing value of 3rd element in array 'a'
 
        System.out.println(b[2]);    //value of 3rd element in array 'b' will not change
 
        b[4] = 100;     //Changing value of 5th element in array 'b'
 
        System.out.println(a[4]);    //value of 5th element in array 'a' will not change
    }
}
```

## Copying An Array Using clone() Method

All arrays will have clone() method inherited from java.lang.Object class. Using this method, you can copy an array.

```
public class ArraysInJava
{
    public static void main(String[] args)
    {
        int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
 
        //creating a copy of array 'a' using clone() method
 
        int[] b = a.clone();  
 
        //Printing elements of array 'b'
 
        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
 
        //Now changing values of one array will not reflect in other array
 
        a[2] = 56;       //Changing value of 3rd element in array 'a'
 
        System.out.println(b[2]);    //value of 3rd element in array 'b' will not change
 
        b[4] = 100;     //Changing value of 5th element in array 'b'
 
        System.out.println(a[4]);    //value of 5th element in array 'a' will not change
    }
}
```

## Copying An Array Using arraycopy() Method Of System Class
```
public class ArraysInJava
{
    public static void main(String[] args)
    {
        int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
 
        //Creating an array object of same length as array 'a'
 
        int[] b = new int[a.length];
 
        //creating a copy of array 'a' using arraycopy() method of System class
 
        System.arraycopy(a, 0, b, 0, a.length);
 
        //Printing elements of array 'b'
 
        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
 
        //Now changing values of one array will not reflect in other array
 
        a[2] = 56;       //Changing value of 3rd element in array 'a'
 
        System.out.println(b[2]);    //value of 3rd element in array 'b' will not change
 
        b[4] = 100;     //Changing value of 5th element in array 'b'
 
        System.out.println(a[4]);    //value of 5th element in array 'a' will not change
    }
}
```

Using arraycopy() method of System class, you can copy a part of an array into another array.
