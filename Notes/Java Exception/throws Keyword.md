# throws Keyword in Java

- If a method is capable of throwing an exception that it could not handle, then it should specify that exception using throws keyword. 
- It helps the callers of that method in handling that exception. 
- "throws" keyword is used for delegating exception handling to the caller.
- The syntax for using throws keyword is,
```
return_type method_name(parameter_list) throws exception_list
{
     //some statements
}
```
- where, exception_list is the list of exceptions that method may throw. 

```
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            methodWithThrows();
        }
        catch(NullPointerException ex)
        {
            System.out.println("NullPointerException thrown by methodWithThrows() method will be caught here");
        }
    }
 
    static void methodWithThrows() throws NullPointerException
    {
        String s = null;
        System.out.println(s.length());   //This statement throws NullPointerException
    }
}
```

## Important Points of throws Keyword

1) Multiple exceptions can be declared using throws keyword separated by commas.

```
public class ExceptionHandling {
    static void methodWithThrows() throws NumberFormatException, NullPointerException {
        int i = Integer.parseInt("abc");   // This statement throws NumberFormatException

        String s = null;

        System.out.println(s.length());    // This statement throws NullPointerException
    }

    public static void main(String[] args) {
        try 
        {
            methodWithThrows();
        } 
        catch (Exception ex) 
        {
            System.out.println("This block can handle all types of exceptions");
        }
    }
}

```

2) The main use of throws keyword in java is that an exception can be propagated through method calls.

```
public class ExceptionHandling
{
    static void methodOne() throws NumberFormatException
    {
        int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
    }
 
    static void methodTwo() throws NumberFormatException
    {
        methodOne();     //NumberFormatException is propagated here
    }
 
    static void methodThree() throws NumberFormatException
    {
        methodTwo();    //NumberFormatException is propagated here
    }
 
    public static void main(String[] args)
    {
        try
        {
            methodThree();
        }
        catch(NumberFormatException ex)
        {
            System.out.println("NumberFormatException will be caught here");
        }
    }
}
```

3) Even constructor can use throws keyword. For this, object creation statement must be enclosed in try-catch blocks.

```
class A
{
    int i;
 
    public A(String s) throws NumberFormatException
    {
        i = Integer.parseInt(s);    //This statement throws NumberFormatException
    }
}
 
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            A a = new A(&quot;abc&quot;);    //Object creation statement enclosed in try-catch block
        }
        catch (NumberFormatException ex)
        {
            System.out.println("NumberFormatException will be caught here");
        }
    }
}
```

4) When a method is throwing unchecked type of exceptions, then you need not to mention it using throws keyword. But for a method throwing checked type of exceptions, you must declare it with throws keyword or enclose the statement which is throwing an exception in try-catch block.

```
public class ExceptionHandling {

    // Method throwing an unchecked exception (without a throws clause)
    static void methodThrowingUncheckedException() {
        int i = Integer.parseInt("abc");   
        // The above statement throws NumberFormatException, which is an unchecked exception
    }

    // Method throwing a checked exception (with a throws clause)
    static void methodThrowingCheckedException() throws ClassNotFoundException {
        Class.forName("AnyClassName");
        // The above statement throws ClassNotFoundException, which is a checked exception
    }

    public static void main(String[] args) {
        // Handling unchecked exception
        try {
            methodThrowingUncheckedException();
        } catch (NumberFormatException ex) {
            System.out.println("NumberFormatException will be caught here");
        }

        // Handling checked exception
        try {
            methodThrowingCheckedException();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException will be caught here");
        }
    }
}
```