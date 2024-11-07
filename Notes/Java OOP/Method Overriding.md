# Method Overriding in Java

- When a class extends its super class, all or some members of super class are inherited to sub class. 
- When a inherited super class method is modified in the sub class, then we call it as method is overrided. 
- Through method overriding, we can modify super class method according to requirements of sub class.

- Method Overriding in java is most useful features of java. 
- Through inheritance we can reuse already existed code and through method overriding we can modify that reused code according to our requirements. 
```
class SuperClass
{
    void methodOfSuperClass()
    {
        System.out.println("From Super Class");
    }
}
 
class SubClass extends SuperClass
{
    void methodOfSuperClass()
    {
        //SuperClass method is overrided
        //We can keep any tasks here according to our requirements.
        System.out.println("From Sub Class");
    }
}
 
public class MethodOverriding
{
    public static void main(String[] args)
    {
        SuperClass superclass = new SuperClass();
        superclass.methodOfSuperClass();         //Output : From Super Class
        SubClass subclass = new SubClass();
        subclass.methodOfSuperClass();          //Output : From Sub Class
    }
}
```

## Rules to be followed while overriding a method

1) Name of the overrided 

- Name of the overrided method must be same as in the super class. 
- You can’t change name of the method in subclass.

2) Return Type Of Overrided Method :

- The return type of the overrided method must be compatible with super class method. 
- If super class method has primitive data type as its return type, then overrided method must have same return type in sub class also. 
- If super class method has derived or user defined data type as its return type, then return type of sub class method must be of same type or its sub class. 
```
class SuperClass
{
    void firstMethodOfSuperClass()
    {
        System.out.println("From Super Class");
    }
 
    double secondMethodOfSuperClass()
    {
        return 0.0;
    }
 
    Object thirdMethodOfSuperClass()
    {
        return new Object();
    }
}
 
class SubClass extends SuperClass
{
    int firstMethodOfSuperClass()
    {
        //Compile time error, return type must be void not int
    }
 
    void secondMethodOfSuperClass()
    {
        //Complie time error, return type must be double not void
    }
 
    String thirdMethodOfSuperClass()
    {
        //No Compile time error,
        //return type is compatible with super class method, because
        //String is sub class of Object class
        return new String();
    }
}
```

### Visibility Of Overrided method

- You can keep same visibility or increase the visibility of overrided method but you can’t reduce the visibility of overrided methods in the subclass. 
- For example, default method can be overided as default or protected or public method but not as private.
```
class SuperClass
{
    protected void methodOfSuperClass()
    {
        System.out.println("From Super Class");
    }
}
 
class SubClass extends SuperClass
{
    private void methodOfSuperClass()
    {
        //Compile time error, can't reduce visibility of overrided method
        //here, visibility must be protected or public but not private or default
    }
}
```

- Visibility goes on decreasing from public to protected to default to private members.


### Arguments Of Overrided Methods 

- For method to be properly overrided, You must not change arguments of method in subclass. 
- If you change the number of arguments or types of arguments of overrided method in the subclass, then method will be overloaded not overrided.
```
class SuperClass
{
    void methodOfSuperClass()
    {
        System.out.println("From Super Class");
    }
}
 
class SubClass extends SuperClass
{
    //This class will have two methodOfSuperClass() methods.
    //one is from super class which takes no argument
    //and one is below method which takes one argument
    void methodOfSuperClass(int i)
    {
        System.out.println(i);
    }
}
 
public class MethodOverloading
{
    public static void main(String[] args)
    {
        SuperClass superclass = new SuperClass();
        superclass.methodOfSuperClass();         //Output : From Super Class
        SubClass subclass = new SubClass();
        subclass.methodOfSuperClass();          //Output : From Super Class
        subclass.methodOfSuperClass(10);       // Output : 10
    }
}
```

## Difference Between Method Overloading and Method Overriding

| Fields | Method Overloading | Method Overriding |
|:--------------:|:--------------:|:--------------:|
| Definition | When a class has more than one method with same name but with different arguments, then we call it as method overloading. | When a super class method is modified in the sub class, then we call this as method overriding. |
| Method Signature | Overloaded methods must have different method signatures.  That means they should differ at least in any one of these three things – Number of arguments, Types of arguments and order of arguments. But, they must have same name. | Overridden methods must have same method signature. I.e. you must not change the method name, types of arguments, number of arguments and order of arguments while overriding a super class method. |
| Return Types | Overloaded methods can have same or different return types. | The return type of the overridden method must be compatible with that of super class method. That means if super class method has primitive type as its return type, then it must be overridden with same return type. If super class method has derived type as its return type then it must be overridden with same type or its sub class type. |
| Visibility (private, public, protected and default) | Overloaded methods can have same visibility or different visibility. | While overriding a super class method either you can keep the same visibility or you can increase the visibility. But you can’t reduce it. |
| Static Context | Overloaded methods can be static or not static. It does not affect the method overloading. | You can’t override a static method. |
| Binding | Binding between method call and method definition happens at compile time (Static Binding). | Binding between method call and method definition happens at run time (Dynamic Binding). |
| Polymorphism | It shows static polymorphism. | It shows dynamic polymorphism. |
| Private methods | Private methods can be overloaded. | Private methods can’t be overridden. |
| Final Methods | Final methods can be overloaded. | Final methods can’t be overridden. |
| Class Requirement | For method overloading, only one class is required. I.e. Method overloading happens within a class. | For method overriding, two classes are required – super class and sub class. That means method overriding happens between two classes. |


#### Method Overloading Example

```
public class MainClass
{
    static String concateString(String s1, String s2)
    {
        return s1+s2;
    }
 
    static String concateString(String s1, String s2, String s3)
    {
        return s1+s2+s3;
    }
 
    static String concateString(String s1, String s2, String s3, String s4)
    {
        return s1+s2+s3+s4;
    }
 
    public static void main(String[] args)
    {
        concateString("ONE", "TWO");
 
        concateString("ONE", "TWO", "THREE");
 
        concateString("ONE", "TWO", "THREE", "FOUR");
    }
}
```

#### Method Overriding Example

```
class SuperClass
{
    void SuperClassMethod()
    {
        System.out.println("SUPER CLASS METHOD");
    }
}
 
class SubClass extends SuperClass
{
    @Override
    void SuperClassMethod()
    {
        System.out.println("SUPER CLASS METHOD IS OVERRIDDEN");
    }
}
```

