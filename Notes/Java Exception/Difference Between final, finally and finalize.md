# Difference Between final, finally and finalize in Java

## final keyword

- final is a keyword which is used to make a variable or a method or a class as “unchangeable“. 
- In simple terms,

1) A variable which is declared as final, it’s value can not be changed once it is initialized.
```
final int i = 10;    //final variable
 
i = 20;      //Compile time error, Value can not be changed
```

2) A method declared as final can not be overridden or modified in the sub class.
```
class SuperClass
{
    final void methodOfSuperClass()
    {
        System.out.println("final Method");
    }
}
 
class SubClass extends SuperClass
{
    void methodOfSuperClass()
    {
        //Compile time error, final method can not be overridden.
    }
}
```

3) A class declared as final can not be extended.
```
final class SuperClass
{
    //final class
}
 
class SubClass extends SuperClass
{
    //Compile time error, can not create a sub class to final class
}
```

## finally Block

- finally is a block which is used for exception handling along with try and catch blocks. 
- finally block is always executed whether exception is raised or not and raised exception is handled or not. 
- finally block ALWAYS survives(except System.exit(0) i.e terminating JVM)
i.e in the presence or absence of exceptions.
- Most of time, this block is used to close the resources like database connection, I/O resources etc.
```
try
{
    //checking the code for exceptions
}
catch(Exception ex)
{
    //Catching the exceptions
}
finally
{
    //This block is always executed
}
```

## finalize() Method

- finalize() method is a protected method of java.lang.Object class. 
- It is inherited to every class you create in java. 
- This method is called by garbage collector thread before an object is removed from the memory. 
- finalize() method is used to perform some clean up operations on an object before it is removed from the memory.
```
protected void finalize() throws Throwable
{
    //Clean up operations
}
```

## finally Vs finalize()

- But, there is one similarity between finally block and finalize() method. 
- Both are used to close the resources used by the program. 
- finally block is used to close the resources soon after their use. 
- finalize() method is used to close the resources before an object is removed from the memory. 
- That means if you use finalize() method to close the resources, they will remain open until an object, which is using them, is garbage collected.

- But, using finalize() method to close the resources is less recommended as it is not guaranteed that garbage collector will always call finalize() method on an object before it is removed from the memory. 
- If it is not called, the resources will remain open. 
- Therefore, it is always good to close the resources soon after their use using finally block.
```
try
{
    //Open the resources
 
    //Use the resources
}
catch(Exception ex)
{
    //Catching the exceptions raised in the try block
}
finally
{
    //Close the resources here only
}
```