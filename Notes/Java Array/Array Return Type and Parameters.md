# Array Return Type and Parameters

- Arrays can be passed to method as arguments and methods can return an array. 
- Arrays are Passed-By-Reference. 
- That means, When an array is passed to a method, reference of an array object is passed not the copy of the object. So, Any changes made to object in the method will be reflected in the actual object.

## Passing Array Of Primitive Type As A Parameter to The Method

```
public class ArraysInJava
{
    public static void main(String[] args)
    {
        //declaring and creating An array object of double type containing 8 elements
 
        double[] d = new double[8];   
 
        d[2] = 10.25;   //Changing the value of element at index 2
 
        d[5] = 15.35;   //Changing the value of element at index 5
 
        methodOne(d);   //Passing array to methodOne()
 
        //Changes made to array object in the method are reflected in the actual object
 
        System.out.println(d[2]);     //Output : 25.32
 
        System.out.println(d[5]);     //Output : 45.89
    }
 
    static void methodOne(double[] d)
    {
        d[2] = 25.32;   //Changing the value of element at index 2
 
        d[5] = 45.89;   //Changing the value of element at index 5
    }
}
```

## Passing Array Of Derived Type As A Parameter to The Method 

```
class A
{
    int i;
}
 
public class ArraysInJava
{
    public static void main(String[] args)
    {
        //declaring and creating An array object of A-type containing 8 references to A-type objects
 
        A[] a = new A[8];   
 
        a[2] = new A();   //creating A-type object and assigning it to element at index 2
 
        a[5] = new A();   //creating A-type object and assigning it to element at index 5
 
        a[2].i = 10;     //Changing value of field of A-type object referred by element at index 2
 
        a[5].i = 20;     //Changing value of field of A-type object referred by element at index 5
 
        methodOne(a);   //Passing array to methodOne()
 
        //Changes made to array object in the method are reflected here
 
        System.out.println(a[2].i);     //Output : 30
 
        System.out.println(a[5].i);     //Output : 40
    }
 
    static void methodOne(A[] a)
    {
        a[2].i = 30;   //Changing value of field of A-type object referred by element at index 2
 
        a[5].i = 40;   //Changing value of field of A-type object referred by element at index 5
    }
}
```

## Method Returning An Array Of Primitive Type

```
public class ArraysInJava
{
    public static void main(String[] args)
    {
        int[] a = methodOne();     
 
        System.out.println(a[2]);     //Output : 10
 
        System.out.println(a[5]);     //Output : 20
    }
 
    //Method returns an array of int type
 
    static int[] methodOne()
    {
        //declaring and creating An array object of int type containing 8 elements
 
        int[] a = new int[8];   
 
        a[2] = 10;   //Changing value of element at index 2
 
        a[5] = 20;   //Changing value of element at index 5
 
        return a;
    }
}
```

## Method Returrning An Array Of Derived Type

```
class A
{
    int i;
}
 
public class ArraysInJava
{
    public static void main(String[] args)
    {
        A[] a = methodOne();     
 
        System.out.println(a[2].i);     //Output : 10
 
        System.out.println(a[5].i);     //Output : 20
    }
 
    //Method returns an array of A-type
 
    static A[] methodOne()
    {
        //declaring and creating An array object of A-type containing 8 references to A-type objects
 
        A[] a = new A[8];   
 
        a[2] = new A();   //creating A-type object and assigning it to element at index 2
 
        a[5] = new A();   //creating A-type object and assigning it to element at index 5
 
        a[2].i = 10;   //Changing value of field of A-type object referred by element at index 2
 
        a[5].i = 20;   //Changing value of field of A-type object referred by element at index 5
 
        return a;
    }
}
```