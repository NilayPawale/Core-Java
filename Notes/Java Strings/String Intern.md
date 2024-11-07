# String Intern

String objects in java are stored in two places in memory. 
- One is String Constant Pool and another one is Heap Memory. 
- String objects created using string literals are stored in String Constant Pool where as string objects created using new operator are stored in heap memory.

## Why You Need String Constant Pool ? 

String objects are most used objects in the development of any kind of applications. Therefore, there has to be a special arrangement to store these objects. String Constant Pool is one such special arrangement. In string constant pool, there will be no two objects with the same content. Heap memory can have any number of objects with same content.

Just imagine creating 1000 string objects with same content in heap memory and one string object with that content in String Constant Pool. Which one saves the memory?. which one will save the time?. Which one will be accessed faster?. It is, of course, String Constant Pool. That’s why you need String Constant Pool.

## What Is String Intern ?

String intern or simply intern refers to string object in the String Constant Pool. Interning is the process of creating a string object in String Constant Pool which will be exact copy of string object in heap memory.

## intern() Method

- intern() method of java.lang.String class is used to perform interning i.e creating an exact copy of heap string object in string constant pool. 
- When you call this method on a string object, first it checks whether there exist an object with the same content in the String Constant Pool. 
- If object does not exist in the pool, it will create an object with the same content in the string constant pool and returns the reference of that object. 
- If object exist in the pool than it returns reference of that object without creating a new object.

Look at the below example. 
- Object ‘s1’ will be created in heap memory as we are using new operator to create it. 
- When we call intern() method on s1, it creates a new string object in the string constant pool with “JAVA” as it’s content and assigns it’s reference to s2. 
- So, s1 == s2 will return false because they are two different objects in the memory and s1.equals(s2) will return true because they have same content.
```
public class StringExamples
{
    public static void main(String[] args)
    {
        String s1 = new String("JAVA");
 
        String s2 = s1.intern();       //Creating String Intern
 
        System.out.println(s1 == s2);       //Output : false
 
        System.out.println(s1.equals(s2));    //Output : true
    }
}
```

Look at this example. 
- Object s1 will be created in string constant pool as we are using string literal to create it and object s2 will be created in heap memory as we are using new operator to create it. 
- When you call intern() method on s2, it returns reference of object to which s1 is pointing as it’s content is same as s2. 
- It does not create a new object in the pool. So, S1 == s3 will return true as both are pointing to same object in the pool.
```
public class StringExamples
{
    public static void main(String[] args)
    {
        String s1 = "JAVA";
 
        String s2 = new String("JAVA");
 
        String s3 = s2.intern();       //Creating String Intern
 
        System.out.println(s1 == s3);       //Output : true
    }
}
```

## String Literals Are Automatically Interned

When you call intern() on the string object created using string literals it returns reference of itself. Because, you can’t have two string objects in the pool with same content. That means string literals are automatically interned in java.
```
public class StringExamples
{
    public static void main(String[] args)
    {
        String s1 = "JAVA";
 
        String s2 = s1.intern();       //Creating String Intern
 
        System.out.println(s1 == s2);       //Output : true
    }
}
```

## What is the use of interning the string?

### To Save The memory Space :

Using interned string, you can save the memory space. If you are using lots of string objects with same content in your code, than it is better to create an intern of that string in the pool. Use that intern string whenever you need it instead of creating a new object in the heap. It saves the memory space.

### For Faster Comparison :

Assume that there are two string objects s1 and s2 in heap memory and you need to perform comparison of these two objects more often in your code. Then using s1.intern() == s2.intern() will be more fast then s1.equals(s2). Because, equals() method performs character by character comparison where as “==” operator just compares references of objects.