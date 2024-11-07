# Nested try catch Blocks in Java

- In Java, try-catch blocks can be nested. i.e one try block can contain another try-catch block. 
- Exception thrown must be handled somewhere in the program. If it is not handled, then program will be terminated abruptly.
- The syntax for nesting try blocks is,
```
try     //Outer try block
{
    //Some Statements
 
    try    //Inner try block
    {
        //Some Statements
    }
    catch (Exception ex)    //Inner catch block
    {
 
    }
}
catch(Exception ex)     //Outer catch block
{
 
}
```

1) Different Types of Exception

- Nested try blocks are useful when different statements of try block throw different types of exceptions.

```
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object
 
        for (int i = 0; i < s.length; i++)
        {
            try     //Outer try block
            {
                int a = s[i].length();    //This statement may throw NullPointerException
 
                try    //Inner try block
                {
                    a = Integer.parseInt(s[i]);    //This statement may throw NumberFormatException
                }
                catch (NumberFormatException ex)   //Inner catch block
                {
                    System.out.println("NumberFormatException will be caught here");
                }
            }
            catch(NullPointerException ex)     //Outer catch block
            {
                System.out.println("NullPointerException will be caught here");
            }
        }
    }
}
```

2) Nested at any Level

- try blocks can be nested at any level

```
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object
 
        for (int i = 0; i < s.length; i++)
        {
            //First Level try-catch block
            try
            {
                int a = s[i].length();    //This statement may throw NullPointerException
 
                //second level try-catch block
                try
                {
                    System.out.println(s[i+1]);   //This statement may throw ArrayIndexOutOfBoundsException
 
                    //third level try-catch block
                    try
                    {
                        a = Integer.parseInt(s[i]);    //This statement may throw NumberFormatException
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("NumberFormatException will be caught here");
                    }
                }
                catch (ArrayIndexOutOfBoundsException ex)
                {
                    System.out.println("ArrayIndexOutOfBoundsException will be caught here");
                }
            }
            catch(NullPointerException ex)
            {
                System.out.println("NullPointerException will be caught here");
            }
        }
    }
}
```

3) Propagating Exception

- If the exception thrown by the inner try block can not be caught by it’s catch block, then this exception is propagated to outer try blocks. 
- Any one of the outer catch block should handle this exception otherwise program will terminate abruptly.

```
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object
 
        for (int i = 0; i < s.length; i++)
        {
            //First Level try-catch block
            try
            {
                int a = s[i].length();    //This statement may throw NullPointerException
 
                //second level try-catch block
                try
                {
                    System.out.println(s[i+1]);   //This statement may throw ArrayIndexOutOfBoundsException
 
                    //third level try-catch block
                    try
                    {
                        a = Integer.parseInt(s[i]);    //This statement may throw NumberFormatException
                    }
                    catch (NullPointerException e)
                    {
                        System.out.println("NumberFormatException will not be caught here");
                    }
                }
                catch (NumberFormatException ex)
                {
                    System.out.println("NumberFormatException will be caught here");
                }
            }
            catch(Exception ex)
            {
                System.out.println("This block catches all types of exceptions");
            }
        }
    }
}
```

4) Propagating Exception from Methods

- In the following example also, try-catch blocks are nested. 
- main() method calls nestedTry() method. 
- nestedTry() method has one try-catch block. 
- First statement in try block throws NumberFormatException which is not handled by it’s catch block. 
- So, It propagates to try-catch block of main method which handles this exeption.
```
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            nestedTry();
        }
        catch(Exception ex)
        {
            System.out.println("NumberFormatException will be caught here");
        }
    }
 
    static void nestedTry()
    {
        try
        {
            int i = Integer.parseInt("abc");    //This statement throws NumberFormatException
        }
        catch(NullPointerException ex)
        {
            System.out.println("NumberFormatException will not be caught here");
        }
    }
}
```
