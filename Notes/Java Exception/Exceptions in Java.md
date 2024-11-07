# Exceptions in Java

- List of the most common exceptions in Java, divided into checked and unchecked exceptions.

## Checked Exceptions

- These exceptions are checked at compile-time, meaning you must handle or declare them in your code.

1) IOException – Input/output operation failure.
2) FileNotFoundException – File not found.
3) SQLException – Database-related error.
4) ClassNotFoundException – Class cannot be found.
5) InterruptedException – Thread is interrupted.
6) InstantiationException – Trying to create an instance of an abstract class or interface.
7) IllegalAccessException – Accessing a class or method that is not allowed.
8) NoSuchMethodException – Method does not exist.
9) InvocationTargetException – Exception thrown by an invoked method.
10) MalformedURLException – Invalid URL.

## Unchecked Exceptions (Runtime Exceptions)

- These are not checked at compile-time, and handling them is optional.

1) NullPointerException – Attempt to use an object reference that has the value null.
2) ArrayIndexOutOfBoundsException – Array index is out of bounds.
3) ArithmeticException – Division by zero.
4) ClassCastException – Invalid cast between incompatible classes.
5) IllegalArgumentException – Illegal or inappropriate argument passed.
6) NumberFormatException – Conversion of a string to a number fails.
7) IllegalStateException – Method called at an inappropriate time.
8) IndexOutOfBoundsException – Index is out of range.
9) UnsupportedOperationException – Unsupported operation called.
10) SecurityException – Security violation detected.
11) EnumConstantNotPresentException – Enum constant is not present.


## Commonly Used Exceptions

1) NullPointerException - java.lang.NullPointerException

- NullPointerException is a RunTimeException which occurs when your application tries to access null object. 
- It happens if you don’t initialize the reference variable and it is pointing to null instead of actual object. 
- Using such reference variable will cause NullpointerException.

```
package pack1;
 
class A
{
    static String s;
}
 
public class MainClass
{
    public static void main(String[] args)
    {
       System.out.println(A.s.length());
    }
}
```

- In the above code, we are trying to find the length of string filed ‘s’ of class A. 
- But, it is not initialized. 
- It is pointing to null. This will throw java.lang.NullPointerException like below.
```
Exception in thread "main" java.lang.NullPointerException
    at pack1.MainClass.main(MainClass.java:12)
```

2) ArrayIndexOutOfBoundsException - java.lang.ArrayIndexOutOfBoundsException

- ArrayIndexOutOfBoundsException is also one of the frequently occurring exception in java. 
- It occurs when you try to access an array element with an invalid index i.e index greater than the array length or with a negative index.

```
package pack1;
 
public class MainClass
{
    public static void main(String[] args)
    {
       String s[] = new String[] {"ZERO", "ONE", "TWO", "THREE", "FOUR"};
        
       System.out.println(s[5]);    //This will throw ArrayIndexOutOfBoundsException
        
       System.out.println(s[-1]);   //This will also throw ArrayIndexOutOfBoundsException
    }
}
```

- In the above example, string array ‘s’ contains only 5 elements. 
- But, we are trying to access sixth element. 
- This will result in java.lang.ArrayIndexOutOfBoundsException.
```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
    at pack1.MainClass.main(MainClass.java:9)
```

3) NumberFormatException – java.lang.NumberFormatException

- NumberFormatException is thrown when you are trying to convert a string to numeric value like integer, float, double etc…, but input string is not a valid number. 
- NumberFormatException is also one of IllegalArgumentException.

```
package pack1;
 
public class MainClass
{
    public static void main(String[] args)
    {
       int i = Integer.parseInt("abc");
    }
}
```

- In the above code, we are trying to convert a string “abc” to number, which is not possible. 
- This will throw java.lang.NumberFormatException.
```
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
    at java.lang.NumberFormatException.forInputString(Unknown Source)
    at java.lang.Integer.parseInt(Unknown Source)
    at java.lang.Integer.parseInt(Unknown Source)
    at pack1.MainClass.main(MainClass.java:7)
```

4) ClassNotFoundException - java.lang.ClassNotFoundException

- ClassNotFoundException is a checked type of exception. 
- It is thrown when an application tries to load a class at run time using Class.forName() or loadClass() or findSystemClass() methods, but the class with specified name is not found in the classpath. 
- This frequently occurs when you try to run your application without updating the class path with required JAR files.

```
package pack1;
 
public class MainClass
{
    public static void main(String[] args)
    {
       try
       {
           Class.forName("oracle.jdbc.driver.OracleDriver");
       } 
       catch (ClassNotFoundException e) 
       {
           e.printStackTrace();
       }
    }
}
```

