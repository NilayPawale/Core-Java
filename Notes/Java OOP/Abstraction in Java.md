# Abstraction In Java

- Abstraction is one of the four main principles of Object-Oriented Programming (OOP), along with encapsulation, inheritance, and polymorphism. 
- It is the process of hiding the implementation details and showing only the functionality to the user. 
- In simpler terms, abstraction helps you focus on what an object does rather than how it does it.
- Think of it like driving a car: you only need to know how to operate the steering wheel, pedals, and gear, without needing to understand how the engine or other internal systems work.

## Key Concepts of Abstraction 

1) Abstarct Classes
2) Abstarct Methods
3) Interfaces

1) Abstarct Classes

- An abstract class in Java is a class that cannot be instantiated on its own (you cannot create an object of an abstract class).
- It may contain abstract methods (methods without a body) that must be implemented by its subclasses.
- An abstract class can also contain non-abstract methods (methods with a body) that can provide default behavior to the subclasses.

2) Abstarct Methods

- These are methods declared without an implementation.
- Subclasses must override these methods to provide the actual implementation.

3) Interface

- Interfaces provide another way to achieve abstraction in Java.
- They are similar to abstract classes but are more flexible because a class can implement multiple interfaces (while it can extend only one abstract class).
- All methods in an interface are abstract by default (in earlier versions of Java), though newer versions allow default methods.

## Syntax for Abstarct Class and Abstract Methods
```
// Abstract Class Example
abstract class Vehicle {
    // Abstract method
    abstract void startEngine();
    
    // Non-abstract method
    void stopEngine() {
        System.out.println("Engine stopped");
    }
}

// Subclass that implements the abstract method
class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.startEngine();  // Outputs: Car engine started
        myCar.stopEngine();   // Outputs: Engine stopped
    }
}
```

## Benefits of Abstraction

1) Simplifies complex systems: By using abstraction, we can break down complex real-world systems into manageable, simpler components.
2) Improves code maintainability: By abstracting away details, it becomes easier to update and maintain the code.
3) Increases reusability: Abstract classes and interfaces allow for more reusable code by defining common behavior for multiple subclasses.
4) Enhances security: Implementation details are hidden from the user, reducing the risk of unintended interference.


## Abstract Classes

- Abstract classes contain abstract methods so that they can be implemented in sub classes according to their requirements. 
- They are also called as incomplete classes as they have some unimplemented abstract methods.

1) Using abstract Keyword

- Abstract classes and abstract methods are declared using ‘abstract‘ keyword. 
- We can’t create objects to those classes which are declared as abstract. 
- But, we can create objects to sub classes of abstract class, provided they must implement abstract methods.
```
abstract class AbstractClass
{
    abstract void abstractMethod();
}
 
class ConcreteClass extends AbstractClass
{
    void abstractMethod()
    {
        System.out.println(&quot;Abstract Method Implemented&quot;);
    }
}
 
public class Abstraction
{
    public static void main(String[] args)
    {
        //AbstractClass A = new AbstractClass();  Can't create objects to Abstract class
        ConcreteClass C = new ConcreteClass();
        //ConcreteClass implements abstract method,
        //so we can create object to ConcreteClass
        AbstractClass A1 = C;
        //ConcreteClass object is auto-upcasted to AbsractClass
    }
}
```

2) Abstract Methods

The methods which are not implemented or which don’t have definitions must be declared with ‘abstract’ keyword and the class which contains it must be also declared as abstract.
```
// It gives compile time error
class AbstractClass
{
    void abstractMethod();  //This method must be declared as abstract or must be defined
    abstract void abstractMethod();  //The Class must be also declared as abstract
}
 
//      *****   *****     *****   *****
// This is OK
abstract class AbstractClass
{
    abstract void abstractMethod();
}
```

3) Abstract class and methods

- It is not compulsory that abstract class must have abstract methods. 
- It may or may not have abstract methods. 
- But the class which has at least one abstract method must be declared as abstract.
```
abstract class AbstractClass
{
    void methodOne()
    {
        //Concrete Method
    }
    //No Abstract methods but class is abstract
}
```

4) Objects of Abstract Class

You can’t create objects to abstract class even though it does not contain any abstract methods.
```
abstract class AbstractClass
{
    void methodOne()
    {
        //Concrete Method
    }
 
    void methodTwo()
    {
        //Concrete Method
    }
}
 
public class Abstraction
{
    public static void main(String[] args)
    {
        AbstractClass a = new AbstractClass();  //Compile time error
        //You can't create objects to AbstractClass
        //even though it does not contain any abstract methods.
    }
}
```

5) Methods in Abstract Class

Abstract Class can be a combination of concrete and abstract methods.
```
abstract class AbstractClass
{
    void methodOne()
    {
        //Concrete Method
    }
 
    void methodTwo()
    {
        //Concrete Method
    }
 
    abstract void methodThree();  //Abstract Method
 
    abstract void methodFour();  //Abstract Method
}
```

6) Implementation of Abstract Methods

- Any class extending an abstract class must implement all abstract methods. 
- If it does not implement, it must be declared as abstract.
```
abstract class AbstractClass
{
    abstract void abstractMethodOne();  //Abstract Method
 
    abstract void abstractMethodTwo();  //Abstract Method
}
 
class ConcreteClass extends AbstractClass
{
    void abstractMethodOne()
    {
        //abstractMethodOne() is implemented
    }
 
    //This class must implement second abstract method also,
    //otherwise, this class has to be declared as abstract
 
    void abstractMethodTwo()
    {
        //abstractMethodTwo() is also implemented.
        //No need to declare this class as abstract
    }
}
```

7) Constructors in Abstract Class

- Inside abstract class, we can keep any number of constructors. 
- If you are not keeping any constructors, then compiler will keep default constructor.
```
abstract class AbstractClass
{
    AbstractClass()
    {
        //First Constructor
    }
 
    AbstractClass(int i)
    {
        //Second Constructor
    }
 
    abstract void abstractMethodOne();  //Abstract Method
}
```

8) Can Abstract Classes be Private ?

- Abstract methods can not be private. 
- Because, abstract methods must be implemented somehow in the sub classes. 
- If you declare them as private, then you can’t use them outside the class.
```
abstract class AbstractClass
{
    private abstract void abstractMethodOne();
    //Compile time error, abstract method can not be private.
}
```

9) Can Constructors be declared as abstract ?

Constructors and fields can not be declared as abstract.
```
abstract class AbstractClass
{
    abstract int i;
    //Compile time error, field can not be abstract
 
    abstract AbstractClass()
    {
        //Compile time error, constructor can not be abstract
    }
}
```

10) Can Abstract Methods be Static ?

Abstract methods can not be static.
```
abstract class AbstractClass
{
    static abstract void abstractMethod();
    //Compile time error, abstract methods can not be static
}
```


## Summery for Abstraction

- Abstraction is essential in Java because it simplifies complex systems and hides unnecessary details from the user. 
- By using abstract classes and interfaces, Java makes it easier to manage large projects, improve maintainability, and ensure that only the essential details are exposed to the user.