# Multiple Catch Blocks in Java

- In some cases, A single statement may throw more than one type of exception. 
- In such cases, Java allows you to put more than one catch blocks. 
- One catch block handles one type of exception.  
- When an exception is thrown by the try block, all the catch blocks are examined in the order they appear and one catch block which matches with exception thrown will be executed. 
- After, executing catch block, program control comes out of try-catch unit.

```
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object
 
        for (int i = 0; i < 6; i++)
        {
            try
            {
                int a = s[i].length() + Integer.parseInt(s[i]);    
 
                //This statement may throw NumberFormatException, NullPointerException and ArrayIndexOutOfBoundsException
 
            }
 
            catch(NumberFormatException ex)
            {
                System.out.println("NumberFormatException will be caught here");
            }
 
            catch (ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("ArrayIndexOutOfBoundsException will be caught here");
            }
 
            catch (NullPointerException ex)
            {
                System.out.println("NullPointerException will be caught here");
            }
 
            System.out.println("After executing respective catch block, this statement will be executed");
        }
    }
}
```

- In the above example, a string array is iterated through for loop. 

- First statement of try block (Line 11) may throw NumberFormatException because string array contain some non-numeric values or It may throw NullPointerException because string array contains one null object or it may throw ArrayIndexOutOfBoundsException because we are trying to iterate 6 elements, but actually string array contains only 4 elements. 

- Depending upon the type of exception thrown, corresponding catch block will be executed.

## pipe (|) Operator

- From Java 7 onward, there is one more way for handling multiple exceptions. 
- Multiple exceptions thrown by the try block can be handled by a single catch block using pipe (|) operator. 
- By using pipe operator, the above example can be written as,

```
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object
 
        for (int i = 0; i < 6; i++)
        {
            try
            {
                int a = s[i].length() + Integer.parseInt(s[i]);    
 
                //This statement may throw NumberFormatException, NullPointerException and ArrayIndexOutOfBoundsException
            }
 
            catch(NumberFormatException | NullPointerException | ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("Now, this block handles NumberFormatException, NullPointerException and ArrayIndexOutOfBoundsException");
            }
        }
    }
}
```

## java.lang.Exception

- java.lang.Exception is super class of all types of exception. 
- It handles all types of exceptions. 
- In the above example, all catch blocks can be replaced by one catch block which handles all types of exceptions. 
- This type of exception handling comes very handy when you are not sure about the types of exceptions your code may throw.

```
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object
 
        for (int i = 0; i < 6; i++)
        {
            try
            {
                int a = s[i].length() + Integer.parseInt(s[i]);    
 
                //This statement may throw NumberFormatException, NullPointerException and ArrayIndexOutOfBoundsException
            }
 
            catch(Exception ex)
            {
                System.out.println("This block handles all types of exceptions");
            }
        }
    }
}
```

## Unreachable Catch Block

- The order of catch blocks should be from most specific to most general ones. i.e Sub classes of Exception must come first and super classes later. 
- If we keep the super classes first and sub classes later, you will get compile time error : Unreachable Catch Block.

```
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
        }
 
        catch(Exception ex)
        {
            System.out.println("This block handles all exception types");
        }
 
        catch(NumberFormatException ex)
        {
            //Compile time error
            //This block becomes unreachable as
            //exception is already handled by above catch block
        }
    }
}
```

Below is the correct way to write above program

```
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
        }
 
        catch(NumberFormatException ex)
        {
            System.out.println("This block handles NumberFormatException");
        }
 
        catch(Exception ex)
        {
            System.out.println("This block handles all exception types");
        }
 
        catch (Throwable ex)
        {
            System.out.println("Throwable is super class of Exception");
        }
    }
}
```