- The above code will throw java.lang.ClassNotFoundException if you don’t update the classpath with Oracle JDBC driver class.
```
java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriver
    at java.net.URLClassLoader.findClass(Unknown Source)
    at java.lang.ClassLoader.loadClass(Unknown Source)
    at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
    at java.lang.ClassLoader.loadClass(Unknown Source)
    at java.lang.Class.forName0(Native Method)
    at java.lang.Class.forName(Unknown Source)
    at pack1.MainClass.main(MainClass.java:9)
```

5) ArithmeticException - java.lang.ArithmeticException

- ArithmeticException is also a RunTimeException which is thrown when an abnormal arithmetic condition arises in an application. 
- For example, divide by zero exception.

```
package pack1;
 
public class MainClass
{
    public static void main(String[] args)
    {
       int i = 10/0;
        
       System.out.println(i);
    }
}
```

- The above code will throw java.lang.ArithmeticException like below.
```
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at pack1.MainClass.main(MainClass.java:7)
```

6) SQLException - java.sql.SQLException

- SQLException is thrown when an application encounters with an error while interacting with the database. 
- For example, passing the wrong username or password, passing the wrong URL of the database, passing invalid column name or column index etc. 
- SQLException is also a checked exception.

```
import java.sql.*;
  
public class MainClass
{
    static
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Unable To Load The Driver class");
        }
    }
  
    public static void main(String[] args)
    {
        Connection con = null;
              
        String URL = "jdbc:oracle:thin:@localhost:1521:XE";
  
        String username = "username";
  
        String password = "password";
  
        try
        {
            con = DriverManager.getConnection(URL, username, password);
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}
```

- In the above program, we are trying to connect to the database by passing wrong username and password. 
- This will throw java.sql.SQLException.
```
java.sql.SQLException: ORA-01017: invalid username/password; logon denied
 
    at oracle.jdbc.driver.DatabaseError.throwSqlException(DatabaseError.java:112)
    at oracle.jdbc.driver.T4CTTIoer.processError(T4CTTIoer.java:331)
    at oracle.jdbc.driver.T4CTTIoer.processError(T4CTTIoer.java:283)
    at oracle.jdbc.driver.T4CTTIoer.processError(T4CTTIoer.java:278)
    at oracle.jdbc.driver.T4CTTIoauthenticate.receiveOauth(T4CTTIoauthenticate.java:785)
    at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:362)
    at oracle.jdbc.driver.PhysicalConnection.<init>(PhysicalConnection.java:414)
    at oracle.jdbc.driver.T4CConnection.<init>(T4CConnection.java:165)
    at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:35)
    at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:801)
    at java.sql.DriverManager.getConnection(Unknown Source)
    at java.sql.DriverManager.getConnection(Unknown Source)
    at MainClass.main(MainClass.java:31)
```

7) ClassCastException - java.lang.ClassCastException

- ClassCastException occurs when an object of one type can not be casted to another type. 
- While casting, an object must satisfy “IS-A” relationship. 
- If it doesn’t satisfy then JVM will throw java.lang.ClassCastException.

```
package pack1;
 
class A
{
     
}
 
class B extends A
{
     
}
 
public class MainClass
{
    public static void main(String[] args)
    {
       A a = new A();
        
       B b = (B)a;
    }
}
```

- In the above example, we are trying to cast an object of type A to type B. 
- But, it doesn’t satisfy “IS-A” relationship. i.e A is not of type B. 
- This will throw java.lang.ClassCastException.
```
Exception in thread "main" java.lang.ClassCastException: pack1.A cannot be cast to pack1.B
    at pack1.MainClass.main(MainClass.java:19)
```

8) IOException - java.io.IOException

- IOException occurs when an IO operation fails in your application. 
- IOException is a checked type of exception. 
- This exception is the super class for all type of IO exceptions. 
- Some of the popular IO exceptions are FileNotFoundException, SocketException, SSLException etc.

```
package pack1;
 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class MainClass
{
    public static void main(String[] args)
    {
       String filePath = "C:\\Users\\Bablad\\Desktop\\Open.txt";
        
       BufferedReader reader = null;
        
       try
       {
           reader = new BufferedReader(new FileReader(filePath));           
       } 
       catch (FileNotFoundException e) 
       {
           e.printStackTrace();
       }
       finally
       {
           try
           {
               if(reader != null)
               {
                   reader.close();
               }
           } 
           catch (IOException e) 
           {
               e.printStackTrace();
           }
       }
    }
}
```

