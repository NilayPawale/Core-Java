# Interface in Java

- Interfaces in java are very much similar to abstract classes but interfaces contain only abstract methods. 
- Abstract classes may contain both abstract methods as well as concrete methods. 
- But interfaces must contain only abstract methods. 
- Concrete methods are not allowed in interfaces. 
- Therefore, Interfaces show 100% abstractness.

1) interface and implements Keyword

Interfaces are declared with keyword ‘interface‘ and interfaces are implemented by the class using ‘implements‘ keyword.
```
interface InterfaceClass
{
    //Some Abstract methods
}
 
class AnyClass implements InterfaceClass
{
    //Use 'implements' while implementing Interfaces
    //Don't use 'extends'
}
```

2) Methods in Interface

- Interfaces should contain only abstract methods. 
- Interfaces should not contain a single concrete method.
```
interface InterfaceClass
{
    abstract void abstractMethodOne();  //abstract method
 
    abstract void abstractMethodTwo();  //abstract method
 
    void concreteMethod()
    {
        //Compile Time Error.
        //Concrete Methods are not allowed in interface
    }
}
```

3) Members in Interface

Interface can have two types of members.  
- Fields     
- Abstract Methods.
```
interface InterfaceClass
{
    int i = 0;      //Field
 
    abstract void abstractMethodOne();  //abstract method
 
    abstract void abstractMethodTwo();  //abstract method
}
```

4) Access Modifiers in Interface

- By default, Every field of an interface is public, static and final. 
- You can’t use any other modifiers other than these three for a field of an interface.
```
interface InterfaceClass
{
    int i = 0;
    //By default, field is public, static and final
 
    //Following statements give compile time errors
 
    private double d = 10;
    protected long l = 15;
 
    //You can't use any other modifiers other than public, static and final
}
```

5) Changes in Values of Interface

- You can’t change the value of a field once they are initialized. 
- Because they are static and final. 
- Therefore, sometimes fields are called as Constants. 
```
interface InterfaceClass
{
    int i = 0;
}
 
class AnyClass implements InterfaceClass
{
    void methodOne()
    {
        //Following statement gives compile time error.
 
        InterfaceClass.i = 10;
 
        //final field can not be re-assigned
    }
}
```

6) Access Modifiers of Methods in Interface

By default, All methods of an interface are public and abstract.
```
interface InterfaceClass
{
    void abstractMethodOne();  //Abstract method
 
    void abstractMethodTwo();  //Abstract Method
 
        //No need to use abstract keyword,
        //by default methods are public and abstract
}
```

7) Like classes, for every interface .class file will be generated after compilation.

8) Implementing interface methods inside a class

- While implementing any interface methods inside a class, that method must be declared as public. 
- Because, according to method overriding rule, you can’t reduce visibility of super class method. 
- By default, every member of an interface is public and while implementing you should not reduce this visibility.
```
interface InterfaceClass
{
    void methodOne();
}
 
class AnyClass implements InterfaceClass
{
    void methodOne()
    {
        //It gives compile time error.
        //Interface methods must be implemented as public
    }
}
```

9) Interface is abstract

By default, Interface itself is not public but by default interface itself is abstract like below,
```
abstract interface InterfaceClass
{
    //By default interface is abstract
    //No need to use abstract keyword
}
```

10) Static Initialization Block and Instance Initialization Block in Interface

SIB – Static Initialization Block and IIB – Instance Initialization Block are not allowed in interfaces.
```
interface InterfaceClassOne
{
    static
    {
        //compile time error
        //SIB's are not allowed in interfaces
    }
 
    {
        //Here also compile time error.
        //IIB's are not allowed in interfaces
    }
 
    void methodOne();  //abstract method
}
```

11) Class implementing Interfaces

- As we all know that, any class in java can not extend more than one class. 
- But class can implement more than one interfaces. 
- This is how multiple inheritance is implemented in java.
```
interface InterfaceClassOne
{
    void methodOne();
}
 
interface InterfaceClassTwo
{
    void methodTwo();
}
 
class AnyClass implements InterfaceClassOne, InterfaceClassTwo
{
    public void methodOne()
    {
        //method of first interface is implemented
    }
 
    //method of Second interface must also be implemented.
    //Otherwise, you have to declare this class as abstract.
 
    public void methodTwo()
    {
        //Now, method of Second interface is also implemented.
        //No need to declare this class as abstract
    }
}
```

## Differnce Between Abstract Classes and Interfaces

| Feature | Abstract Class | Interface |
|:--------------:|:--------------:|:--------------:|
| Inheritance | A class can extend only one abstract class. | A class can implement multiple interfaces. |
| Method Implementation | Can have both abstract and non-abstract methods. | Before Java 8, methods were purely abstract; Java 8+ allows default methods. |
| Fields | Can have fields (instance variables). | Cannot have instance variables, only constants. |
| Constructor | Can have constructors. | Cannot have constructors. |


## Real-Life Example of Abstraction in Java

- Imagine a Payment system where different payment methods are used (Credit Card, PayPal, etc.). 
- The implementation for each payment method might vary, but we can abstract the common behavior into an abstract class or an interface.
```
// Interface for Payment
interface Payment {
    void pay(double amount);
}

// PayPal implementation of Payment
class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

// Credit Card implementation of Payment
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment payment1 = new PayPalPayment();
        payment1.pay(100.0);  // Outputs: Paid 100.0 using PayPal.

        Payment payment2 = new CreditCardPayment();
        payment2.pay(200.0);  // Outputs: Paid 200.0 using Credit Card.
    }
}
```

- In this example, the goal of the Payment interface is to ensure that any payment method can implement the pay(double amount) method, regardless of how the actual payment is processed.
- The two classes PayPalPayment and CreditCardPayment are concrete implementations of the Payment interface. They each provide their own version of the pay method to process payments using PayPal and Credit Cards, respectively.

#### Benefits of Abstraction in this Example

1) Hides Implementation Details:

- The user (in this case, the Main class) does not need to know how PayPal or credit card payments are processed internally. 
- It only needs to know that it can call the pay method to complete a payment.

2) Increases Flexibility and Extensibility:

- Since the Payment interface defines a general contract, you can easily add new payment methods (e.g., BankTransferPayment, CryptoPayment) by simply implementing the Payment interface without modifying existing code. 
- This makes the system more flexible and easier to extend in the future.

3) Promotes Code Reusability:

- Any code that works with the Payment interface can work with any future payment method that implements Payment, without any modifications. 
- This reduces code duplication and increases reusability.

4) Encourages Loose Coupling:

- By coding to an interface (Payment), the Main class is loosely coupled with the specific payment implementations. 
- It only depends on the abstract interface, not the concrete implementations. 
- This improves maintainability since changes in one payment method do not affect the Main class.

#### Coclusion

- Abstraction in Java allows you to focus on what an object does rather than how it does it. 
- The Payment interface abstracts the concept of making a payment, while the concrete classes (PayPalPayment, CreditCardPayment) implement the specific details of how these payments are processed. 
- This separation of concerns makes the code more flexible, maintainable, and easier to extend in the future.