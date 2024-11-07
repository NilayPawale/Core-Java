# Throwing And Re-Throwing An Exception in Java

## Throwing An Exception

- We all know that Throwable class is super class for all types of errors and exceptions. 
- An object to this Throwable class or it’s sub classes can be created in two ways. 
- First one is using an argument of catch block. 
- In this way, Throwable object or object to it’s sub classes is implicitly created and thrown by java run time system. 
- Second one is using new operator. 
- In this way, Throwable object or object to it’s sub classes is explicitly created and thrown by the code.

- An object to Throwable or to it’s sub classes can be explicitly created and thrown by using throw keyword. 
- The syntax for using throw keyword is,
```
throw InstanceOfThrowableType;
```
- where, InstanceOfThrowableType must be an object of type Throwable or subclass of Throwable.

Such explicitly thrown exception must be handled some where in the program, otherwise program will be terminated.
For example,
```
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        methodWithThrow();
    }
 
    static void methodWithThrow()
    {
        try
        {
            NumberFormatException ex = new NumberFormatException();    //Creating an object to NumberFormatException explicitly
 
            throw ex;        //throwing NumberFormatException object explicitly using throw keyword
        }
        catch(NumberFormatException ex)
        {
            System.out.println("explicitly thrown NumberFormatException object will be caught here");
        }
    }
}
```

- It is not compulsory that explicitly thrown exception must be handled by immediately following try-catch block. 
- It can be handled by any one of it’s enclosing try-catch blocks.
```
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            methodWithThrow();
        }
        catch(NumberFormatException ex)
        {
            System.out.println("NumberFormatException object thrown in methodWithThrow() method will be handled here");
        }
    }
 
    static void methodWithThrow()
    {
        try
        {
            NumberFormatException ex = new NumberFormatException("This is an object of NumberFormatException");
 
            throw ex;        //throwing NumberFormatException object explicitly using throw keyword
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Explicitly thrown NumberFormatException object will not be caught here");
        }
    }
}
```

## Re-throwing An Exception

- We all know that exceptions occurred in the try block are caught in catch block. 
- Thus caught exceptions can be re-thrown using throw keyword. 
- Re-thrown exception must be handled some where in the program, otherwise program will terminate abruptly. 
- For example,
```
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            methodWithThrow();
        }
        catch(NullPointerException ex)
        {
            System.out.println("NullPointerException Re-thrown in methodWithThrow() method will be handled here");
        }
    }
 
    static void methodWithThrow()
    {
        try
        {
            String s = null;
            System.out.println(s.length());   //This statement throws NullPointerException
        }
        catch(NullPointerException ex)
        {
            System.out.println("NullPointerException is caught here");
 
            throw ex;     //Re-throwing NullPointerException
        }
    }
}
```