- In the above example, we are trying to read a file which doesn’t exist in the path specified. 
- It causes java.io.FileNotFoundException.
```
java.io.FileNotFoundException: C:\Users\Bablad\Desktop\Open.txt (The system cannot find the file specified)
    at java.io.FileInputStream.open0(Native Method)
    at java.io.FileInputStream.open(Unknown Source)
    at java.io.FileInputStream.<init>(Unknown Source)
    at java.io.FileInputStream.<init>(Unknown Source)
    at java.io.FileReader.<init>(Unknown Source)
    at pack1.MainClass.main(MainClass.java:18)
```

9) InterruptedException - java.lang.InterruptedException

- This exception is caused in multithreaded programming. 
- InterruptedException is thrown when a sleeping thread or waiting thread is interrupted. 
- The methods like sleep(), wait() and join() methods throw InterruptedException. InterruptedException is also a checked exception.

```
public class MainClass 
{
    public static void main(String[] args) 
    {
        Thread t = new Thread()
        {
            public void run() 
            {
                try
                {
                    Thread.sleep(10000);   //Thread sleeps for 10s
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
            }
        };
         
        t.start();
         
        try
        {
            Thread.sleep(3000);   //main thread sleeping for 3s
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
         
        t.interrupt();    //interrupting thread t
    }
}
```

- In the above example, main thread interrupts thread ‘t’ while it is sleeping. 
- This causes java.lang.InterruptedException to arise.

10) java.lang.SecurityException

- SecurityException is thrown by the security manager if an application violates the security rules. 
- For example, changing a thread name or thread priority to which you don’t have access or using a package name which is already used. 
- SecurityException indicates that application has violated the security rules and it can not continue the execution.

```
package java.lang;
 
public class MainClass 
{
    public static void main(String[] args)
    {
        System.out.println("Java Programming");
    }
}
```

- The above code will throw java.lang.SecurityException. 
- Because, we are using package name “java.lang” which is already used in JDK.
```
Exception in thread "main" java.lang.SecurityException: Prohibited package name: java.lang
    at java.lang.ClassLoader.preDefineClass(Unknown Source)
    at java.lang.ClassLoader.defineClass(Unknown Source)
    at java.security.SecureClassLoader.defineClass(Unknown Source)
    at java.net.URLClassLoader.defineClass(Unknown Source)
    at java.net.URLClassLoader.access$100(Unknown Source)
    at java.net.URLClassLoader$1.run(Unknown Source)
    at java.net.URLClassLoader$1.run(Unknown Source)
    at java.security.AccessController.doPrivileged(Native Method)
    at java.net.URLClassLoader.findClass(Unknown Source)
    at java.lang.ClassLoader.loadClass(Unknown Source)
    at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
    at java.lang.ClassLoader.loadClass(Unknown Source)
    at sun.launcher.LauncherHelper.checkAndLoadMain(Unknown Source)
```

11) StackOverflowError - java.lang.StackOverflowError

- StackOverflowError is a run time error which occurs when stack overflows. 
- This happens when you keep calling the methods recursively.

```
public class MainClass 
{
    static void methodOne()
    {
        methodTwo();
    }
     
    static void methodTwo()
    {
        methodOne();
    }
     
    public static void main(String[] args) 
    {
        methodOne();
    }
}
```

- The above code will throw java.lang.StackOverflowError, because methodOne() and methodTwo() are calling each other recursively.
```
Exception in thread "main" java.lang.StackOverflowError
    at MainClass.methodTwo(MainClass.java:10)
    at MainClass.methodOne(MainClass.java:5)
    at MainClass.methodTwo(MainClass.java:10)
    at MainClass.methodOne(MainClass.java:5)
    at MainClass.methodTwo(MainClass.java:10)
    at MainClass.methodOne(MainClass.java:5)
    at MainClass.methodTwo(MainClass.java:10)
    at MainClass.methodOne(MainClass.java:5)
```

12) NoClassDefFoundError - java.lang.NoClassDefFoundError

- NoClassDefFoundError is thrown when Java Runtime System tries to load the definition of a class which is no longer available. 
- The required class definition was present at compile time but it was missing at run time.

```
class A
{
  
}
  
public class B
{
    public static void main(String[] args)
    {
        A a = new A();
    }
}
```

- When you compile the above program, two .class files will be generated. 
- One is A.class and another one is B.class. 
- If you run the B.class file after deleting the A.class file, java.lang.NoClassDefFoundError will be thrown.
```
Exception in thread "main" java.lang.NoClassDefFoundError: A
        at MainClass.main(MainClass.java:10)
Caused by: java.lang.ClassNotFoundException: A
        at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
        at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
```

