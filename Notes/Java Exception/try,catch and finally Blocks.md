# try, catch and finally blocks in Java

Exception Handling in java is implemented using five keywords.
1) try       
2) catch       
3) finally       
4) throw         
5) throws

## try block

- Contains the code that might throw an exception during run time. 
- If an exception occurs, control is transferred to the catch block.

```
try
{
    //This is the try block
    //In this block, keep those statements which may
    //throw run time exceptions
}
```

## catch block

- Handles the exception thrown by the try block. 
- You can specify the type of exception to catch. 
- It takes one argument of type java.lang.Exception.

```
catch(Exception e)
{
    //This is the catch block.
    //It takes one argument of type java.lang.Exception
    //This block catches the exceptions thrown by try block
}
```

## finally block

This block always executes, regardless of whether an exception occurs or not. It's typically used for cleanup operations like closing files or releasing resources.

```
finally
{
    //This is the finally block.
}
```

## try-with-resources

- From Java SE 7 onwards --- Java has introduced java.lang.AutoCloseable -- i/f
- It represents --- resources that must be closed -- when no longer required.
- Autocloesable i/f method -- public void close() throws Exception-- closing resources.
- Java I/O  classes(eg : BufferedReader,PrintWriter.....),Scanner -- have already implemented this i/f -- to automatically close resource when no longer required.

- Syntax of try-with-resources

```
try (//can open one or multiple AutoCloseable resources)
{ ......
} //JVM auto invokes close() on AutoCloseable resources
```

OR
```
try (//can open one or multiple AutoCloseable resources)
{ 
//checked excs ....
} //JVM auto invokes close() on AutoCloseable resources
catch(Exception e)
{
....
}
```

Example :
```
try(Scanner sc=new Scanner(System.in);
    FileReader fr=new FR(....))
{
 ..........
} catch -all 
```


## Example of try, catch and finally blocks

```
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        String[] s = {"abc", "123", "xyz", "456"};   //String Array containing valid and invalid numeric values
 
        for (int i = 0; i < s.length; i++)
        {
            try
            {
                int intValue = Integer.parseInt(s[i]); //This statement may throw NumberFormatException
            }
            catch(NumberFormatException ex)
            {
                System.out.println("The thrown NumberFormatException will be caught here");
            }
            finally
            {
                System.out.println("This block is always executed");
            }
        }
    }
}
```

- In the above example, A string array, containing valid and invalid numeric values, is iterated through for loop. 
- Each element of an array is parsed to primitive int type. 
- Element with valid numeric value is parsed without throwing an exception. 
- Element with invalid numeric value can not be parsed to int type and it throws the NumberFormatException. 
- This exception is caught in catch block making the flow of the program normal. 
- finally block is executed for every iteration whether element is parsed or not.

## throw

- Used to explicitly throw an exception.

```
throw new ExceptionType("Error message");
```

## throws

- Used in method signatures to indicate that a method may throw certain exceptions, which must be handled by the calling method.

```
public void myMethod() throws IOException {
    // method code
}
```

## Important Points of try, catch and finally blocks

1) Exception in try block

- When a statement throws an exception in the try block, the remaining part of the try block will not be executed. 
- Program control comes out of the try block and enters directly into catch block.
```
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            int i = 10/0;           //This statement throws ArithmeticException
 
            System.out.println("This statement will not be executed");
        }
        catch(Exception ex)
        {
            System.out.println("This block is executed immediately after an exception is thrown");
        }
        finally
        {
            System.out.println("This block is always executed");
        }
    }
}
```

2) try, catch, finally Blocks are One Unit

- try, catch and finally blocks form one unit. i.e You can’t keep other statements in between try, catch and finally blocks.
```
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        System.out.println("You can keep any number of statements here");
 
        try
        {
            int i = 10/0;           //This statement throws ArithmeticException
 
            System.out.println("This statement will not be executed");
        }
 
        //You can't keep statements here
 
        catch(ArithmeticException ex)
        {
            System.out.println("This block is executed immediately after an exception is thrown");
        }
 
        //You can't keep statements here
 
        finally
        {
            System.out.println("This block is always executed");
        }
 
        System.out.println("You can keep any number of statements here");
    }
}
```

3) Description of an exception

- You can display the description of an exception thrown using Exception object in the catch block.
```
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            String s = null;
 
            System.out.println(s.length());   //This statement throws NullPointerException
 
            System.out.println("This statement will not be executed");
        }
        catch(Exception ex)
        {
            System.out.println(ex);    //Output : java.lang.NullPointerException
 
            ex.printStackTrace();     //This prints stack trace of exception
        }
        finally
        {
            System.out.println("This block is always executed");
        }
    }
}
```
