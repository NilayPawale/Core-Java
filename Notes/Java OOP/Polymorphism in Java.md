# Polymorphism in Java

- Polymorphism is one of the core concepts of Object-Oriented Programming (OOP), along with inheritance, encapsulation, and abstraction. 
- The term "polymorphism" literally means "many shapes" or "many forms," and in Java, it allows one interface to be used for a general class of actions. 
- It refers to the ability of an object to take on many forms.
- Polymorphism in java refers to any entity whether it is an operator or a constructor or any method which takes many forms or can be used for multiple tasks either while compiling or while running a java program.

In Java, polymorphism occurs in two ways:

1) Static Polymorphism or Compile-Time Polymorphism (Method Overloading)
2) Dynamic Polymorphism or Run-Time Polymorphism (Method Overriding)

## Static Polymorphism

- Any entity which shows polymorphism during compile time is called static polymorphism. 
- Operator Overloading, Constructor Overloading and method overloading are best examples of static polymorphism. 
- Because, they show polymorphism during compilation.
- In static polymorphism, object used is determined during compilation itself. So, it is called static binding or Early Binding.

1) Operator Overloading 

- For example, Operator ‘+’ can be used to add two numbers and also can be used to concatenate two strings. 
- It is called operator overloading. 
- ‘+’ is the only operator in java which is used for operator overloading.

2) Constructor Overloading

- We can include multiple constructors in a class. 
- This is called constructor overloading. 
- Through constructor overloading, we can create objects to the class in multiple ways. 
- This shows the polymorphism.

3) Method Overloading

- In Method overloading, multiple methods have the same name but differ in the number or type of parameters.
- We can have different forms of same method in the same class. 
- This is called method overloading. 
- Through method overloading we can perform different tasks through different forms of the same method. 
- This shows the polymorphism.

```
class Calculator {

    // Method with 2 integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with 3 integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double parameters
    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calls the method with 2 integer parameters
        System.out.println(calc.add(10, 20)); // Output: 30

        // Calls the method with 3 integer parameters
        System.out.println(calc.add(10, 20, 30)); // Output: 60

        // Calls the method with 2 double parameters
        System.out.println(calc.add(10.5, 20.5)); // Output: 31.0
    }
}
```

Here, the add method is overloaded because the method name is the same, but the parameters differ. The correct method is chosen at compile time, based on the arguments provided.

Super class reference variable can refer to objects of its sub class. This also shows polymorphism. For example,
```
class A
{
     //Some Statements
}
class B extends A
{
     //Some Statements
}
class C extends B
{
    //Some Statements
}
 
public class D
{
    public static void main(String[] args)
    {
        A a = new A();  //A-Class variable refers to A-Class object
        a = new B();    //A-Class variable refers to B-Class object
        a = new C();    //A-Class variable refers to C-Class object
    }
}
```

- In the above example, ‘a’ is Class A-type reference variable which can be used to refer objects of A-type, B-type or C-type. 
- Because, B-type and C-type are sub class of A-type. This also shows the polymorphism.


## Dynamic Polymorphism

- Any entity which shows polymorphism during run time is called dynamic polymorphism. 
- Method Overriding is the best example of dynamic polymorphism. 
- It is also called dynamic binding or late binding, because type of the object used will be determined at run time only.
- In run-time polymorphism, also known as method overriding, a subclass provides a specific implementation of a method that is already defined in its superclass.

Key Features:

- The method in the subclass must have the same name, return type, and parameters as the method in the superclass.
- The method that is invoked is determined at run time, based on the object's type (not the reference type).
```
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference, Animal object
        Animal myDog = new Dog();       // Animal reference, Dog object
        Animal myCat = new Cat();       // Animal reference, Cat object

        myAnimal.sound(); // Output: Animal makes a sound
        myDog.sound();    // Output: Dog barks
        myCat.sound();    // Output: Cat meows
    }
}
```

In this case, although the reference type is Animal, the method call is determined at run time based on the actual object type (Dog or Cat). This is an example of method overriding.

### Difference Between Static Polymorphism and Dynamic Polymorphism

| Aspect | Static Polymorphism | Dynamic Polymorphism |
|:--------------:|:--------------:|:--------------:|
| Other Name | Compile-Time Polymorphism | Run-Time Polymorphism |
| Method | Method Overloading | Method Overriding |
| Resolution Time | Compile Time | Run Time |
| Parameter Changes | Methods differ by parameters | Methods have identical signatures |
| Flexibility | Less flexible | More flexible |


### Advantages of Polymorphism

1) Code Reusability: You can reuse methods with different types or numbers of parameters.
2) Improved Maintainability: Changes to a base class method are automatically reflected in derived classes.
3) Extensibility: It allows easy extension of programs by adding new classes that implement existing interfaces.