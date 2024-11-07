# String Question and Answers

1) Is String a keyword in Java?

No. String is not a keyword in Java. String is a final class in java.lang package which is used to represent the set of characters in Java.

2) Is String a primitive type or derived type?

String is a derived type.

3) In how many ways you can create string objects in Java?

There are two ways to create string objects in Java. One is using new operator and another one is using string literals. The objects created using new operator are stored in the heap memory and objects created using string literals are stored in string constant pool.
```
String s1 = new String("abc");          //Creating string object using new operator
 
String s2 = "abc";        //Creating string object using string literal
```

4) What is string constant pool?

String objects are most used data objects in Java. Hence, Java has a special arrangement to store the string objects. String Constant Pool is one such arrangement. String Constant Pool is the memory space in the heap memory specially allocated to store the string objects created using string literals. In String Constant Pool, there will be no two string objects having the same content.

Whenever you create a string object using string literal, JVM first checks the content of the object to be created. If there exist an object in the string constant pool with the same content, then it returns the reference of that object. It doesn’t create a new object. If the content is different from the existing objects then only it creates new object.

5) What is special about string objects as compared to objects of other derived types?

One special thing about string objects is that you can create string objects without using new operator i.e using string literals. This is not possible with other derived types (except wrapper classes). One more special thing about strings is that you can concatenate two string objects using ‘+’. This is the relaxation Java gives to string objects as they will be used most of the time while coding. And also Java provides string constant pool to store the string objects.

6) What do you mean by mutable and immutable objects?

Immutable objects are like constants. You can’t modify them once they are created. They are final in nature. Where as mutable objects are concerned, you can perform modifications on them.

7) Which is the final class in these three classes – String, StringBuffer and StringBuilder?

All three are final.

9) Why StringBuffer and StringBuilder classes are introduced in Java when there already exist String class to represent the set of characters?

The objects of String class are immutable in nature. i.e you can’t modify them once they are created. If you try to modify them, a new object will be created with modified content. This may cause memory and performance issues if you are performing lots of string modifications in your code. To overcome these issues, StingBuffer and StringBuilder classes are introduced in Java.

10) How many objects will be created in the following code and where they will be stored in the memory?
```
String s1 = "abc";
 
String s2 = "abc";
```

11) How do you create mutable string objects in Java?

Using StringBuffer and StringBuilder classes. These classes provide mutable string objects.

12) Which one will you prefer among “==” and equals() method to compare two string objects?

I prefer equals() method because it compares two string objects based on their content. That provides more logical comparison of two string objects. If you use “==” operator, it checks only the references of two objects not their content. It may not be suitable in all situations. So, rather stick to equals() method to compare two string objects.

13) Which class do you recommend among String, StringBuffer and StringBuilder classes if I want mutable and thread safe objects?

StringBuffer

14) How do you convert given string to char array?

Using toCharArray() method.

15) How many objects will be created in the following code and where they will be stored?
```
String s1 = new String("abc");
 
String s2 = "abc";
```
Here, two string objects will be created. Object created using new operator (s1) will be stored in the heap memory. The object created using string literal (s2) is stored in the string constant pool.

16) Where exactly string constant pool is located in the memory?

Inside the heap memory. JVM reserves some part of the heap memory to store string objects created using string literals. 

17) I am performing lots of string concatenation and string modification in my code. which class among string, StringBuffer and StringBuilder improves the performance of my code. Remember I also want thread safe code?

StringBuffer class gives better performance in this scenario. As String class is immutable, if you use this class, a new object will be created after every string concatenation or string modification. This will slow down the code. You can use StringBuilder also, but it is not thread safe. So, StringBuffer will be optimal choice here.

18) What is string intern?

String object in the string constant pool is called as String Intern. You can create an exact copy of heap memory string object in string constant pool. This process of creating an exact copy of heap memory string object in the string constant pool is called interning. intern() method is used for interning.

19) What is the main difference between Java strings and C, C++ strings?

In C and C++, strings are terminated with null character. But in Java, strings are not terminated with null character. Strings are treated as objects in Java.

20) How many objects will be created in the following code and where they will be stored?
```
String s1 = new String("abc");
 
String s2 = new String("abc");
```
Two objects will be created and they will be stored in the heap memory.

21) Can we call String methods using string literals?

Yes, we can call String methods using string literals. Here are some examples,
```
"abc".charAt(0)
 
"abc".compareTo("abc")
 
"abc".indexOf('c')
```

22) Do you have any idea why strings have been made immutable in Java?

a) Immutable strings increase security. As they can’t be modified once they are created, so we can use them to store sensitive data like username, password etc.

b) Immutable strings are thread safe. So, we can use them in a multi threaded code without synchronization.

c) String objects are used in class loading. If strings are mutable, it is possible that wrong class is being loaded as mutable objects are modifiable.

23) What do you think about string constant pool? Why they have provided this pool as we can store string objects in the heap memory itself?

String constant pool increases the reusability of existing string objects. When you are creating a string object using string literal, JVM first checks string constant pool. If that object is available in string constant pool, it returns reference of that object rather than creating a new object. This will speed up your application as only reference is returned. And it also saves the memory as no two objects with same content are created.

24) What is the similarity and difference between String and StringBuffer class?

The main similarity between String and StringBuffer class is that both are thread safe. The main difference between them is that String objects are immutable where as StringBuffer objects are mutable.

25) What is the similarity and difference between StringBuffer and StringBuilder class?

The main similarity between StringBuffer and StringBuilder class is that both produces mutable string objects. The main difference between them is that StringBuffer class is thread safe where as StringBuilder class is not thread safe.

26) What are the new String methods introduced in Java 11?

isBlank(), lines(), repeat(), strip(), stripLeading() and stripTrailing() are the new methods introduced to String class in Java 11. 

27) Can we use strings in switch case?

Yes, from Java 7, strings can be used in switch case.

28) How Java 8 StringJoiner and String.join() method differ from each other?

StringJoiner class internally uses StringBuilder class to join the strings. It is placed in java.util package. Using Java 8 StringJoiner, you can join only the strings, but not the array of strings or list of strings.

String.join() method internally uses StringJoiner class. This method can be used to join strings or array of strings or list of strings, but only with delimiter not with prefix and suffix.

29) Why the strings are the most used objects as keys of HashMap in Java?

As string objects are immutable, their hashcode is cached at the time of object creation. There is no need to calculate it again and again. That’s why the strings are the most used objects as keys of HashMap in Java.

30) What are the text blocks in Java? When they are introduced?

Text blocks are introduced from Java 15 to declare the multi-line string literals without much difficulty. Text blocks are enclosed within “”” (three double quote marks). Text blocks are treated as string objects.


