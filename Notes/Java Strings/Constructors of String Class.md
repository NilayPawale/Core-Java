# Constructors of String, String Literals and Length of String

## Constructors Of java.lang.String Class

The java.lang.String class is a final class. It’s objects are immutable. As they are immutable, they are also thread safe.

There are total 13 constructors in java.lang.String class. It provides many ways to create the string objects. 

Some of the mostly used constructors of String class are:

1) If you want to create an empty string object, then use no-arg constructor of String class.
```
String s = new String();     //It creates a string object without characters in it.
```

2) Below constructor takes character array as an argument.
```
char[] chars = {'J', 'A', 'V', 'A'};     //Character Array
String s = new String(chars);    //Creating a String object by passing character array as an argument
```

3) Below constructor takes string as an argument.
```
String s = new String("JAVA");   //Creating a string object by passing string as an argument
```

4) Below constructor takes StringBuffer type as an argument.
```
StringBuffer strBuff = new StringBuffer("abc");
String s = new String(strBuff);   //Creating a string object by passing StringBuffer type as an argument
```

5) Below constructor takes StringBuilder type as an argument.
```
StringBuilder strBldr = new StringBuilder("abc");
String s = new String(strBldr);   //Creating a string object by passing StringBuilder type as an argument.
```

## String Literals

In Java, all string literals like “java”, “abc”, “123” are treated as objects of java.lang.String class. That means, all methods of String class are also applicable to string literals.
You can also create the objects of String class without using new operator. This can be done by assigning a string literal to reference variable of type java.lang.String class.
```
public class StringExamples
{
    public static void main(String[] args)
    {
        //Creating String objects without using new operator
 
        String s1 = "abc";          
 
        String s2 = "abc"+"def";
 
        String s3 = "123"+"A"+"B";
 
        System.out.println(s1);     //Output : abc
 
        System.out.println(s2);     //Output : abcdef
 
        System.out.println(s3);     //Output : 123AB
    }
}
```

## Finding The Length Of The String

length() method of String class is used to find the length of the string. The length of the string is the number of characters in it.
```
public class StringExamples
{
    public static void main(String[] args)
    {
        String s = new String();                    //Creating an empty string object
        System.out.println(s.length());            //Output : 0
 
        char[] chars = {'J', 'A', 'V', 'A'};
        String s1 = new String(chars);            //Creating string object of 4 characters
        System.out.println(s1.length());         //Output : 4
 
        String s2 = new String(s1+"J2EE");       //Creating string object of 8 characters
        System.out.println(s2.length());        //Output : 8
 
        //Using String.length() method on string literals
 
        System.out.println("abc".length());        //Output : 3
 
        System.out.println("123456".length());     //Output : 6
 
        System.out.println("A".length());          //Output : 1
    }
}
```
