# super Keyword

- super keyword is used to access super class members inside the sub class. 
- Using super keyword, we can access super class methods, super class fields and super class constructors in the sub classes.

For example, following program calls super class constructor, field and method from sub class.
```
class SuperClass
{
    int i;    //Field
 
    SuperClass(int j)
    {
        System.out.println("Super Class Constructor");
    }
 
    void methodOfSuperClass()     //method
    {
        System.out.println("From method of super class");
    }
}
 
class SubClass extends SuperClass
{
    SubClass()
    {
        super(10);
        //Calling statement to super class constructor
    }
 
    void methodOfSubClass()
    {
        System.out.println(super.i);  //super class field is accessed
        super.methodOfSuperClass();  // super class method is called
        System.out.println("From method of sub class");
    }
}
```

- super class constructor is called by super() calling statement. 
- You can’t use super() calling statement outside the constructor. 
- By default, super() calling statement is the first statement in any constructor. 

### When to Use super keyword ?

- If you want same implementation as that of super class method in the sub class, but want to add some more extra statements to it, in such cases, super keyword will be very useful. 
- First call the super class method using super keyword and after it add extra statements according to requirements in the sub class method.
```
class SuperClass
{
    void methodOfSuperClass()
    {
        //Some task
    }
}
 
class SubClass extends SuperClass
{
    void methodOfSubClass()
    {
        super.methodOfSuperClass();  // super class method is called
 
        //add some other extra statements fulfilling the requirements
    }
 
    //you can implement same task by overriding super class method also
 
    void methodOfSuperClass()
    {
        //super class method is overrided.
 
        super.methodOfSuperClass();
 
        //add some other extra statements fulfilling the requirements
 
    }
}
```

# this Keyword

- this keyword is used to access other members of the same class. 
- Using this keyword, you can access methods, fields and constructors of the same class within the class. 
- this refers to current instance of the class.
```
class AnyClass
{
    int i;
 
    AnyClass()
    {
        System.out.println("First Constructor");
    }
 
    AnyClass(int j)
    {
        this();    //calling statement to First Constructor
        System.out.println("Second Constructor");
    }
 
    void methodOne()
    {
        System.out.println("From method one");
    }
 
    void methodTwo()
    {
        System.out.println(this.i);  //Accessing same class field
        this.methodOne();      //Accessing same class method
    }
}
```

- this() is the calling statement to same class constructor. 
- It must be used within constructor only. 
- If it is used, it must be the first statement in the constructor. 


## Important Points

- You can’t use super and this keywords in a static method and in a static initialization block even though you are referring static members.
```
class SuperClassOne
{
    int i;      //Non-Static member
 
    static void methodOne()
    {
        //static method
        System.out.println("From Super Class");
    }
}
 
class SubClassOne extends SuperClassOne
{
    static
    {
        System.out.println(super.i);
        this.methodTwo();
 
        //Above statements give compile time error
        //You can't use super and this keywords inside SIB
    }
 
    static void methodTwo()
    {
        super.methodOne();
        this.methodOne();
 
        //These also give compile time error
        //You can't use super and this keywords inside static method
        //even though you are accessing static methods
    }
}
```

- You should call super() and this() calling statements inside the constructors only and they must be first statement in the constructors.
```
class SuperClassOne
{
    void methodOne()
    {
        System.out.println("From Super Class");
    }
}
 
class SubClassOne extends SuperClassOne
{
    public SubClassOne()
    {
        System.out.println("constructors");
        super();
        //compile time error
        //super() calling statement must be first statement in constructor
    }
    void methodTwo()
    {
        super();
        this();
        //compile time error
        //you should call super() and this()
        //calling statements only in constructors.
    }
}
```