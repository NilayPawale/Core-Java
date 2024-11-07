# User Defined Exceptions

- In java, we can define our own exception classes as per our requirements. 
- These exceptions are called user defined exceptions in java OR Customized exceptions. 
- User defined exceptions must extend any one of the classes in the hierarchy of exceptions.

## Creating Custom Exception(User defined exception or application exception)

1) Need :

- Validations : In case of validation failures : Prog will have to throw custom exc class instance
- Buisness Logic failures (eg : funds transfer : insufficient finds)  :  Programmer will have to throw custom exception class instance

2) Steps : 

- Create a packged public class which extends Throwable(not recommended but legal)/Exception(recommended)/Error(not recommended but legal)/RuntimeExc(not recommended but legal)

eg : 
```
public class MyException extends Exception{
   public MyException(String mesg)
   {
    super(mesg);
   }
}
public class MyException2 extends RunTimeException{....}
```

- CustExc(String msg) : overload the constructor : to invoke the super-class constructor of the form 
Exception (String msg)
OR  
CustExc(String msg,Throwable rootCause)
public Exception(String message,Throwable cause)

3) Objective :

- Check the speed of vehicle on a freeway
- Accept the speed using Scanner : can be speed too low(exc) or too high(exc) or in range

keyword -- throw --for throwing  exception.
JVM uses it to throw built-in exceptions(eg : NullPointerExc , IOException etc) & prog uses it throw custom exception(user defined excs) in case of B.L or validation failures.

syntax :
throw Throwable instance;

eg : 
```
throw new NullPointerExc();// no javac err
throw new InterruptedExc();// no javac err
throw new Throwable("abc");// no javac err
throw new Account(...);//javac err (provided it doesn't extend from Throwable hierarchy)
throw new AccountOverdrawnException("funds too low...");//proper usage
```

### Example 1

- This example throws an exception when user enters negative age.

```
public class ExceptionHandling
{
    public static void main(String[] args)
    {
          Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
 
          System.out.println("Enter Your Age");
 
          int age = sc.nextInt();         //Taking input from user
 
          try
          {
              if(age < 0)
              {
                  throw new Exception();    //throws an Exception if age is negative
              }
          }
          catch(Exception ex)
          {
              System.out.println(ex);     //Prints exception description
          }
    }
}
```

- When user enters negative value in the above example, it throws an exception and prints exception description which user may not understand. 
- So, Let’s make this program more user friendly. 
- Modify above example so that user can understand why the exception has occurred. 
- To do this, create one sub class to Exception class and override toString() method.

```
//Defining Our own exception by extending Exception class
 
class AgeIsNegativeException extends Exception
{
    String errorMessage;
 
    public AgeIsNegativeException(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }
 
    //Modifying toString() method to display customized error message
 
    @Override
    public String toString()
    {
        return errorMessage;
    }
}

public class ExceptionHandling
{
    public static void main(String[] args)
    {
          Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
 
          System.out.println("Enter Your Age");
 
          int age = sc.nextInt();         //Taking input from user
 
          try
          {
              if(age < 0)
              {
                  throw new AgeIsNegativeException("Age can not be negative");    //throws AgeIsNegativeException if age is negative
              }
          }
          catch(AgeIsNegativeException ex)
          {
              System.out.println(ex);    //Output : Age can not be negative
          }
    }
}
```

- Above defined exception is called user defined exception or customized exception. 
- Now throw this customized exception when user enters negative value.
- Now, this prints “Age can not be negative” when user enters a negative value. This makes the user understand easily why the error has occurred.


### Example 2

```
//Defining Our own exception class by extending ArithmeticException class
 
class InvalidWithdrawlMoneyException extends ArithmeticException
{
    //Overriding toString() method of ArithmeticException as per our needs
 
    @Override
    public String toString()
    {
        return "You don't have that much of money in your account";
    }
}
 
//Using above customized ArithmeticException
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        int balance = 5000;            //Initializing the balance
 
        Scanner sc = new Scanner(System.in);     //Scanner variable to take input from user
 
        System.out.println("Enter Withdrawl Money");
 
        int withdrawlMoney = sc.nextInt();      //taking input from the user
 
        try
        {
            //checking withdrawl money with the balance
            //if withdrawl money is more than the balance,
            //then it throws Exception
 
            if(withdrawlMoney > balance)
            {
                throw new InvalidWithdrawlMoneyException();
            }
            else
            {
                System.out.println("Transaction Successful");
            }
        }
        catch(InvalidWithdrawlMoneyException ex)
        {
            //InvalidWithdrawlMoneyException will be caught here
 
            System.out.println(ex);
        }
    }
}
```

- We can throw modified exception using anonymous inner class also. 
- Whenever exception occurs, create anonymous inner class, override toString() method and throw the exception. 
- No need to define exception class separately. 
- Above example can be written using anonymous inner classs as,
```
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        int balance = 5000;            //Initializing the balance
 
        Scanner sc = new Scanner(System.in);     //Scanner variable to take input from user
 
        System.out.println("Enter Withdrawl Money");
 
        int withdrawlMoney = sc.nextInt();      //taking input from the user
 
        try
        {
            //checking withdrawl money with the balance
            //if withdrawl money is more than the balance,
            //then it throws Exception
 
            if(withdrawlMoney > balance)
            {
                //throwing exception using anonymous inner class
 
                throw new ArithmeticException()
                {
                    @Override
                    public String toString()
                    {
                        return "You don't have that much of money in your account";
                    }
                };
            }
            else
            {
                System.out.println("Transaction Successful");
            }
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex);
        }
    }
}
```