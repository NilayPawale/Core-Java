# Return Value From try-catch-finally Blocks

1) If finally block returns a value then try and catch blocks may or may not return a value.

```
public class ReturnValueFromTryCatchFinally
{
    public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }
 
    static int methodReturningValue()
    {
        try
        {
            //This block may or may not return a value as finally block is returning a value
        }
        catch (Exception e)
        {
            //This block may or may not return a value as finally block is returning a value
        }
        finally
        {
            return 20;
        }
    }
}
```

2) If finally block does not return a value then both try and catch blocks must return a value.

```
public class ReturnValueFromTryCatchFinally
{
    public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }
 
    static int methodReturningValue()
    {
        try
        {
            return 10;
        }
        catch (Exception e)
        {
            return 20;
        }
        finally
        {
            //Now, This block may or may not return a value
            //as both try and catch blocks are returning a value
        }
    }
}
```

3) If try-catch-finally blocks are returning a value according to above rules, then you should not keep any statements after finally block. Because they become unreachable and in Java, Unreachable code gives compile time error.

```
public class ReturnValueFromTryCatchFinally
{
    public static void main(String[] args)
    {
        try
        {
            return;
        }
        catch (Exception e)
        {
            return;
        }
        finally
        {
            return;
        }
 
        System.out.println("Unreachable code");    //Compile Time Error : Unreachable Code
    }
}
```

4) finally block overrides any return values from try and catch blocks.

```
public class ReturnValueFromTryCatchFinally
{
    public static void main(String[] args)
    {
        System.out.println(methodReturningValue());    //Output : 50
    }
 
    static int methodReturningValue()
    {
        try
        {
            return 10;
        }
        catch (Exception e)
        {
            return 20;
        }
        finally
        {
            return 50;    //This method returns 50 not 10 or 20
        }
    }
}
```

5) finally block will be always executed even though try and catch blocks are returning the control.

```
public class ReturnValueFromTryCatchFinally
{
    public static void main(String[] args)
    {
        System.out.println(methodReturningValue());    //Output : 10
    }
 
    static int methodReturningValue()
    {
        try
        {
            return 10;    //control will not be passed to main() method here
        }
        catch (Exception e)
        {
            return 20;    //Control will not be passed to main() method here
        }
        finally
        {
            System.out.println("finally block is always executed");
 
            //Control will be passed to main() method after executing this block
        }
    }
}
```

## Examples

1) 
```
public class ReturnValueFromTryCatchFinally
{
    public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }
 
    static String methodReturningValue()
    {
        String s = null;
        try
        {
            s = "return value from try block";
            return s;
        }
        catch (Exception e)
        {
            s = s + "return value from catch block";
            return s;
        }
        finally
        {
            s = s + "return value from finally block";
        }
    }
}
```
Output
```
return value from try block
```

2) 
```
public class ReturnValueFromTryCatchFinally
{
    public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }
 
    static int methodReturningValue()
    {
        int i = 0;
 
        try
        {
            i = 1;
            return i;
        }
        catch (Exception e)
        {
            i = 2;
            return i;
        }
        finally
        {
            i = 3;
        }
    }
}
```
Output
```
1
```

3) 
```
public class ReturnValueFromTryCatchFinally
{
    public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }
 
    static int methodReturningValue()
    {
        int i = 0;
 
        try
        {
            i = 1;
            return i;
        }
        catch (Exception e)
        {
            i = 2;
        }
        finally
        {
            i = 3;
        }
 
        return i;
    }
}
```
Output
```
1
```

4) 
```
public class ReturnValueFromTryCatchFinally
{
    public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }
 
    static int methodReturningValue()
    {
        try
        {
            int i = Integer.parseInt("123");
            return 20;
        }
        finally
        {
            return 50;
        }
    }
}
```
Output
```
50
```

5) 
```
public class ReturnValueFromTryCatchFinally
{
    public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }
 
    static int methodReturningValue()
    {
        try
        {
            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
            return 20;
        }
        finally
        {
            return 50;
        }
    }
}
```
Output
```
50
```

