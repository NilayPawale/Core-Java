# Method Overriding With throws Clause in Java

1) If super class method is not throwing any exceptions, then it can be overrided with any unchecked type of exceptions, but can not be overrided with checked type of exceptions.

```
class SuperClass
{
    void methodOfSuperClass()
    {
        System.out.println("Super class method is not throwing any exceptions");
    }
}
 
class SubClass extends SuperClass
{
    @Override
    void methodOfSuperClass() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("can be overrided with any unchecked Exception");
    }
}
 
class SubClassOne extends SuperClass
{
    @Override
    void methodOfSuperClass() throws NumberFormatException, NullPointerException, RuntimeException
    {
        System.out.println("Can be overrided with any number of Unchecked Exceptions");
    }
}
 
class SubClassTwo extends SuperClass
{
    @Override
    void methodOfSuperClass() throws SQLException
    {
        //Compile time error
        //Can not be overrided with checked exception
    }
}
```

2) If a super class method is throwing unchecked exception, then it can be overrided in the sub class with same exception or any other unchecked exceptions but can not be overrided with checked exceptions.

```
class SuperClass
{
    void methodOfSuperClass() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("Super class method is throwing Unchecked exception");
    }
}
 
class SubClass extends SuperClass
{
    @Override
    void methodOfSuperClass() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("Can be Overrided with same unchecked exception");
    }
}
 
class SubClassOne extends SuperClass
{
    @Override
    void methodOfSuperClass() throws NumberFormatException, NullPointerException, RuntimeException
    {
        System.out.println("Can be overrided with any other Unchecked Exceptions");
    }
}
 
class SubClassTwo extends SuperClass
{
    @Override
    void methodOfSuperClass() throws IOException
    {
        //Compile time error
        //Can not be overrided with checked exception
    }
}
```

3) If super class method is throwing checked type of exception, then it can be overrided with same exception or with it’s sub class exceptions i.e you can decrease the scope of the exception, but can not be overrided with it’s super class exceptions i.e you can not increase the scope of the exception.

```
class SuperClass
{
    void methodOfSuperClass() throws IOException
    {
        System.out.println("Super class method is throwing checked exception");
    }
}
 
class SubClass extends SuperClass
{
    @Override
    void methodOfSuperClass() throws IOException
    {
        System.out.println("Can be Overrided with same checked exception");
    }
}
 
class SubClassOne extends SuperClass
{
    @Override
    void methodOfSuperClass() throws FileNotFoundException
    {
        System.out.println("Can be overrided with checked Exception with lesser scope");
    }
}
 
class SubClassTwo extends SuperClass
{
    @Override
    void methodOfSuperClass() throws NullPointerException, ArrayIndexOutOfBoundsException, FileNotFoundException
    {
        System.out.println("Can be overrided with any unchecked exceptions and checked exception with lesser scope");
    }
}
 
class SubClassThree extends SuperClass
{
    @Override
    void methodOfSuperClass() throws Exception
    {
        //Compile time error
        //Can not be overrided with checked exception with higher scope
    }
}
```

