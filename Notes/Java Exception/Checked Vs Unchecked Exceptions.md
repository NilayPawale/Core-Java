# Checked Vs Unchecked Exceptions in Java

- An exception is an abnormal condition which occurs during the execution of a program and disturbs the normal flow of a program. 
- There are two types of exceptions in Java – checked exceptions and unchecked exceptions. 
- Checked exceptions are the exceptions which are checked during compilation itself and those exceptions which are not checked during compilation are called unchecked exceptions.

## Checked Exceptions

- Checked exceptions are the exceptions which are checked during compilation itself. 
- They are also called compile time exceptions. 
- Compiler is aware of these exceptions and immediately throws the error wherever it sees the statements which may throw checked exceptions.
- All sub classes of java.lang.Exception (except sub classes of RunTimeException) are checked exceptions. 
- For example, FileNotFoundException, IOException, SQLException, ClassNotFoundException etc.
- These exceptions must be handled either using try-catch blocks or using throws clause. 
- If not handled properly, they will give compile time error.

Example

- Below code throws ClassNotFoundException which is a checked exception. But it is not handled, so it gives compile time error.
```
public class CheckedException
{
    public static void main(String[] args)
    {
        Class.forName("AnyClassName");  
 
        //Compile time error because
        //above statement throws ClassNotFoundException which is a checked exception
        //this statement must be enclosed within try-catch block or declare main method with throws clause
    }
}
```

- Below are the correct ways to write the above code.
```
public class CheckedException
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("AnyClassName");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException will be caught here");
        }
    }
}
```

Or

```
public class CheckedException
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class.forName("AnyClassName");
    }
}
```


## Unchecked Exceptions

- Unchecked exceptions are the exceptions which are not checked during compilation. 
- Compiler is not aware of these exceptions. 
- These exceptions occur only at run time. 
- That’s why they are also called Run Time Exceptions.
- All the sub classes of java.lang.RuntimeException are unchecked exceptions. For example, NullPointerException, ArithmeticException, ClassCastException, ArrayIndexOutOfBoundsException etc.
- If any statement in the program throws unchecked exceptions and you are not handling them either using try-catch blocks or throws clause, then it does not give compile time error. 
- Compilation will be successful but program may fail at run time. 
- Therefore, to avoid the premature termination of the program, you have to handle them properly.

Example
```
public class UncheckedException
{
    public static void main(String[] args)
    {
          int i = Integer.parseInt("Unchecked Exception");   
 
          //Above statement throws NumberFormatException which is an unchecked exception
    }
}
```

- Above program throws NumberFormatException at run time, but it is not handled properly. So, program will terminate abruptly. 
- To avoid this, you have to handle this exception using try-catch blocks as below.
```
public class UncheckedException
{
    public static void main(String[] args)
    {
        try
        {
            int i = Integer.parseInt("Unchecked Exception");   
 
            //Above statement throws NumberFormatException which is an unchecked exception
        }
        catch (NumberFormatException e)
        {
            System.out.println("NumberFormatException will be caught here");
        }
    }
}
```

## Checked Vs Unchecked Exceptions

| Checked Exceptions | Unchecked Exceptions |
|:--------------:|:--------------:|
| They are known at compile time. | They are known at run time. |
| They are checked at compile time. | They are not checked at compile time. |
| They are compile time exceptions. | They are run time exceptions. |
| These exceptions must be handled properly either using try-catch blocks or using throws clause, otherwise compiler will throw error. | If these exceptions are not handled properly, compiler will not throw any error. But, you may get error at run time. |
| All the sub classes of java.lang.Exception (except sub classes of java.lang.RunTimeException) are checked exceptions. | All the sub classes of java.lang.RunTimeException are unchecked exceptions. |
| Ex : FileNotFoundException, IOException, SQLException, ClassNotFoundException | Ex : NullPointerException, ArithmeticException, ClassCastException, ArrayIndexOutOfBoundsException |
