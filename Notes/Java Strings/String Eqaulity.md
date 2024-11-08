# String Equality

## When To Use “==”, equals() And hashCode() On Strings

“==” operator, equals() method and hashcode() methods are used to check the equality of any type of objects in Java.

## “==” operator

- “==” operator compares the two objects on their physical address. 
- That means if two references are pointing to same object in the memory, then comparing those two references using “==” operator will return true. 
- For example, if s1 and s2 are two references pointing to same object in the memory, then invoking s1 == s2 will return true. 
- This type of comparison is called “Shallow Comparison”.

## equals() method

- equals() method, if not overrided, will perform same comparison as “==” operator does i.e comparing the objects on their physical address. 
- So, it is always recommended that you should override equals() method in your class so that it provides field by field comparison of two objects. 
- This type of comparison is called “Deep Comparison”.
- In java.lang.String class, equals() method is overrided to provide the comparison of two string objects based on their contents. 
- That means, any two string objects having same content will be equal according to equals() method. 
- For example, if s1 and s2 are two string objects having the same content, then invoking s1.equals(s2) will return true.


## hashCode() method

- hashCode() method returns hash code value of an object in the Integer form. 
- It is recommended that whenever you override equals() method, you should also override hashCode() method so that two equal objects according to equals() method must return same hash code values. 
- This is the general contract between equals() and hashCode() methods that must be maintained all the time.
- In java.lang.String class, hashCode() method is also overrided so that two equal string objects according to equals() method will return same hash code values. 
- That means, if s1 and s2 are two equal string objects according to equals() method, then invoking s1.hashCode() == s2.hashCode() will return true.

Let's see these Methods with Example.

Define two string objects like below,
```
String s1 = "JAVA";
 
String s2 = "JAVA";
```
Now apply above methods on these two objects.

- s1 == s2 —> will return true as both are pointing to same object in the constant pool.
- s1.equals(s2) —> will also return true as both are referring to same object.
- s1.hashCode() == s2.hashCode() —> It also returns true.

This type of comparison is straight forward. There is no speculation about this comparison. Let’s define the string objects like below,
```
String s1 = new String("JAVA");
 
String s2 = new String("JAVA");
```

- s1 == s2 —> will return false because s1 and s2 are referring to two different objects in the memory.
- s1.equals(s2) —> will return true as both the objects have same content.
- s1.hashCode() == s2.hashCode() —> It will also return true because two equals string objects according to equals() method will have same hash code values.

Comparing the string objects defined like below will also give same result as the above.
```
String s1 = "JAVA";
 
String s2 = new String("JAVA");
```

- s1 == s2 —> will return false because s1 and s2 are referring to two different objects in the memory.
- s1.equals(s2) —> will return true as both the objects have same content.
- s1.hashCode() == s2.hashCode() —> It will also return true.

Now, you may conclude that If there is a requirement of comparing two string objects on their physical address, then use “==” operator and if there is a requirement of comparing two string objects on their contents, then use equals() method or hashCode() method.

But before concluding, compare these two string objects.
```
String s1 = "0-42L";
 
String s2 = "0-43-";
```

- s1 == s2 —> will return false as s1 and s2 are referring to two different objects in the memory. (As Expected)
- s1.equals(s2) —> It will also return false as both the objects have different content. (As Expected)
- s1.hashCode() == s2.hashCode() —> It will return true. (Why True ?)

This is because, two unequal string objects according to equals() method may have same hash code values. Therefore, it is recommended not to use hashCode() method to compare two string objects. You may not get expected result.

## Conclusion

- When you want to check the equality of two string objects on their physical existence in the memory, then use “==” operator. 
- If you want to check the equality of two string objects depending upon their contents, then use equals() method. 
- It is recommended not to use hashCode() method to check the equality of two string objects. You may get unexpected result.