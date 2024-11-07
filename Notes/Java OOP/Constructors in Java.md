# Constructors in Java

1) Constructor Name

- Name of the constructor must be same as that of a class name. 
- If you give another name it will give compile time error. 
- If you give another name, it is neither a method because of no return type, nor constructor because name is different from class name.
```
class A
{
     A()
     {
         // Constructor of Class A
     }
     A1()
     {
         // Compile time error, It is neither a constructor nor a method
     }
}
```

2) Constructor Return Type

- Constructors must not have a return type. 
- If you keep return type for the constructor, it will be treated as another method.
- But compiler gives a warning saying that this method has a constructor name. 
- That means, it is legal to have method name same as constructor name or same as class name but it is not recommended.
```
class A
{
     A()
     {
         // Constructor of Class A, not having any return type.
     }
 
     void A()
     {
         // constructor having a return type, It will be treated as method but with a warning.
     }
}
```

3) Constructor in a Class

- Every class should have at least one constructor. 
- If you don’t write constructor for your class, compiler will give default constructor. 
- Default constructor is always public and it has no arguments (No-Arg Constructor).
```
class A
{
     // No Constructors written
}
```

Compiler will treat the above code as,
```
class A
{
    public A()
    {
        //   Constructor provided by the compiler.
    }
}
```

4) Private Constructor

- Constructor can be declared as private. 
- If you declare constructor as private, you can’t use it outside that class.
```
class A
{
     private A()
     {
          // Private Constructor
     }
 
     void methodOne()
     {
          //You can use private constructor inside the class
          A a1 = new A();
     }
}
 
class MainClass
{
     public static void main(String[] args)
     {
          //You can't use private constructor ouside the class like this
          // A a1 = new A();
     }
}
```

5) Constructor Overloading

- One class can have more than one constructors. 
- It is called Constructor Overloading. 
- Through constructor overloading, you can have multiple ways to create objects.
```
class A
{
     A()
     {
        // First Constructor
     }
 
     A(int i)
     {
        // Second Constructor
     }
 
    A(int i, int j)
    {
       // Third Constructor
    }
}
```

You can create the objects to the above class in three ways like below,
```
class MainClass
{
     public static void main(String[] args)
     {
          A a1 = new A();      //Using First Constructor
          A a2 = new A(10);    // Using Second Constructor
          A a3 = new A(10, 20);    // Using Third Constructor
     }
}
```

6) Duplicate Constructors

- Duplicate Constructors not allowed. 
- If you keep duplicate constructors, you will get compile time error.
```
class A
{
     A(int i)
     {
         // Duplicate Constructor
     }
 
     A(int i)
     {
        // Duplicate Constructor
     }
}
```

7) Name of Arguments in Constructor

- Multiple arguments of the constructors can’t have same name. 
- If the two arguments have the same name, you will get compile time error.
```
class A
{
     A(int i, int i)
     {
         // Duplicate Arguments Passed. It gives compile time error
     }
}
```

8) Access Modifiers for Constructor

- Only public, protected and private keywords are allowed before a constructor name. 
- If you keep any other keyword before a constructor name, it gives compile time error.
```
class A
{
     final A()
     {
         //Constructor can not be final
     }
     static A()
     {
         //Constructor can not be static
     }
     abstract A()
     {
        //Constructors can not be abstract
     }
}
```

9) super and this in Constructor

- First statement in a constructor must be either super() or this(). 
- If you put any other statements you will get compile time error.
- If you don’t include these statements, by default compiler will keep super() calling statement. 
- super() – It is a calling statement to default constructor of super class. 
- this()- it is a calling statement to constructor of the same class.
```
class A
{
     A()
     {
          //By Default, Compile will keep super() calling statement here.
          System.out.println("First Constructor");
     }
     A(int i)
     {
          //Compiler will not keep any statement here
          super();
          System.out.println("Second Constructor");
     }
     A(int i, int j)
     {
          //Compiler will not keep any statement here
          this();
          System.out.println("Third Constructor");
     }
     A(int i, int j, int k)
     {
          System.out.println("Fourth Constructor");
          // super(); It will give error if you keep super() here
     }
}
```

10) Recursive Constructor

Recursive constructor calling is not allowed.
```
class A
{
     A()
     {
          this();
          // It gives compile time error
     }
}
```

11) Cylic calling of constructors.

No Cylic calling of constructors.
```
class A
{
     A()
     {
          this(10);
          // It gives compile time error
     }
     A(int i)
     {
          this();
          // It gives compile time error
     }
}
```