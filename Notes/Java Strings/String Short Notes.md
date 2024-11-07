# String Short Notes

1) Strings in Java are most used data types while developing any kind of applications. Hence, strings are treated as very special in Java. 

2) In Java, you can create string objects in two ways. One is using new operator and another one is using string literals.
```
String s1 = "abc";        //Creating string object using string literal
 
String s2 = new String("abc");          //Creating string object using new operator
```
3) String objects created using string literals are stored in String Constant Pool and string objects created using new operator are stored in the heap memory. 

4) What Is String Constant Pool?

- String objects are most used data objects in Java. Hence, Java has a special arrangement to store the string objects. String Constant Pool is one such arrangement. 
- String Constant Pool is the memory space in the heap memory specially allocated to store the string objects created using string literals. 
- In String Constant Pool, there will be no two string objects having the same content.
- Whenever you create a string object using string literal, JVM first checks the content of the object to be created. 
- If there exist an object in the string constant pool with the same content, then it returns the reference of that object. It doesn’t create a new object. 
- If the content is different from the existing objects then only it creates new object.

5) String is a derived type, not a primitive type like int, double etc. Strings are objects in Java.

6) String objects in Java are immutable. That means, once you create String objects, you can’t modify them. If you try to modify them, a new object will be created with modifications.

7) To overcome the immutability of String objects, two more classes are introduced in Java. They are StringBuffer and StringBuilder classes. Objects of StringBuffer and StringBuilder class are mutable.

8) All three classes – String, StringBuffer and StringBuilder are final. That means you can’t extend them. All three classes are members of java.lang package.

9) In all three classes – String, StringBuffer and StringBuilder, toString() method is overridden. That means, whenever you use references to objects of these classes, actual content of those objects will be retrieved.

10) equals() and hashCode() methods are overridden in String class but they are not overridden in StringBuffer and StringBuilder classes.

11) String and StringBuffer objects are thread safety where as StringBuilder objects are not thread safety.

12) Using “==“, equals() and hashCode() on String objects.

- All three – “==”, equals() and hashCode() are used to check the equality of two string objects. 
- If you want to check the equality of two string objects based on their physical address, then use “==” operator. 
- If you want to check the equality of two string objects based on their content, then use equals() method. 
- It is recommended not to use hashCode() method to compare the string objects. You may get unexpected results. 

13) Strings in Java are backed by character array. You can retrieve this array using toCharArray() method of String class.

14) If you are performing lots of string concatenation in your code, then use either StringBuffer or StringBuilder classes. These two classes give better performance than String class. 

15) Java doesn’t support operator overloading except ‘+‘ operator. ‘+‘ can be used for number addition as well as to concatenate two string objects. This is the special treatment given by the Java to string objects.

16) Java provides 4 methods to compare the strings.

1) equals() – This method returns true if contents of two string objects are same.
2) equalsIgnoreCase() – This method compares two string objects but ignores the case of the characters when comparing.
3) compareTo() – This method compares one string with another and returns an integer if the string is smaller or equal or greater than the other string.
4) compareToIgnoreCase() – This method is same as compareTo() but ignores the case of the characters when comparing.

17) You need not to create objects to access the String class methods. You can do so using string literals also. Look at the below example.
```
public class MainClass
{
    public static void main(String[] args)
    {
        System.out.println("abc".charAt(0));          //Output : a
 
        System.out.println("abc".equalsIgnoreCase("ABC"));      //Output : true
 
        System.out.println("abc".compareTo("abc"));         //Output : 0
 
        System.out.println("abc".indexOf('c'));        //Output : 2
    }
}
```

18) What Is String Intern?

- String object in the string constant pool is called as String Intern. 
- You can create an exact copy of heap memory string object in the string constant pool. 
- This process of creating an exact copy of heap memory string object in string constant pool is called interning. intern() method is used for interning.

19) indexOf(), lastIndexOf() and matches(String regex) are the methods to perform search within a string.

20) Unlike in C and C++, Strings in Java are not terminated with null character. Strings are treated as objects in Java.