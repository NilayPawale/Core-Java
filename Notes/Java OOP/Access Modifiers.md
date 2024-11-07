# Access Modifiers in Java

- Access modifiers in java are used to control the visibility of a field, method, class and constructor. 
- There are 4 access modifiers in java. They are : 
1) Private   
2) Default or Package  
3) Protected  
4) Public

## Private

1) Usage of Private members :

Private members of a class whether it is a field or method or constructor can not be accessed outside the class.

2) Inheritance of Private Members :

Private members will not be inherited to sub class.

- Class can not be a private except inner classes. 
- Inner classes are nothing but again members of outer class. 
- So members of a class (field, method, constructor and inner class) can be private but not the class itself.
- We can’t create sub classes to that class which has only private constructors.

private Access Modifier Examples:
```
class A
{
    private int i;
 
    private void methodOfClassA()
    {
        //Private Method
        System.out.println(i);  //Private field can be used within class
        B b = new B();          //Private inner class can be used within class
    }
 
    private class B
    {
      //Private Inner Class
    }
}
 
class C extends A
{
    void methodOfClassC()
    {
        //System.out.println(i);  Private member can not be inherited
        A a = new A();
        //System.out.println(a.i);     Private field can not be used outside the class
        //a.methodOfClassA();          Private method can not be used outside the class
        //A.B b = new A.B();           Private inner class can not be used outside the class
    }
}
```

```
private class A
{
     //Outer class Can not be private
}
```

```
class A
{
    private A()
    {
        //Private Constructor
    }
    private A(int i)
    {
        //Private constructor
    }
}
 
class B extends A
{
    //Can't create subclass to the class
    //which has only private constructors
}
```

## Default or Package or No-Access Modifiers

1) Usage of Private members :

Default members or members with No-Access modifiers are accessed or visible within the package only. It applies to outer classes also.

2) Inheritance of Private Members :

Default members can be inherited to sub classes within package.

```
package pack1;
class A
{
    int i;
 
    A()
    {
        //Constructor with default modifier
    }
 
    void methodOfClassA()
    {
        //Method with default access modifier
        System.out.println(i);
        B b = new B();
    }
 
    class B
    {
      //Inner Class with default access modifier
    }
}
 
class C extends A
{
    void methodOfClassC()
    {
        System.out.println(i);        //Default field can be inherited within package 
 
        A a = new A();
        System.out.println(a.i);     //Default field can be used within the package
        a.methodOfClassA();          //Default method can be used within the package
        A.B b = new A.B();           //Default inner class can be used within the package
    }
}
 
package pack2;
//import pack1.A;      Class A with default access modifier not visible outside the package
 
/*class D extends A      Default Class can not have sub class outside the package
{
    void methodOfClassD()
    {
        System.out.println(i);        Default field can not be inherited outside package 
 
        A a = new A();           Can't use constructor with default access modifier outside the package
        System.out.println(a.i);     Default field can not be used outside the package
        a.methodOfClassA();          Default method can not be used outside the package
        A.B b = new A.B();           Default inner class can not be used outside the package
    }
}*/
```

## Protected

1) Usage of Private members :

Protected member can be used within the package only.

2) Inheritance of Private Members :

Protected Member can be inherited to any sub classes.

```
package pack1;
 
public class A
{
    protected int i;
 
    protected void methodOfClassA()
    {
        //Protected method
        System.out.println(i); //Protected field can be used within class
        B b = new B();         //Protected Inner Class can be used within class.
    }
 
    protected class B
    {
      //Protected Inner Class
    }
}
 
class C extends A
{
    void methodOfClassC()
    {
        System.out.println(i);        //Protected field can be inherited to any sub class 
 
        A a = new A();
        System.out.println(a.i);     //Protected field can be used within the package
        a.methodOfClassA();          //Protected method can be used within the package
        A.B b = new A.B();           //Protected Inner Class can be used within the package
    }
}
 
package pack2;
import pack1.A;  
 
class D extends A
{
    void methodOfClassD()
    {
        System.out.println(i);        //Protected field can be inherited to any sub class 
 
        A a = new A();
        //System.out.println(a.i);     Protected field can not be used outside the package
        //a.methodOfClassA();          Protected method can not be used outside the package
        //A.B b = new A.B();           Protected inner class can not be used outside the package
    }
}
```

- Outer class can not be protected.
- We can create sub classes to a class which has only protected constructors but we can’t create objects to that class outside the package.

## Public

1) Usage of Private members :

Public members can be used anywhere.

2) Inheritance of Private Members :

Public members can be inherited to any sub class.

```
package pack1;
 
public class A
{
    public int i;
 
    public void methodOfClassA()
    {
        //public method
        System.out.println(i); //public field can be used anywhere
        B b = new B();         //public Inner Class can be used anywhere.
    }
 
    public class B
    {
      //public Inner Class
    }
}
 
class C extends A
{
    void methodOfClassC()
    {
        System.out.println(i);        //public field can be inherited to any sub class 
 
        A a = new A();
        System.out.println(a.i);     //public field can be used anywhere
        a.methodOfClassA();          //public method can be used anywhere
        A.B b = new A.B();           //public Inner Class can be used anywhere.
    }
}
 
package pack2;
import pack1.A;  
 
class D extends A
{
    void methodOfClassD()
    {
        System.out.println(i);        //public field can be inherited to any sub class 
 
        A a = new A();
        System.out.println(a.i);     //Public field can be used anywhere
        a.methodOfClassA();          //Public method can be used anywhere
        A.B b = new A.B();           //Public inner class can be used anywhere
    }
}
```

## Summery

| Access Modifier | Usage or Access or Visibility | Inheritance |
|:--------------:|:--------------:|:--------------:|
| private | Within Class Only | Can not be inherited |
| Default or No-Access Modifier	 | Within Package Only | Can be inherited to sub class within package |
| Protected | Within Package Only | Can be inherited to any subclass |
| Public | Anywhere | To any subclass |