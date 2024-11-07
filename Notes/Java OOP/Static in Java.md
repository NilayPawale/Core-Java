# Static in Java

- In Java, the static keyword is used in several different ways to define variables, methods, blocks, and even nested classes.
- Static variables, Static Initialization Block and Static Methods – these all are static components or static members of a class. 
- These static members are stored inside the Class Memory. 
- To access static members, you need not to create objects. 
- Directly you can access them with class name.

1) Static Variables

- Definition: A static variable (also called a class variable) belongs to the class rather than any object (instance) of the class. This means all instances of the class share the same static variable.
- Behavior: It gets memory only once, when the class is loaded, and it remains the same for all objects of the class.
- Use Case: When you want to have a value that should be shared across all objects of a class, like a counter for the number of objects created.
```
class Example {
    static int count = 0;  // static variable
    
    Example() {
        count++;  // Incrementing static variable
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();
        
        System.out.println(Example.count);  // Outputs 2, shared by both objects
    }
}
```

2) Static Methods

- Definition: A static method belongs to the class rather than an instance of the class. You can call static methods without creating an object of the class.
- Behavior: Static methods can access only static data members and can modify them. They cannot directly access non-static (instance) data members or methods.
- Use Case: You use static methods when a method doesn’t need to rely on instance variables (object data).
```
class MathOperations {
    static int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        int result = MathOperations.add(5, 10);  // No need to create an object
        System.out.println(result);  // Outputs 15
    }
}
```

3) Static Blocks

- Definition: A static block is used to initialize static data members before the main method or any other static method is run.
- Behavior: Static blocks are executed when the class is loaded, before any other code (including constructors).
- Use Case: You can use it to set up static variables or perform one-time class-level setup when the class is first loaded.
```
class Example {
    static int value;
    
    // Static block
    static {
        value = 100;  // Initializing static variable
        System.out.println("Static block executed");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Example.value);  // Outputs 100
    }
}
```

4) Static Nested Classes 

- Definition: A static nested class is a class that is nested inside another class and is declared static. It can be instantiated without an object of the outer class.
- Behavior: A static nested class cannot access non-static data or methods from the outer class directly.
- Use Case: Static nested classes are useful when the nested class doesn’t need a direct relationship with the outer class instance.
```
class OuterClass {
    static class NestedClass {
        static void display() {
            System.out.println("Inside static nested class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass.NestedClass.display();  // No need to create OuterClass object
    }
}
```

## Importatnt Points

1) Static Variables: Shared by all objects of the class.
2) Static Methods: Can be called without creating an object, but they can only access static variables or other static methods.
3) Static Blocks: Used to initialize static variables; runs when the class is loaded.
4) Static Classes: Nested classes that can be used without creating an instance of the outer class.

### Advantages of Static:

- Memory efficiency: Static members are created once per class.
- Utility methods: Static methods provide general-purpose functionality (like Math.sqrt()).

### Disadvantages:

- Limited access: Static methods cannot access instance variables.
- Coupling: Overuse of static can lead to tightly coupled code, making it harder to maintain.

## Difference Between static and non-static

### Variables

1) Static Variables:

- Shared across all objects of a class.
- Memory is allocated when the class is loaded (once), not when objects are created.
- Useful for data that should be consistent across all instances, like a counter.
```
class Counter {
    static int count = 0;  // Static variable
}

public class Main {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        
        obj1.count = 5;  // Changing static variable using obj1
        
        System.out.println(obj2.count);  // Output: 5 (shared by obj1 and obj2)
    }
}
```

2) Non-Static Variables:

- Each object of the class has its own copy.
- Memory is allocated when an object is created.
- Used for data that is specific to each instance.
```
class Person {
    int age;  // Non-static variable
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        
        person1.age = 30;
        person2.age = 25;
        
        System.out.println(person1.age);  // Output: 30
        System.out.println(person2.age);  // Output: 25 (each object has its own value)
    }
}
```

### Methods

1) Static Methods:

- Belong to the class, not to any particular object.
- Can be called without creating an object of the class.
- Can only directly access static variables or other static methods.
- Cannot access non-static variables or methods directly.
```
class MathUtils {
    static int square(int number) {  // Static method
        return number * number;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(MathUtils.square(5));  // Output: 25 (no object needed)
    }
}
```

2) Non-Static Methods:

- Belong to an object of the class.
- Can access both static and non-static variables and methods.
- Must be called on an object.
```
class Person {
    int age;  // Non-static variable
    
    void setAge(int age) {  // Non-static method
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(28);  // Call non-static method on an object
        
        System.out.println(person.age);  // Output: 28
    }
}
```

### Memory Allocation
1) Static:

- Allocated memory only once, when the class is loaded.
- Static members are stored in a part of memory called the method area or class area.

2) Non-Static:

- Allocated memory every time a new object is created.
- Non-static members are stored in the heap memory, specific to each object.

### Accessing

1) Static Members:

Accessed using the class name directly (or through an object, but this is discouraged).
```
class Example {
    static int count = 10;
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Example.count);  // Access using class name
    }
}
```

2) Non-Static Members:

Accessed through objects.
```
class Example {
    int value = 5;
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println(obj.value);  // Access using an object
    }
}
```

### When to Use Static vs Non-Static

1) Use Static:
- When the data or behavior is related to the class as a whole, rather than individual objects.
- For utility methods or constants, like Math.PI or Math.sqrt().

2) Use Non-Static:
- When the data or behavior is specific to each object and can vary between different objects.
- For example, properties like name, age, or color of an object.

### Difference Table

| Feature | Static | Non-Static |
|:--------------:|:--------------:|:--------------:|
| Belongs to | Class | Object (instance) |
| Memory | Shared by all instances | Separate for each instance |
| Access | Accessed via class name (or object) | Accessed via object |
| Variables | Common to all objects | Unique for each object |
| Methods | Can’t access non-static members directly | Can access both static and non-static members |
| When to Use | Class-wide data or utility functions | Object-specific data or behavior |

