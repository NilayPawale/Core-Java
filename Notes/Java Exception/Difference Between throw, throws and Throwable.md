# Difference Between throw, throws and Throwable

## throw In Java

- throw is a keyword in java which is used to throw an exception manually. 
- Using throw keyword, you can throw an exception from any method or block. 
- But, that exception must be of type java.lang.Throwable class or it’s sub classes. 
- Below example shows how to throw an exception using throw keyword.
```
class ThrowAndThrowsExample
{
    void method() throws Exception
    {
        Exception e = new Exception();
 
        throw e;            //throwing an exception using 'throw'
    }
}
```

- throws --- keyword meant for javac
- Meaning -- Method MAY raise specified exc.
- Current method is NOT handling it , BUT its caller should handle.
- Mandatory--- only in case of un handled(no try-catch) checked exceptions(not extended from RuntimeException).
- Use case -- used in delegating the exception handling to the caller.


## throws In Java

- throws is also a keyword in java which is used in the method signature to indicate that this method may throw mentioned exceptions. 
- The caller to such methods must handle the mentioned exceptions either using try-catch blocks or using throws keyword. 
- Below is the syntax for using throws keyword.
```
return_type method_name(parameter_list) throws exception_list
{
     //some statements
}
```

- Below is the example which shows how to use throws keyword.
```
class ThrowsExample
{
    void methodOne() throws SQLException
    {
        //This method may throw SQLException
    }
 
    void methodTwo() throws IOException
    {
        //This method may throw IOException
    }
 
    void methodThree() throws ClassNotFoundException
    {
        //This method may throw ClassNotFoundException
    }
}
```

## Throwable In Java

- Throwable is a super class for all types of errors and exceptions in java. 
- This class is a member of java.lang package. 
- Only instances of this class or it’s sub classes are thrown by the java virtual machine or by the throw statement. 
- The only argument of catch block must be of this type or it’s sub classes. 
- If you want to create your own customized exceptions, then your class must extend this class. 
- Below example shows how to create customized exceptions by extending java.lang.Throwable class.
```
class MyException extends Throwable
{
           //Customized Exception class
}
 
class ThrowAndThrowsExample
{
    void method() throws MyException
    {
        MyException e = new MyException();
 
        throw e;
    }
}
```