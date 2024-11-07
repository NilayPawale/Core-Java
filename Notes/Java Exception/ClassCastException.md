# ClassCastException in Java

- ClassCastException in java is a run time exception it occurs when an object can not be casted to another type.
- A ClassCastException in Java occurs when you try to cast an object to a subclass or type it isn’t an instance of. 
- It happens when you incorrectly tell the program, “Hey, treat this object as if it's another type,” but Java realizes it's not actually that type, so it throws an error.

- An object is automatically upcasted to its super class type. 
- You need not to mention class type explicitly. 
- But, when an object is supposed to be downcasted to its sub class type, then you have to mention class type explicitly. 
- In such case, there is a possibility of occurring class cast exception. 
- In most of time, it occurs when you are trying to downcast an object explicitly to its sub class type.

```
package com;
class A
{
    int i = 10;
}
 
class B extends A
{
    int j = 20;
}
 
class C extends B
{
    int k = 30;
}
 
public class ClassCastExceptionDemo
{
    public static void main(String[] args)
    {
        A a = new B();   //B type is auto up casted to A type
        B b = (B) a;     //A type is explicitly down casted to B type.
        C c = (C) b;    //Here, you will get class cast exception
        System.out.println(c.k);
    }
}
```

- You will get ClassCastException. Below is the sample of the error.
```
Exception in thread “main” java.lang.ClassCastException: com.B cannot be cast to com.C
at com.ClassCastExceptionDemo.main(ClassCastExceptionDemo.java:23)
```

- In the above example, Class B extends Class A and Class C extends Class B. 
- In the main method, Class B-type object is created (Line 21). 
- It will be having two non-static fields. one field (int i) is inherited from class A and another one is its own field (int j). 
- ‘a’ is Class A-type reference variable which will be pointing to this newly created object. 
- In the next statement (Line 22), reference variable ‘a’ is assigned to ‘b’ which is Class B-type reference variable. 
- After execution of this statement, ‘b’ will also be pointing to the same object to which ‘a’ is pointing. 
- In the third statement, ‘b’ is assigned to ‘c’ which is Class C-type reference variable. 
- So, ‘c’ will also be pointing to same object to which ‘a’ and ‘b’ are pointing. While executing this statement, you will get run time exception called Class Cast Exception.

## Why you get this exception ?

- Every sub class extends its super class. i.e every child class will have some additional properties along with some inherited properties from its parent class. 
- In the above example, Class A has one property (int i). 
- Class B has two properties, one is it’s own and another one is inherited. 
- Class C has three properties. one is it’s own and two are inherited. 
- In this example, Class C-type reference variable is referring to Class B-type object. 
- Class B-type object will be having only two properties. 
- But, through Class C-type reference variable, you can access Class C’s own property (int k) like in the line 24. 
- But, actually this property does not exist in Class B-type object. 
- This creates the confusion. Class B-type can not be casted to Class C-type. 
- That’s why, you will get class cast exception.

- Put ClassCastException in simple terms. 
- ClassCastException occurs when code has attempted to cast an object to a type of which it is not an object. 
- In the above example, Class B is a Class A type but Class B is not a Class C type. 
- Therefore, you are getting ClassCastException.

- Consider one more case of ClassCastException.
```
public class ClassCastExceptionDemo
{
    public static void main(String[] args)
    {
        Object o = new String();
        Integer i = (Integer) o;
    }
}
```

- We all know that every class in java is a sub class of java.lang.Object class. 
- String is also a subclass of Obeject class and Integer is also a subclass of Object class. 
- In the above example, String object is created and it is automatically up casted to Object type. 
- Further, this object is explicitly downcasted to Integer type.
-  This causes ClassCastException, because, String object is not an Integer type.